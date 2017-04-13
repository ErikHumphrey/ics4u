using System;
using System.Drawing;
using System.Windows.Forms;

namespace SquirrelSnatcher
{
    public partial class frmSquirrelSnatcher : Form
    {
        String gameStatus;

        int timeLeft;
        int score;
        Graphics gamePanel;

        int handW, handH, handY;
        const int handDeltaY = 5; // Choose how much to move the hand with each key/button press

        int holeW, holeH, holeY;
        int squirrelW, squirrelH, squirrelX, squirrelY;
        Random rnd = new Random();

        int squirrelSpeed;

        string handDirection = "Neutral";

        public frmSquirrelSnatcher()
        {
            InitializeComponent();
        }

        private void frmSquirrelsFromTheSky_Load(object sender, EventArgs e)
        {
            holeW = picHole.Width;
            holeH = picHole.Height;
            squirrelW = picSquirrel.Width;
            squirrelH = picSquirrel.Height;
            handW = picHand.Width;
            handH = picHand.Height;
            lblDifficultyLevel.Text = "1";
            gameStatus = "Initial";
            gamePanel = pnlGame.CreateGraphics();
            lblInstructions.Text = "Squirrel Snatcher";
            lblInstructions.Text += "\r\n\r\nSquirrels are coming out of their holes in the ground to eat your garden!";
            lblInstructions.Text += "\r\n\r\nIn this game, your objective is to snatch as many squirrels as possible.";
            lblInstructions.Text += "\r\n\r\nThe arrow keys (8, 2) on the numeric keypad move the glove up and down to catch squirrels.";
            lblInstructions.Text += "\r\n\r\nYou can also left-click to move the glove down or right-click to move the glove up.";
            lblInstructions.Text += "\r\n\r\nUse the controls on the left to change the difficulty or start playing!";
        }

        private void frmSquirrelSnatcher_KeyDown(object sender, KeyEventArgs e)
        {
            // Check for up or down numpad arrow key to move the Hand
            if ((int)e.KeyCode == 104)
            {
                handDirection = "Up";
            }
            else if ((int)e.KeyCode == 98)
            {
                handDirection = "Down";
            }
        }

        private void frmSquirrelSnatcher_KeyUp(object sender, KeyEventArgs e)
        {
            // Key released
            handDirection = "Neutral";
        }

        // Open a dialogue containing image credits for the game 
        private void btnShowCredits_Click(object sender, EventArgs e)
        {
            Credits.frmCredits dlgCredits = new Credits.frmCredits();
            dlgCredits.ShowDialog();
        }

        private void tmrGameTime_Tick(object sender, EventArgs e)
        {
            timeLeft -= 15;
            DisplayTimeScore();
            // Move squirrel
            RemoveSquirrel();
            gamePanel.DrawImage(picSquirrel.Image, squirrelX += 5, squirrelY, squirrelW, squirrelH);

            // Move hand
            if (handDirection == "Up")
            {
                handY -= handDeltaY;
                RemoveHand();
                gamePanel.DrawImage(picHand.Image, 762, handY -= handDeltaY, handW, handH);
                pnlGame.Refresh();
            }
            else if (handDirection == "Down")
            {
                handY += handDeltaY;
                RemoveHand();
                gamePanel.DrawImage(picHand.Image, 762, handY += handDeltaY, handW, handH);
                pnlGame.Refresh();
            }
        }

        private void RemoveSquirrel()
        {
            gamePanel.FillRectangle(Brushes.MediumSeaGreen, squirrelX, squirrelY, squirrelW, squirrelH);
        }

        private void pnlGame_Paint(object sender, PaintEventArgs e)
        {
            if (handDirection != "Neutral")
            {
                e.Graphics.DrawImage(picHand.Image, 762, handY, handW, handH);
            }
        }

        private void RemoveHand()
        {
            gamePanel.FillRectangle(Brushes.MediumSeaGreen, 762, handY, handW, handH);
        }

        private void btnDifficultyDown_Click(object sender, EventArgs e)
        {
            // Decrease difficulty
            lblDifficultyLevel.Text = (Int32.Parse(lblDifficultyLevel.Text) - 1).ToString();
            // Hide button to prevent difficulty from being decreased beyond 1
            btnDifficultyUp.Visible = true;
            if (Int32.Parse(lblDifficultyLevel.Text) == 1)
                btnDifficultyDown.Visible = false;
        }

        private void btnDifficultyUp_Click(object sender, EventArgs e)
        {
            // Increase difficulty
            lblDifficultyLevel.Text = (Int32.Parse(lblDifficultyLevel.Text) + 1).ToString();
            // Hide button to prevent difficulty from being increased beyond 10
            btnDifficultyDown.Visible = true;
            if (Int32.Parse(lblDifficultyLevel.Text) == 10)
                btnDifficultyUp.Visible = false;
        }

        // Update the displayed values for remaining time and squirrels caught
        private void DisplayTimeScore()
        {
            lblTimeRemaining.Text = Convert.ToInt32(timeLeft / 1000).ToString();
            lblSquirrelsCount.Text = score.ToString();
        }

        private void PositionHoleAndSquirrel()
        {
            holeY = rnd.Next(0, pnlGame.Height - holeH);
            gamePanel.DrawImage(picHole.Image, 0, holeY, holeW, holeH);
            squirrelY = Convert.ToInt32(holeY + 0.01 * (holeH - squirrelY));
            squirrelX = holeY;
            gamePanel.DrawImage(picSquirrel.Image, squirrelX, squirrelY, squirrelW, squirrelH);
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            if (btnStart.Text == "Play")
            {
                // Play button clicked
                gameStatus = "Playing";
                gamePanel.Clear(Color.MediumSeaGreen);
                lblInstructions.Visible = btnDifficultyUp.Visible = btnDifficultyDown.Visible = false;
                btnStart.Text = "Give up";

                // Set squirrel speed based on difficulty
                squirrelSpeed = Int32.Parse(lblDifficultyLevel.Text) + 3;
                // tmrGameTime.Interval = squirrelSpeed*1000;

                // Reset time and score
                timeLeft = 30000; // Milliseconds remaining
                score = 0;

                // Start time
                tmrGameTime.Start();
                DisplayTimeScore();
                PositionHoleAndSquirrel();
            }
            else if (btnStart.Text == "Give up")
            {
                this.Close(); // Close the program
            }
        }
    }
}
