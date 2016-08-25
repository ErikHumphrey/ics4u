﻿namespace _03_CarRacing
{
    partial class frmCarRace
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
            this.pnlGame = new System.Windows.Forms.Panel();
            this.pnlControls = new System.Windows.Forms.Panel();
            this.btnDecrease = new System.Windows.Forms.Button();
            this.btnIncrease = new System.Windows.Forms.Button();
            this.lblCarNumTitle = new System.Windows.Forms.Label();
            this.lblCarCount = new System.Windows.Forms.Label();
            this.btnStart = new System.Windows.Forms.Button();
            this.btnExit = new System.Windows.Forms.Button();
            this.tmrCar = new System.Windows.Forms.Timer(this.components);
            this.picCar = new System.Windows.Forms.PictureBox();
            this.pnlGame.SuspendLayout();
            this.pnlControls.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picCar)).BeginInit();
            this.SuspendLayout();
            // 
            // pnlGame
            // 
            this.pnlGame.Controls.Add(this.picCar);
            this.pnlGame.Dock = System.Windows.Forms.DockStyle.Right;
            this.pnlGame.Location = new System.Drawing.Point(103, 0);
            this.pnlGame.Name = "pnlGame";
            this.pnlGame.Size = new System.Drawing.Size(900, 626);
            this.pnlGame.TabIndex = 0;
            // 
            // pnlControls
            // 
            this.pnlControls.BackColor = System.Drawing.Color.Blue;
            this.pnlControls.Controls.Add(this.btnExit);
            this.pnlControls.Controls.Add(this.btnStart);
            this.pnlControls.Controls.Add(this.lblCarCount);
            this.pnlControls.Controls.Add(this.lblCarNumTitle);
            this.pnlControls.Controls.Add(this.btnIncrease);
            this.pnlControls.Controls.Add(this.btnDecrease);
            this.pnlControls.Dock = System.Windows.Forms.DockStyle.Left;
            this.pnlControls.Location = new System.Drawing.Point(0, 0);
            this.pnlControls.Name = "pnlControls";
            this.pnlControls.Size = new System.Drawing.Size(103, 626);
            this.pnlControls.TabIndex = 1;
            // 
            // btnDecrease
            // 
            this.btnDecrease.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnDecrease.Location = new System.Drawing.Point(9, 229);
            this.btnDecrease.Name = "btnDecrease";
            this.btnDecrease.Size = new System.Drawing.Size(40, 40);
            this.btnDecrease.TabIndex = 0;
            this.btnDecrease.Text = "<";
            this.btnDecrease.UseVisualStyleBackColor = true;
            // 
            // btnIncrease
            // 
            this.btnIncrease.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.btnIncrease.Location = new System.Drawing.Point(54, 229);
            this.btnIncrease.Name = "btnIncrease";
            this.btnIncrease.Size = new System.Drawing.Size(40, 40);
            this.btnIncrease.TabIndex = 1;
            this.btnIncrease.Text = ">";
            this.btnIncrease.UseVisualStyleBackColor = true;
            // 
            // lblCarNumTitle
            // 
            this.lblCarNumTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCarNumTitle.ForeColor = System.Drawing.Color.Yellow;
            this.lblCarNumTitle.Location = new System.Drawing.Point(2, 152);
            this.lblCarNumTitle.Name = "lblCarNumTitle";
            this.lblCarNumTitle.Size = new System.Drawing.Size(100, 46);
            this.lblCarNumTitle.TabIndex = 2;
            this.lblCarNumTitle.Text = "Number of\r\nCars";
            this.lblCarNumTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblCarCount
            // 
            this.lblCarCount.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCarCount.ForeColor = System.Drawing.Color.White;
            this.lblCarCount.Location = new System.Drawing.Point(3, 198);
            this.lblCarCount.Name = "lblCarCount";
            this.lblCarCount.Size = new System.Drawing.Size(100, 23);
            this.lblCarCount.TabIndex = 3;
            this.lblCarCount.Text = "0";
            this.lblCarCount.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // btnStart
            // 
            this.btnStart.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.btnStart.Location = new System.Drawing.Point(10, 279);
            this.btnStart.Name = "btnStart";
            this.btnStart.Size = new System.Drawing.Size(83, 41);
            this.btnStart.TabIndex = 4;
            this.btnStart.Text = "Race!";
            this.btnStart.UseVisualStyleBackColor = true;
            // 
            // btnExit
            // 
            this.btnExit.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F);
            this.btnExit.Location = new System.Drawing.Point(25, 320);
            this.btnExit.Name = "btnExit";
            this.btnExit.Size = new System.Drawing.Size(52, 27);
            this.btnExit.TabIndex = 5;
            this.btnExit.Text = "Exit";
            this.btnExit.UseVisualStyleBackColor = true;
            // 
            // picCar
            // 
            this.picCar.Image = global::_03_CarRacing.Properties.Resources.CarRed;
            this.picCar.Location = new System.Drawing.Point(38, 550);
            this.picCar.Name = "picCar";
            this.picCar.Size = new System.Drawing.Size(148, 45);
            this.picCar.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
            this.picCar.TabIndex = 0;
            this.picCar.TabStop = false;
            this.picCar.Visible = false;
            // 
            // frmCarRace
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1003, 626);
            this.Controls.Add(this.pnlControls);
            this.Controls.Add(this.pnlGame);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.Name = "frmCarRace";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Car Race";
            this.pnlGame.ResumeLayout(false);
            this.pnlGame.PerformLayout();
            this.pnlControls.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.picCar)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel pnlGame;
        private System.Windows.Forms.Panel pnlControls;
        private System.Windows.Forms.Button btnExit;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Label lblCarCount;
        private System.Windows.Forms.Label lblCarNumTitle;
        private System.Windows.Forms.Button btnIncrease;
        private System.Windows.Forms.Button btnDecrease;
        private System.Windows.Forms.PictureBox picCar;
        private System.Windows.Forms.Timer tmrCar;
    }
}

