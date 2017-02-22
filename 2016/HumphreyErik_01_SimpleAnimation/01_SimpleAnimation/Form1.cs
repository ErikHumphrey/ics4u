/*
  _____ _                 _         ___        _                 _   _             
/  ___(_)               | |       / _ \      (_)               | | (_)            
\ `--. _ _ __ ___  _ __ | | ___  / /_\ \_ __  _ _ __ ___   __ _| |_ _  ___  _ __  
 `--. \ | '_ ` _ \| '_ \| |/ _ \ |  _  | '_ \| | '_ ` _ \ / _` | __| |/ _ \| '_ \ 
/\__/ / | | | | | | |_) | |  __/ | | | | | | | | | | | | | (_| | |_| | (_) | | | |
\____/|_|_| |_| |_| .__/|_|\___| \_| |_/_| |_|_|_| |_| |_|\__,_|\__|_|\___/|_| |_|
                  | |                                                             
                  |_|                                                             */

/* Project 01: Simple Animation
 * By Erik Humphrey
 * Completed February 21st 2017
 * Animates the ascent and reasecent of a helicopter using 2D graphics. The user can choose when to start or stop the animation. */

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
            myGraphics.Clear(Color.White);
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
