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
            this.Close();
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
    }
}
