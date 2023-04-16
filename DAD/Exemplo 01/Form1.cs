using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exemplo_01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            /*
            if (textBox1.Text.ToUpper() == "COTIL")
                label2.Text = "Acertou";
            else
                label2.Text = "Errou";*/

            switch(textBox1.Text.ToUpper())
            {
                case "COTIL":
                    label2.Text = "Acertou";
                    break;
                case "UNICAMP":
                    label2.Text = "Acertou";
                    break;
                default:
                    label2.Text = "Errou";
                    break;
            }
        }
    }
}
