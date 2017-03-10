// Erik Humphrey
// Gr. 12 C# Project 02: Balloon Pop
// Game where player controls a pin that pops balloons cascading down the screen
// Submitted March 9th, 2017

using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _02_BalloonPop
{
    public partial class frmBalloonPop : Form
    {
        int balloonSize;
        int[] balloonX = new int[5];
        int[] balloonY = new int[5];
        int[] balloonSpeed = new int[5];
        int pinSize;
        int pinX;
        int score;
        int timeLeft = 30;

        const string gameOverText = "GAME OVER";

        Graphics myGraphics;
        Brush blankBrush;
        Random myRandom = new Random();

        public frmBalloonPop()
        {
            InitializeComponent();
        }

        private void frmBalloonPop_Load(object sender, EventArgs e)
        {
            int x;
            // Have the balloons spread across the panel with 20-pixel borders
            balloonSize = (int)((pnlGameView.Width - 6 * 20) / 5);

            x = 10;
            for (int i = 0; i < 5; i++)
            {
                balloonX[i] = x;
                x = x + balloonSize + 20;
            }
            // Make pin half the balloon size 
            pinSize = (int)(balloonSize / 2);

            myGraphics = pnlGameView.CreateGraphics();
            blankBrush = new SolidBrush(pnlGameView.BackColor);
            // Give form focus
            this.Focus();
        }

        private void frmBalloonPop_FormClosing(object sender, FormClosingEventArgs e)
        {
            myGraphics.Dispose();
            blankBrush.Dispose();
        }

        private void frmBalloonPop_KeyDown(object sender, KeyEventArgs e)
        {
            // Erase arrow at old location
            myGraphics.FillRectangle(blankBrush, pinX, pnlGameView.Height - pinSize, pinSize, pinSize);
            // Check for left and right keys and compute arrow position
            if (e.KeyCode == Keys.A)
            {
                pinX -= 5;
            }
            else if (e.KeyCode == Keys.D)
            {
                pinX += 5;
            }
            // Position arrow
            myGraphics.DrawImage(picPin.Image, pinX, pnlGameView.Height - pinSize, pinSize, pinSize);
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            // Close the program
            this.Close();
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            if (btnStart.Text == "Start")
            {
                // Start a new game
                myGraphics.Clear(pnlGameView.BackColor);
                btnStart.Text = "Forfeit";
                btnExit.Enabled = false;
                tkbDifficulty.Enabled = false;
                timeLeft = 30;
                score = 0;
                lblCountPopped.Text = score.ToString();
                // Set each balloon off top of panel and give new speed
                for (int i = 0; i < 5; i++)
                {
                    balloonY[i] = -balloonSize;
                    balloonSpeed[i] = myRandom.Next(3, 7);
                }
                // Set pin near centre
                pinX = (int)(pnlGameView.Width / 2);
                myGraphics.DrawImage(picPin.Image, pinX, pnlGameView.Height - pinSize, pinSize, pinSize);
                // Give form focus so it can accept KeyDown events
                this.Focus();
                tmrBalloons.Enabled = !(tmrBalloons.Enabled);
                tmrGame.Enabled = !(tmrGame.Enabled);
            }
            else
            {   // Stop game in progress
                btnStart.Text = "Start";
                tmrBalloons.Enabled = !(tmrBalloons.Enabled);
                tmrGame.Enabled = !(tmrGame.Enabled);
                highScoreCheck();
                MessageBox.Show(gameOverText);
                tkbDifficulty.Enabled = true;
                btnExit.Enabled = true;
            }
        }

        // Update high score (triggered after time is elapsed or player forfeits rather than immediately after breaking high score)
        void highScoreCheck()
        {
            if (score > Int32.Parse(lblHighScore.Text))
            {
                // Don't notify about new high score if there isn't one already
                if (lblHighScore.Text != "0")
                    MessageBox.Show("You've achieved a new high score!");

                // Update high score on interface
                lblHighScore.Text = score.ToString();
            }
        }

        private void tmrGame_Tick(object sender, EventArgs e)
        {
            if (timeLeft > 0)
            {
                // Tick down remaining time and update user interface to show it
                timeLeft--;
                lblCountdown.Text = timeLeft.ToString();
            }
            else
            {
                // Stop game after set time has elapsed
                btnStart.Text = "Start";
                tmrBalloons.Enabled = false;
                tmrGame.Enabled = false;
                highScoreCheck();
                MessageBox.Show(gameOverText);
                btnExit.Enabled = true;
                tkbDifficulty.Enabled = true;
            }
        }

        private void tmrBalloons_Tick(object sender, EventArgs e)
        {
            for (int i = 0; i < 5; i++)
            {
                // Erase over balloon
                myGraphics.FillRectangle(blankBrush, balloonX[i], balloonY[i], balloonSize, balloonSize);
                // Move balloon
                balloonY[i] += balloonSpeed[i];

                // Check if balloon has popped
                if ((balloonY[i] + balloonSize) > (pnlGameView.Height - pinSize))
                {
                    if (balloonX[i] < pinX)
                    {
                        if ((balloonX[i] + balloonSize) > (pinX + pinSize))
                        {
                            // Balloon has popped
                            // Increase score, move balloon back to top
                            score += 1;
                            lblCountPopped.Text = score.ToString();
                            balloonY[i] = -balloonSize;
                            balloonSpeed[i] = myRandom.Next(3, 7);
                        }
                    }
                }
                // Check for balloon touching bottom of panel
                if ((balloonY[i] + balloonSize) > pnlGameView.Height)
                {
                    // Balloon reaches bottom without popping
                    // Move back to top with new speed
                    balloonY[i] = -balloonSize;
                    balloonSpeed[i] = myRandom.Next(3, 7);
                }
                // Redraw balloon at new location
                myGraphics.DrawImage(picBalloon.Image, balloonX[i], balloonY[i], balloonSize, balloonSize);
            }
        }

        // Increase difficulty by decreasing form height
        private void tkbDifficulty_ValueChanged(object sender, EventArgs e)
        {
            this.Height = 541 - tkbDifficulty.Value * 18;
        }
    }
}
