namespace Credits
{
    partial class frmCredits
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
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.pictureBox2 = new System.Windows.Forms.PictureBox();
            this.lbl = new System.Windows.Forms.PictureBox();
            this.lblHole = new System.Windows.Forms.LinkLabel();
            this.lblHand = new System.Windows.Forms.LinkLabel();
            this.lblSquirrel = new System.Windows.Forms.LinkLabel();
            this.btnOkayThen = new System.Windows.Forms.Button();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.lbl)).BeginInit();
            this.SuspendLayout();
            // 
            // pictureBox1
            // 
            this.pictureBox1.Image = global::_04_FallingSquirrels.Properties.Resources.imgHand;
            this.pictureBox1.Location = new System.Drawing.Point(92, 75);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(64, 49);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            // 
            // pictureBox2
            // 
            this.pictureBox2.Image = global::_04_FallingSquirrels.Properties.Resources.imgHole;
            this.pictureBox2.Location = new System.Drawing.Point(362, 60);
            this.pictureBox2.Name = "pictureBox2";
            this.pictureBox2.Size = new System.Drawing.Size(64, 64);
            this.pictureBox2.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
            this.pictureBox2.TabIndex = 1;
            this.pictureBox2.TabStop = false;
            // 
            // lbl
            // 
            this.lbl.Image = global::_04_FallingSquirrels.Properties.Resources.imgSquirrel;
            this.lbl.Location = new System.Drawing.Point(595, 40);
            this.lbl.Name = "lbl";
            this.lbl.Size = new System.Drawing.Size(96, 84);
            this.lbl.SizeMode = System.Windows.Forms.PictureBoxSizeMode.AutoSize;
            this.lbl.TabIndex = 2;
            this.lbl.TabStop = false;
            // 
            // lblHole
            // 
            this.lblHole.AutoSize = true;
            this.lblHole.Location = new System.Drawing.Point(269, 134);
            this.lblHole.Name = "lblHole";
            this.lblHole.Size = new System.Drawing.Size(253, 13);
            this.lblHole.TabIndex = 3;
            this.lblHole.TabStop = true;
            this.lblHole.Text = "Massachusetts Institute of Technology App Inventor";
            // 
            // lblHand
            // 
            this.lblHand.AutoSize = true;
            this.lblHand.Location = new System.Drawing.Point(58, 134);
            this.lblHand.Name = "lblHand";
            this.lblHand.Size = new System.Drawing.Size(133, 13);
            this.lblHand.TabIndex = 4;
            this.lblHand.TabStop = true;
            this.lblHand.Text = "Kirby && The Amazing Mirror";
            // 
            // lblSquirrel
            // 
            this.lblSquirrel.AutoSize = true;
            this.lblSquirrel.Location = new System.Drawing.Point(602, 134);
            this.lblSquirrel.Name = "lblSquirrel";
            this.lblSquirrel.Size = new System.Drawing.Size(77, 13);
            this.lblSquirrel.TabIndex = 5;
            this.lblSquirrel.TabStop = true;
            this.lblSquirrel.Text = "Stardew Valley";
            // 
            // btnOkayThen
            // 
            this.btnOkayThen.Location = new System.Drawing.Point(337, 204);
            this.btnOkayThen.Name = "btnOkayThen";
            this.btnOkayThen.Size = new System.Drawing.Size(75, 23);
            this.btnOkayThen.TabIndex = 6;
            this.btnOkayThen.Text = "Okay then.";
            this.btnOkayThen.UseVisualStyleBackColor = true;
            this.btnOkayThen.Click += new System.EventHandler(this.btnOkayThen_Click);
            // 
            // frmCredits
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.LightGray;
            this.ClientSize = new System.Drawing.Size(749, 239);
            this.Controls.Add(this.btnOkayThen);
            this.Controls.Add(this.lblSquirrel);
            this.Controls.Add(this.lblHand);
            this.Controls.Add(this.lblHole);
            this.Controls.Add(this.lbl);
            this.Controls.Add(this.pictureBox2);
            this.Controls.Add(this.pictureBox1);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.FixedSingle;
            this.MaximizeBox = false;
            this.MinimizeBox = false;
            this.Name = "frmCredits";
            this.ShowIcon = false;
            this.ShowInTaskbar = false;
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterParent;
            this.Text = "Image Credits";
            this.Load += new System.EventHandler(this.Credits_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox2)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.lbl)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.PictureBox pictureBox2;
        private System.Windows.Forms.PictureBox lbl;
        private System.Windows.Forms.LinkLabel lblHole;
        private System.Windows.Forms.LinkLabel lblHand;
        private System.Windows.Forms.LinkLabel lblSquirrel;
        private System.Windows.Forms.Button btnOkayThen;
    }
}