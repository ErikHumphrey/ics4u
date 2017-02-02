using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _01_SimpleAnimation
{
    public partial class frmSimpleAnimation : Form
    {
        Graphics myGraphics;
        int imageY;
        int imageDir;
        Brush blankBrush;

        public frmSimpleAnimation()
        {
            InitializeComponent();
        }

        private void frmSimpleAnimation_Load(object sender, EventArgs e)
        {
            myGraphics = pnlDisplay.CreateGraphics();
            blankBrush = new SolidBrush(pnlDisplay.BackColor);
        }

        private void frmSimpleAnimation_FormClosing(object sender, FormClosingEventArgs e)
        {
            myGraphics.Dispose();
            blankBrush.Dispose();
        }

        private void btnStartStop_Click(object sender, EventArgs e)
        {
            tmrHover.Enabled = !(tmrHover.Enabled);
            imageY = 0;
            imageDir = 1;
        }

        private void tmrHover_Tick(object sender, EventArgs e)
        {
            int imageX = 10;
            int imageW = 100;
            int imageH = 32;

            imageX = (int)(0.5 * (pnlDisplay.Width - imageW));

            myGraphics.FillRectangle(blankBrush, imageX, imageY, imageW, imageH);
            imageY = imageY + imageDir * pnlDisplay.Height / 40;
            myGraphics.DrawImage(picHelicopter.Image, imageX, imageY, imageW, imageH);
            if (imageY + imageH > pnlDisplay.Height)
            {
                imageY = pnlDisplay.Height - imageH;
                imageDir = -1;
            }
            else if (imageY < 0)
            {
                imageY = 0;
                imageDir = 1;
            }
        }
    }
}
