namespace _04_FallingSquirrels
{
    partial class Form1
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
            this.pnlGame = new System.Windows.Forms.Panel();
            this.lblInstructions = new System.Windows.Forms.Label();
            this.pnlControls = new System.Windows.Forms.Panel();
            this.btnStart = new System.Windows.Forms.Button();
            this.lblCarCount = new System.Windows.Forms.Label();
            this.lblCarNumTitle = new System.Windows.Forms.Label();
            this.btnDifficultyUp = new System.Windows.Forms.Button();
            this.btnDifficultyDown = new System.Windows.Forms.Button();
            this.label1 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.picFarmer = new System.Windows.Forms.PictureBox();
            this.picEagle = new System.Windows.Forms.PictureBox();
            this.picSquirrel = new System.Windows.Forms.PictureBox();
            this.pnlGame.SuspendLayout();
            this.pnlControls.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.picFarmer)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.picEagle)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.picSquirrel)).BeginInit();
            this.SuspendLayout();
            // 
            // pnlGame
            // 
            this.pnlGame.Controls.Add(this.picSquirrel);
            this.pnlGame.Controls.Add(this.picEagle);
            this.pnlGame.Controls.Add(this.picFarmer);
            this.pnlGame.Controls.Add(this.lblInstructions);
            this.pnlGame.Dock = System.Windows.Forms.DockStyle.Right;
            this.pnlGame.Location = new System.Drawing.Point(100, 0);
            this.pnlGame.Name = "pnlGame";
            this.pnlGame.Size = new System.Drawing.Size(900, 600);
            this.pnlGame.TabIndex = 2;
            // 
            // lblInstructions
            // 
            this.lblInstructions.AutoSize = true;
            this.lblInstructions.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblInstructions.Location = new System.Drawing.Point(26, 24);
            this.lblInstructions.Name = "lblInstructions";
            this.lblInstructions.Size = new System.Drawing.Size(210, 20);
            this.lblInstructions.TabIndex = 1;
            this.lblInstructions.Text = "Instructions will appear here.";
            // 
            // pnlControls
            // 
            this.pnlControls.BackColor = System.Drawing.Color.Blue;
            this.pnlControls.Controls.Add(this.btnDifficultyUp);
            this.pnlControls.Controls.Add(this.btnDifficultyDown);
            this.pnlControls.Controls.Add(this.label3);
            this.pnlControls.Controls.Add(this.label4);
            this.pnlControls.Controls.Add(this.label1);
            this.pnlControls.Controls.Add(this.label2);
            this.pnlControls.Controls.Add(this.btnStart);
            this.pnlControls.Controls.Add(this.lblCarCount);
            this.pnlControls.Controls.Add(this.lblCarNumTitle);
            this.pnlControls.Dock = System.Windows.Forms.DockStyle.Left;
            this.pnlControls.Location = new System.Drawing.Point(0, 0);
            this.pnlControls.Name = "pnlControls";
            this.pnlControls.Size = new System.Drawing.Size(100, 600);
            this.pnlControls.TabIndex = 3;
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
            // 
            // lblCarCount
            // 
            this.lblCarCount.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCarCount.ForeColor = System.Drawing.Color.White;
            this.lblCarCount.Location = new System.Drawing.Point(3, 213);
            this.lblCarCount.Name = "lblCarCount";
            this.lblCarCount.Size = new System.Drawing.Size(100, 23);
            this.lblCarCount.TabIndex = 3;
            this.lblCarCount.Text = "0";
            this.lblCarCount.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // lblCarNumTitle
            // 
            this.lblCarNumTitle.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblCarNumTitle.ForeColor = System.Drawing.Color.Yellow;
            this.lblCarNumTitle.Location = new System.Drawing.Point(2, 167);
            this.lblCarNumTitle.Name = "lblCarNumTitle";
            this.lblCarNumTitle.Size = new System.Drawing.Size(100, 46);
            this.lblCarNumTitle.TabIndex = 2;
            this.lblCarNumTitle.Text = "Difficulty";
            this.lblCarNumTitle.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
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
            // 
            // label1
            // 
            this.label1.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.ForeColor = System.Drawing.Color.White;
            this.label1.Location = new System.Drawing.Point(1, 147);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(100, 23);
            this.label1.TabIndex = 7;
            this.label1.Text = "0";
            this.label1.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label2
            // 
            this.label2.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label2.ForeColor = System.Drawing.Color.Yellow;
            this.label2.Location = new System.Drawing.Point(0, 101);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(100, 46);
            this.label2.TabIndex = 6;
            this.label2.Text = "Squirrels";
            this.label2.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label3
            // 
            this.label3.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label3.ForeColor = System.Drawing.Color.White;
            this.label3.Location = new System.Drawing.Point(1, 81);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(100, 23);
            this.label3.TabIndex = 9;
            this.label3.Text = "0";
            this.label3.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // label4
            // 
            this.label4.Font = new System.Drawing.Font("Microsoft Sans Serif", 12F, System.Drawing.FontStyle.Bold, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label4.ForeColor = System.Drawing.Color.Yellow;
            this.label4.Location = new System.Drawing.Point(0, 35);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(100, 46);
            this.label4.TabIndex = 8;
            this.label4.Text = "Time Left";
            this.label4.TextAlign = System.Drawing.ContentAlignment.MiddleCenter;
            // 
            // picFarmer
            // 
            this.picFarmer.Location = new System.Drawing.Point(30, 418);
            this.picFarmer.Name = "picFarmer";
            this.picFarmer.Size = new System.Drawing.Size(99, 170);
            this.picFarmer.TabIndex = 2;
            this.picFarmer.TabStop = false;
            // 
            // picEagle
            // 
            this.picEagle.Location = new System.Drawing.Point(137, 418);
            this.picEagle.Name = "picEagle";
            this.picEagle.Size = new System.Drawing.Size(99, 170);
            this.picEagle.TabIndex = 3;
            this.picEagle.TabStop = false;
            // 
            // picSquirrel
            // 
            this.picSquirrel.Location = new System.Drawing.Point(242, 418);
            this.picSquirrel.Name = "picSquirrel";
            this.picSquirrel.Size = new System.Drawing.Size(99, 170);
            this.picSquirrel.TabIndex = 4;
            this.picSquirrel.TabStop = false;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(1000, 600);
            this.Controls.Add(this.pnlGame);
            this.Controls.Add(this.pnlControls);
            this.Name = "Form1";
            this.Text = "Form1";
            this.pnlGame.ResumeLayout(false);
            this.pnlGame.PerformLayout();
            this.pnlControls.ResumeLayout(false);
            ((System.ComponentModel.ISupportInitialize)(this.picFarmer)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.picEagle)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.picSquirrel)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel pnlGame;
        private System.Windows.Forms.PictureBox picSquirrel;
        private System.Windows.Forms.PictureBox picEagle;
        private System.Windows.Forms.PictureBox picFarmer;
        private System.Windows.Forms.Label lblInstructions;
        private System.Windows.Forms.Panel pnlControls;
        private System.Windows.Forms.Button btnDifficultyUp;
        private System.Windows.Forms.Button btnDifficultyDown;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Button btnStart;
        private System.Windows.Forms.Label lblCarCount;
        private System.Windows.Forms.Label lblCarNumTitle;
    }
}

