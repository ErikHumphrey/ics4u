namespace SquirrelSnatcher
{
    partial class frmSquirrelSnatcher
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmSquirrelSnatcher));
            this.pnlControls = new System.Windows.Forms.Panel();
            this.btnShowCredits = new System.Windows.Forms.Button();
            this.btnDifficultyUp = new System.Windows.Forms.Button();
            this.btnDifficultyDown = new System.Windows.Forms.Button();
            this.lblTimeRemaining = new System.Windows.Forms.Label();
            this.lblTimeTitle = new System.Windows.Forms.Label();
            this.lblSquirrelsCount = new System.Windows.Forms.Label();
            this.lblSquirrelsTitle = new System.Windows.Forms.Label();
            this.btnStart = new System.Windows.Forms.Button();
            this.lblDifficultyLevel = new System.Windows.Forms.Label();
            this.lblDifficultyTitle = new System.Windows.Forms.Label();
            this.tmrGameTime = new System.Windows.Forms.Timer(this.components);
            this.pnlGame = new System.Windows.Forms.Panel();
            this.picHole = new System.Windows.Forms.PictureBox();
            this.picSquirrel = new System.Windows.Forms.PictureBox();
            this.picHand = new System.Windows.Forms.PictureBox();
            this.lblInstructions = new System.Windows.Forms.Label();
            this.pnlControls.SuspendLayout();
            this.pnlGame.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picHole)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.picSquirrel)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.picHand)).BeginInit();
            this.SuspendLayout();
            // 
            // pnlControls
            // 
            this.pnlControls.BackColor = System.Drawing.Color.Blue;
            this.pnlControls.Controls.Add(this.btnShowCredits);
            this.pnlControls.Controls.Add(this.btnDifficultyUp);
            this.pnlControls.Controls.Add(this.btnDifficultyDown);
            this.pnlControls.Controls.Add(this.lblTimeRemaining);
            this.pnlControls.Controls.Add(this.lblTimeTitle);
            this.pnlControls.Controls.Add(this.lblSquirrelsCount);
            this.pnlControls.Controls.Add(this.lblSquirrelsTitle);
            this.pnlControls.Controls.Add(this.btnStart);
            this.pnlControls.Controls.Add(this.lblDifficultyLevel);
            this.pnlControls.Controls.Add(this.lblDifficultyTitle);
            this.pnlControls.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pnlControls.Location = new System.Drawing.Point(0, 0);
            this.pnlControls.Name = "pnlControls";
            this.pnlControls.Size = new System.Drawing.Size(1000, 600);
            this.pnlControls.TabIndex = 3;
            // 
            // btnShowCredits
            // 
            this.btnShowCredits.Location = new System.Drawing.Point(12, 573);
            this.btnShowCredits.Name = "btnShowCredits";
            this.btnShowCredits.Size = new System.Drawing.Size(75, 23);
            this.btnShowCredits.TabIndex = 10;
            this.btnShowCredits.Text = "Credits";
            this.btnShowCredits.UseVisualStyleBackColor = true;
            this.btnShowCredits.Click += new System.EventHandler(this.btnShowCredits_Click);
            // 
            // btnDifficultyUp
            // 
            this.btnDifficultyUp.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDifficultyUp.Location = new System.Drawing.Point(67, 208);
            this.btnDifficultyUp.Name = "btnDifficultyUp";
            this.btnDifficultyUp.Size = new System.Drawing.Size(24, 32);
            this.btnDifficultyUp.TabIndex = 1;
            this.btnDifficultyUp.Text = ">";
            this.btnDifficultyUp.UseVisualStyleBackColor = true;
            this.btnDifficultyUp.Click += new System.EventHandler(this.btnDifficultyUp_Click);
            // 
            // btnDifficultyDown
            // 
            this.btnDifficultyDown.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDifficultyDown.Location = new System.Drawing.Point(12, 208);
            this.btnDifficultyDown.Name = "btnDifficultyDown";
            this.btnDifficultyDown.Size = new System.Drawing.Size(24, 32);
            this.btnDifficultyDown.TabIndex = 0;
            this.btnDifficultyDown.Text = "<";
            this.btnDifficultyDown.UseVisualStyleBackColor = true;
            this.btnDifficultyDown.Visible = false;
            this.btnDifficultyDown.Click += new System.EventHandler(this.btnDifficultyDown_Click);
            // 
            // lblTimeRemaining
            // 
            this.lblTimeRemaining.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTimeRemaining.ForeColor = System.Drawing.Color.White;
            this.lblTimeRemaining.Location = new System.Drawing.Point(1, 81);
            this.lblTimeRemaining.Name = "lblTimeRemaining";
            this.lblTimeRemaining.Size = new System.Drawing.Size(100, 23);
            this.lblTimeRemaining.TabIndex = 9;
            this.lblTimeRemaining.Text = "30";
            this.lblTimeRemaining.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblTimeTitle
            // 
            this.lblTimeTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblTimeTitle.ForeColor = System.Drawing.Color.Yellow;
            this.lblTimeTitle.Location = new System.Drawing.Point(0, 35);
            this.lblTimeTitle.Name = "lblTimeTitle";
            this.lblTimeTitle.Size = new System.Drawing.Size(100, 46);
            this.lblTimeTitle.TabIndex = 8;
            this.lblTimeTitle.Text = "Time Left";
            this.lblTimeTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblSquirrelsCount
            // 
            this.lblSquirrelsCount.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSquirrelsCount.ForeColor = System.Drawing.Color.White;
            this.lblSquirrelsCount.Location = new System.Drawing.Point(1, 147);
            this.lblSquirrelsCount.Name = "lblSquirrelsCount";
            this.lblSquirrelsCount.Size = new System.Drawing.Size(100, 23);
            this.lblSquirrelsCount.TabIndex = 7;
            this.lblSquirrelsCount.Text = "0";
            this.lblSquirrelsCount.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblSquirrelsTitle
            // 
            this.lblSquirrelsTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblSquirrelsTitle.ForeColor = System.Drawing.Color.Yellow;
            this.lblSquirrelsTitle.Location = new System.Drawing.Point(0, 101);
            this.lblSquirrelsTitle.Name = "lblSquirrelsTitle";
            this.lblSquirrelsTitle.Size = new System.Drawing.Size(100, 46);
            this.lblSquirrelsTitle.TabIndex = 6;
            this.lblSquirrelsTitle.Text = "Squirrels";
            this.lblSquirrelsTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btnStart
            // 
            this.btnStart.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.btnStart.Location = new System.Drawing.Point(8, 317);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(83, 41);
            this.btnStart.TabIndex = 4;
            this.btnStart.Text = "Play";
            this.btnStart.UseVisualStyleBackColor = true;
            this.btnStart.Click += new System.EventHandler(this.btnStart_Click);
            // 
            // lblDifficultyLevel
            // 
            this.lblDifficultyLevel.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDifficultyLevel.ForeColor = System.Drawing.Color.White;
            this.lblDifficultyLevel.Location = new System.Drawing.Point(3, 213);
            this.lblDifficultyLevel.Name = "lblDifficultyLevel";
            this.lblDifficultyLevel.Size = new System.Drawing.Size(100, 23);
            this.lblDifficultyLevel.TabIndex = 3;
            this.lblDifficultyLevel.Text = "0";
            this.lblDifficultyLevel.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblDifficultyTitle
            // 
            this.lblDifficultyTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblDifficultyTitle.ForeColor = System.Drawing.Color.Yellow;
            this.lblDifficultyTitle.Location = new System.Drawing.Point(2, 167);
            this.lblDifficultyTitle.Name = "lblDifficultyTitle";
            this.lblDifficultyTitle.Size = new System.Drawing.Size(100, 46);
            this.lblDifficultyTitle.TabIndex = 2;
            this.lblDifficultyTitle.Text = "Difficulty";
            this.lblDifficultyTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // tmrGameTime
            // 
            this.tmrGameTime.Interval = 15;
            this.tmrGameTime.Tick += new System.EventHandler(this.tmrGameTime_Tick);
            // 
            // pnlGame
            // 
            this.pnlGame.BackColor = System.Drawing.Color.MediumSeaGreen;
            this.pnlGame.Controls.Add(this.picHole);
            this.pnlGame.Controls.Add(this.picSquirrel);
            this.pnlGame.Controls.Add(this.picHand);
            this.pnlGame.Controls.Add(this.lblInstructions);
            this.pnlGame.Dock = System.Windows.Forms.DockStyle.Right;
            this.pnlGame.Location = new System.Drawing.Point(100, 0);
            this.pnlGame.Name = "pnlGame";
            this.pnlGame.Size = new System.Drawing.Size(900, 600);
            this.pnlGame.TabIndex = 2;
            this.pnlGame.Paint += new System.Windows.Forms.PaintEventHandler(this.pnlGame_Paint);
            // 
            // picHole
            // 
            this.picHole.BackColor = System.Drawing.Color.Transparent;
            this.picHole.Image = global::_04_FallingSquirrels.Properties.Resources.imgHole;
            this.picHole.Location = new System.Drawing.Point(28, 346);
            this.picHole.Name = "picHole";
            this.picHole.Size = new System.Drawing.Size(50, 64);
            this.picHole.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picHole.TabIndex = 4;
            this.picHole.TabStop = false;
            this.picHole.Visible = false;
            // 
            // picSquirrel
            // 
            this.picSquirrel.BackColor = System.Drawing.Color.Transparent;
            this.picSquirrel.Image = ((System.Drawing.Image)(resources.GetObject("picSquirrel.Image")));
            this.picSquirrel.Location = new System.Drawing.Point(642, 350);
            this.picSquirrel.Name = "picSquirrel";
            this.picSquirrel.Size = new System.Drawing.Size(68, 60);
            this.picSquirrel.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picSquirrel.TabIndex = 3;
            this.picSquirrel.TabStop = false;
            this.picSquirrel.Visible = false;
            // 
            // picHand
            // 
            this.picHand.BackColor = System.Drawing.Color.Transparent;
            this.picHand.Image = ((System.Drawing.Image)(resources.GetObject("picHand.Image")));
            this.picHand.Location = new System.Drawing.Point(762, 336);
            this.picHand.Name = "picHand";
            this.picHand.Size = new System.Drawing.Size(126, 88);
            this.picHand.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picHand.TabIndex = 2;
            this.picHand.TabStop = false;
            this.picHand.Visible = false;
            // 
            // lblInstructions
            // 
            this.lblInstructions.BackColor = System.Drawing.Color.SkyBlue;
            this.lblInstructions.BorderStyle = System.Windows.Forms.BorderStyle.FixedSingle;
            this.lblInstructions.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblInstructions.Location = new System.Drawing.Point(100, 157);
            this.lblInstructions.Name = "lblInstructions";
            this.lblInstructions.Size = new System.Drawing.Size(700, 287);
            this.lblInstructions.TabIndex = 1;
            this.lblInstructions.Text = "Instructions will appear here.";
            this.lblInstructions.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // frmSquirrelSnatcher
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1000, 600);
            this.Controls.Add(this.pnlGame);
            this.Controls.Add(this.pnlControls);
            this.DoubleBuffered = true;
            this.KeyPreview = true;
            this.Name = "frmSquirrelSnatcher";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Squirrel Snatcher";
            this.Load += new System.EventHandler(this.frmSquirrelsFromTheSky_Load);
            this.KeyDown += new System.Windows.Forms.KeyEventHandler(this.frmSquirrelSnatcher_KeyDown);
            this.KeyUp += new System.Windows.Forms.KeyEventHandler(this.frmSquirrelSnatcher_KeyUp);
            this.pnlControls.ResumeLayout(false);
            this.pnlGame.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.picHole)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.picSquirrel)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.picHand)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel pnlGame;
        private System.Windows.Forms.Panel pnlControls;
        private System.Windows.Forms.Button btnDifficultyUp;
        private System.Windows.Forms.Button btnDifficultyDown;
        private System.Windows.Forms.Label lblTimeRemaining;
        private System.Windows.Forms.Label lblTimeTitle;
        private System.Windows.Forms.Label lblSquirrelsCount;
        private System.Windows.Forms.Label lblSquirrelsTitle;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Label lblDifficultyLevel;
        private System.Windows.Forms.Label lblDifficultyTitle;
        private System.Windows.Forms.PictureBox picHand;
        private System.Windows.Forms.PictureBox picSquirrel;
        private System.Windows.Forms.PictureBox picHole;
        private System.Windows.Forms.Timer tmrGameTime;
        private System.Windows.Forms.Label lblInstructions;
        private System.Windows.Forms.Button btnShowCredits;
    }
}

