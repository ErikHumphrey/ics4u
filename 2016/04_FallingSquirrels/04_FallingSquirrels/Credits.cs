using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Credits
{
    public partial class frmCredits : Form
    {
        public frmCredits()
        {
            InitializeComponent();
        }

        private void Credits_Load(object sender, EventArgs e)
        {
            lblHand.Links.Add(0, lblHand.Text.Length, "https://youtu.be/zJqX8WyAsvs?t=18s");
            lblHole.Links.Add(0, lblHole.Text.Length, "http://appinventor.mit.edu/explore/ai2/molemash-2.html");
            lblSquirrel.Links.Add(0, lblSquirrel.Text.Length, "http://stardewvalley.net/dev-update-30/");
        }

        private void btnOkayThen_Click(object sender, EventArgs e)
        {
            this.DialogResult = DialogResult.No; // Close the dialogue
        }
    }
}
