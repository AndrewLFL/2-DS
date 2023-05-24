using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;

namespace Ex_24_05
{
    public partial class Form1 : Form
    {
        int minuto=0;
        int segundo=0;
        int mili=0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            timer1.Enabled = true;
        }

        private void button3_Click(object sender, EventArgs e)
        {            
            timer1.Enabled=false;
            label1.Text = "00:00:00";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            timer1.Stop();
        }

        private void timer1_Tick(object sender, EventArgs e)
        {
            if (mili < 59)
            {
                mili++;
            }
            else if (segundo <59)
            {
                segundo++;
                mili = 0;
            }
            else if(minuto < 59)
            {
                minuto++;
                segundo = 0;
            }
            if(minuto<10)
            label1.Text = "0"+minuto + ":" + segundo + ":" + mili;
            if(segundo<10) 
            {
                label1.Text = "0" +minuto + ":" +"0" +segundo + ":" + mili;
            }
        }
    }
}
