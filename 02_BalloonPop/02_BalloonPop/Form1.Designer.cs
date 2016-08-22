namespace _02_BalloonPop
{
    partial class frmBalloonPop
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.components = new System.ComponentModel.Container();
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmBalloonPop));
            this.lblTimeRemaining = new System.Windows.Forms.Label();
            this.lblCountdown = new System.Windows.Forms.Label();
            this.pnlGameView = new System.Windows.Forms.Panel();
            this.lblDisplay = new System.Windows.Forms.Label();
            this.btnStart = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            this.lblCountPopped = new System.Windows.Forms.Label();
            this.tmrBalloons = new System.Windows.Forms.Timer(this.components);
            this.tmrGame = new System.Windows.Forms.Timer(this.components);
            this.picPin = new System.Windows.Forms.PictureBox();
            this.picBalloon = new System.Windows.Forms.PictureBox();
            this.tkbPinSize = new System.Windows.Forms.TrackBar();
            this.label1 = new System.Windows.Forms.Label();
            this.lblHighScore = new System.Windows.Forms.Label();
            this.lblSessionHigh = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.picPin)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.picBalloon)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.tkbPinSize)).BeginInit();
            this.SuspendLayout();
            // 
            // lblTimeRemaining
            // 
            this.lblTimeRemaining.AutoSize = true;
            this.lblTimeRemaining.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTimeRemaining.Location = new System.Drawing.Point(539, 114);
            this.lblTimeRemaining.Name = "lblTimeRemaining";
            this.lblTimeRemaining.Size = new System.Drawing.Size(111, 13);
            this.lblTimeRemaining.TabIndex = 2;
            this.lblTimeRemaining.Text = "TIME REMAINING";
            // 
            // lblCountdown
            // 
            this.lblCountdown.BackColor = System.Drawing.Color.SkyBlue;
            this.lblCountdown.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.lblCountdown.Location = new System.Drawing.Point(527, 130);
            this.lblCountdown.Name = "lblCountdown";
            this.lblCountdown.Size = new System.Drawing.Size(134, 44);
            this.lblCountdown.TabIndex = 3;
            this.lblCountdown.Text = "30";
            this.lblCountdown.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // pnlGameView
            // 
            this.pnlGameView.BackColor = System.Drawing.Color.LightBlue;
            this.pnlGameView.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.pnlGameView.Location = new System.Drawing.Point(12, 12);
            this.pnlGameView.Name = "pnlGameView";
            this.pnlGameView.Size = new System.Drawing.Size(497, 478);
            this.pnlGameView.TabIndex = 4;
            // 
            // lblDisplay
            // 
            this.lblDisplay.AutoSize = true;
            this.lblDisplay.Font = new System.Drawing.Font("Microsoft Sans Serif", 8.25F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDisplay.Location = new System.Drawing.Point(531, 24);
            this.lblDisplay.Name = "lblDisplay";
            this.lblDisplay.Size = new System.Drawing.Size(126, 13);
            this.lblDisplay.TabIndex = 5;
            this.lblDisplay.Text = "BALLOONS POPPED";
            // 
            // btnStart
            // 
            this.btnStart.Location = new System.Drawing.Point(530, 281);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(145, 23);
            this.btnStart.TabIndex = 6;
            this.btnStart.Text = "Start";
            this.btnStart.UseVisualStyleBackColor = true;
            this.btnStart.Click += new System.EventHandler(this.btnStart_Click);
            // 
            // btnExit
            // 
            this.btnExit.Location = new System.Drawing.Point(530, 310);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(145, 23);
            this.btnExit.TabIndex = 7;
            this.btnExit.Text = "Quit Game";
            this.btnExit.UseVisualStyleBackColor = true;
            this.btnExit.Click += new System.EventHandler(this.btnExit_Click);
            // 
            // lblCountPopped
            // 
            this.lblCountPopped.BackColor = System.Drawing.Color.SkyBlue;
            this.lblCountPopped.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.lblCountPopped.Location = new System.Drawing.Point(527, 40);
            this.lblCountPopped.Name = "lblCountPopped";
            this.lblCountPopped.Size = new System.Drawing.Size(134, 44);
            this.lblCountPopped.TabIndex = 9;
            this.lblCountPopped.Text = "0";
            this.lblCountPopped.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // tmrBalloons
            // 
            this.tmrBalloons.Tick += new System.EventHandler(this.tmrBalloons_Tick);
            // 
            // tmrGame
            // 
            this.tmrGame.Interval = 30000;
            this.tmrGame.Tick += new System.EventHandler(this.tmrGame_Tick);
            // 
            // picPin
            // 
            this.picPin.Image = global::_02_BalloonPop.Properties.Resources.Pin;
            this.picPin.Location = new System.Drawing.Point(626, 394);
            this.picPin.Name = "picPin";
            this.picPin.Size = new System.Drawing.Size(49, 50);
            this.picPin.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picPin.TabIndex = 10;
            this.picPin.TabStop = false;
            // 
            // picBalloon
            // 
            this.picBalloon.Image = global::_02_BalloonPop.Properties.Resources.BalloonYellow;
            this.picBalloon.Location = new System.Drawing.Point(530, 378);
            this.picBalloon.Name = "picBalloon";
            this.picBalloon.Size = new System.Drawing.Size(71, 98);
            this.picBalloon.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picBalloon.TabIndex = 8;
            this.picBalloon.TabStop = false;
            // 
            // tkbPinSize
            // 
            this.tkbPinSize.AutoSize = false;
            this.tkbPinSize.Location = new System.Drawing.Point(524, 240);
            this.tkbPinSize.Maximum = 4;
            this.tkbPinSize.Name = "tkbPinSize";
            this.tkbPinSize.Size = new System.Drawing.Size(158, 23);
            this.tkbPinSize.TabIndex = 11;
            this.tkbPinSize.TickStyle = System.Windows.Forms.TickStyle.None;
            this.tkbPinSize.Value = 2;
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 6.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(530, 228);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(44, 12);
            this.label1.TabIndex = 12;
            this.label1.Text = "PIN SIZE";
            // 
            // lblHighScore
            // 
            this.lblHighScore.BackColor = System.Drawing.Color.SkyBlue;
            this.lblHighScore.FlatStyle = System.Windows.Forms.FlatStyle.Flat;
            this.lblHighScore.Location = new System.Drawing.Point(610, 87);
            this.lblHighScore.Name = "lblHighScore";
            this.lblHighScore.Size = new System.Drawing.Size(51, 15);
            this.lblHighScore.TabIndex = 13;
            this.lblHighScore.Text = "0";
            this.lblHighScore.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblSessionHigh
            // 
            this.lblSessionHigh.AutoSize = true;
            this.lblSessionHigh.Font = new System.Drawing.Font("Microsoft Sans Serif", 6.75F, System.Drawing.FontStyle.Italic, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSessionHigh.Location = new System.Drawing.Point(533, 88);
            this.lblSessionHigh.Name = "lblSessionHigh";
            this.lblSessionHigh.Size = new System.Drawing.Size(72, 12);
            this.lblSessionHigh.TabIndex = 14;
            this.lblSessionHigh.Text = "SESSION HIGH";
            // 
            // frmBalloonPop
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.DeepSkyBlue;
            this.ClientSize = new System.Drawing.Size(687, 502);
            this.Controls.Add(this.lblSessionHigh);
            this.Controls.Add(this.lblHighScore);
            this.Controls.Add(this.label1);
            this.Controls.Add(this.tkbPinSize);
            this.Controls.Add(this.picPin);
            this.Controls.Add(this.lblCountPopped);
            this.Controls.Add(this.picBalloon);
            this.Controls.Add(this.btnExit);
            this.Controls.Add(this.btnStart);
            this.Controls.Add(this.lblDisplay);
            this.Controls.Add(this.pnlGameView);
            this.Controls.Add(this.lblCountdown);
            this.Controls.Add(this.lblTimeRemaining);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.KeyPreview = true;
            this.Name = "frmBalloonPop";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Balloon Pop";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.frmBalloonPop_FormClosing);
            this.Load += new System.EventHandler(this.frmBalloonPop_Load);
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.frmBalloonPop_KeyDown);
            ((System.ComponentModel.ISupportInitialize)(this.picPin)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.picBalloon)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.tkbPinSize)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion
        private System.Windows.Forms.Label lblTimeRemaining;
        private System.Windows.Forms.Label lblCountdown;
        private System.Windows.Forms.Panel pnlGameView;
        private System.Windows.Forms.Label lblDisplay;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.PictureBox picBalloon;
        private System.Windows.Forms.Label lblCountPopped;
        private System.Windows.Forms.PictureBox picPin;
        private System.Windows.Forms.Timer tmrBalloons;
        private System.Windows.Forms.Timer tmrGame;
        private System.Windows.Forms.TrackBar tkbPinSize;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label lblHighScore;
        private System.Windows.Forms.Label lblSessionHigh;
    }
}

