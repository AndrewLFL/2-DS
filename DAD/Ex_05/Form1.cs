using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_05
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            Boolean achou=false;
            for (int i = 0; i <= 100; i += 25)
                progressBar1.Value = i;
            foreach(string lista in listBox1.Items)
            {
                if(lista == comboBox1.Text)
                {
                    achou = true;
                    break;
                }
            }
            if(achou==false)
            {
                listBox1.Items.Add(comboBox1.Text);
            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
                if (this.listBox1.SelectedItem != null)
                    this.listBox1.Items.Remove(this.listBox1.SelectedItem);
        }
    }
}
