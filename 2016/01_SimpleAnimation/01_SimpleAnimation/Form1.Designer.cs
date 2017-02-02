namespace _01_SimpleAnimation
{
    partial class frmSimpleAnimation
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
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(frmSimpleAnimation));
            this.pnlDisplay = new System.Windows.Forms.Panel();
            this.tmrHover = new System.Windows.Forms.Timer(this.components);
            this.btnStartStop = new System.Windows.Forms.Button();
            this.picHelicopter = new System.Windows.Forms.PictureBox();
            ((System.ComponentModel.ISupportInitialize)(this.picHelicopter)).BeginInit();
            this.SuspendLayout();
            // 
            // pnlDisplay
            // 
            this.pnlDisplay.BackColor = System.Drawing.Color.White;
            this.pnlDisplay.Location = new System.Drawing.Point(288, 12);
            this.pnlDisplay.Name = "pnlDisplay";
            this.pnlDisplay.Size = new System.Drawing.Size(313, 602);
            this.pnlDisplay.TabIndex = 1;
            // 
            // tmrHover
            // 
            this.tmrHover.Interval = 50;
            this.tmrHover.Tick += new System.EventHandler(this.tmrHover_Tick);
            // 
            // btnStartStop
            // 
            this.btnStartStop.Location = new System.Drawing.Point(51, 162);
            this.btnStartStop.Name = "btnStartStop";
            this.btnStartStop.Size = new System.Drawing.Size(193, 23);
            this.btnStartStop.TabIndex = 3;
            this.btnStartStop.Text = "Start / Stop";
            this.btnStartStop.UseVisualStyleBackColor = true;
            this.btnStartStop.Click += new System.EventHandler(this.btnStartStop_Click);
            // 
            // picHelicopter
            // 
            this.picHelicopter.Image = global::_01_SimpleAnimation.Properties.Resources.imgHelicopter_;
            this.picHelicopter.Location = new System.Drawing.Point(34, 522);
            this.picHelicopter.Name = "picHelicopter";
            this.picHelicopter.Size = new System.Drawing.Size(230, 82);
            this.picHelicopter.SizeMode = System.Windows.Forms.PictureBoxSizeMode.Zoom;
            this.picHelicopter.TabIndex = 2;
            this.picHelicopter.TabStop = false;
            // 
            // frmSimpleAnimation
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.Black;
            this.ClientSize = new System.Drawing.Size(613, 626);
            this.Controls.Add(this.btnStartStop);
            this.Controls.Add(this.picHelicopter);
            this.Controls.Add(this.pnlDisplay);
            this.DoubleBuffered = true;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.Name = "frmSimpleAnimation";
            this.Text = "Simple Animation";
            this.FormClosing += new System.Windows.Forms.FormClosingEventHandler(this.frmSimpleAnimation_FormClosing);
            this.Load += new System.EventHandler(this.frmSimpleAnimation_Load);
            ((System.ComponentModel.ISupportInitialize)(this.picHelicopter)).EndInit();
            this.ResumeLayout(false);

        }

        #endregion

        private System.Windows.Forms.Panel pnlDisplay;
        private System.Windows.Forms.PictureBox picHelicopter;
        private System.Windows.Forms.Timer tmrHover;
        private System.Windows.Forms.Button btnStartStop;
    }
}

