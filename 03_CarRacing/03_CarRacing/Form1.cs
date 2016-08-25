using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _03_CarRacing
{
    public partial class frmCarRace : Form
    {
        int numberOfCars;
        string gameStatus;
        Graphics gamePanel;

        const int CAR_MINIMUM = 3;
        const int CAR_MAXIMUM = 10;

        int carsSelected;
        int[] carPicked = new int[10];

        int numberMoves;
        int[] carPosition = new int[10];
        int[] finalPosition = new int[10];
        int winner;
        Random myRandom = new Random();

        public frmCarRace()
        {
            InitializeComponent();
        }

        private void frmCarRace_Load(object sender, EventArgs e)
        {
            numberOfCars = 3;
            gameStatus = "Initial";
            gamePanel = pnlGame.CreateGraphics();

            lblInstructions.Text = "Car Race\r\n";
            lblInstructions.Text += "\r\n\r\nSelect Number of Cars to race by pressing the left button to decrease, right button to increase.";
            lblInstructions.Text += "\r\n\r\nClick on the " + btnStart.Text + " button to begin.";
            lblInstructions.Text += "\r\n\r\nClick on the " + btnExit.Text + " button to close the program.";
            lblCarCount.Text = numberOfCars.ToString();
        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            {
                if (gameStatus == "Initial")
                this.Close();
            }
        }

        private void btnDecrease_Click(object sender, EventArgs e)
        {
            if (gameStatus == "Initial" && numberOfCars > CAR_MINIMUM)
            {
                // Decrease number of cars
                numberOfCars--;
                lblCarCount.Text = numberOfCars.ToString();
            }
        }

        private void btnIncrease_Click(object sender, EventArgs e)
        {
            if (gameStatus == "Initial" && numberOfCars < CAR_MAXIMUM)
            {
                // Increase number of cars
                numberOfCars++;
                lblCarCount.Text = numberOfCars.ToString();
            }
        }

        private void btnStart_Click(object sender, EventArgs e)
        {
            if (gameStatus == "Initial")
            {
                gameStatus = "Stopped";
                lblInstructions.Visible = false;
                gamePanel.Clear(Color.White);
                // Draw cars
                for (int i = 0; i < numberOfCars; i++)
                {
                    gamePanel.DrawImage(picCar.Image, 50, i * 60 + 10, 70, 20);
                    gamePanel.DrawLine(Pens.Black, 50, i * 60 + 30, 820, i * 60 + 30);
                }
                // Draw finish line
                gamePanel.FillRectangle(Brushes.Blue, 820, 10, 10, numberOfCars * 60 - 10);
                Font myFont = new Font("Arial", 14);
                gamePanel.DrawString("Select a car. Click again to deselect", myFont, Brushes.Black, 200, 35);
                gamePanel.DrawString("Click " + btnStart.Text + " to begin the race.", myFont, Brushes.Black, 200, 65);
                carsSelected = 0;
                for (int i = 0; i < numberOfCars; i++)
                    carPicked[i] = 0;
            }
            else if (gameStatus == "Stopped" && carsSelected == 1)
            {
                // User clicks Race! after selecting car
                gameStatus = "Moving";
                gamePanel.FillRectangle(Brushes.White, 200, 37, 400, 50);
                // Set start position and get final positions
                numberMoves = 0;
                for (int i = 0; i < numberOfCars; i++)
                {
                    carPosition[i] = 50;
                    finalPosition[i] = 400 + myRandom.Next(360);
                }
                // Decide the winner
                winner = myRandom.Next(numberOfCars);
                finalPosition[winner] = 850;
                tmrCar.Start();
            }
        }

        private void pnlGame_MouseDown(object sender, MouseEventArgs e)
        {
            int carClicked;
            if (gameStatus == "Stopped")
            {
                carClicked = (int)Math.Floor(Convert.ToDouble((e.Y - 10) / 60));
                // If the car was already clicked, remove from list.
                if (carPicked[carClicked] == 1)
                {
                    carsSelected--;
                    carPicked[carClicked] = 0;
                    gamePanel.FillRectangle(Brushes.White, 10, carClicked * 60 + 5, 40, 40);
                }
                else if (carsSelected < 1)
                {
                    // Add car to list if it has not been selected yet
                    carsSelected++;
                    carPicked[carClicked] = 1;
                    gamePanel.DrawLine(Pens.Red, 10, carClicked * 60 + 5, 40, carClicked * 60 + 35);
                    gamePanel.DrawLine(Pens.Red, 10, carClicked * 60 + 35, 40, carClicked * 60 + 5);
                }
            }
        }

        private void tmrCar_Tick(object sender, EventArgs e)
        {
            // Increment the number of moves and positions
            numberMoves++;
            for (int i = 0; i < numberOfCars; i++)
            {
                gamePanel.FillRectangle(Brushes.White, carPosition[i], i * 60 + 10, 70, 20);
                carPosition[i] += (finalPosition[i] - 50) / 50;
                gamePanel.DrawImage(picCar.Image, carPosition[i], i * 60 + 10, 70, 20);
            }
            if (numberMoves == 49)
            {
                tmrCar.Stop();
                gameStatus = "Initial";
            }
        }
    }
}
