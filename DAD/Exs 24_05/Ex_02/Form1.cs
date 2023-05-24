using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_02
{
    public partial class Form1 : Form
    {
        int segundo = 0;

        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Enabled = true;
            pictureBox4.Visible = true;
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            segundo++;            
            if (segundo == 3 && pictureBox6.Visible == true)
            {
                pictureBox4.Visible = true;
                pictureBox6.Visible = false;
                pictureBox5.Visible = false;
            }
            if (segundo == 5 && pictureBox5.Visible == true)
            {
                pictureBox4.Visible = false;
                pictureBox6.Visible = true;
                pictureBox5.Visible = false;
            }
            if (segundo==10 && pictureBox4.Visible == true)
            {
                pictureBox4.Visible = false;
                pictureBox6.Visible = false;
                pictureBox5.Visible = true;
            }
        }
    }
}
