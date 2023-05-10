using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Aula06_Ex01
{
    public partial class Form2 : Form
    {
        public Form2()
        {
            InitializeComponent();
        }

        private void textBox2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            float calc;
            try
            {
                if (radioButton1.Checked)
                {
                    calc = (float.Parse(textBox1.Text) * float.Parse(textBox3.Text));
                    label5.Text = calc.ToString("0.00");
                } else if (radioButton2.Checked)
                {
                    calc = (float.Parse(textBox2.Text) * float.Parse(textBox3.Text));
                    label5.Text = calc.ToString("0.00");
                } else
                    MessageBox.Show("Selecione um combustivel", "ATENÇÃO", MessageBoxButtons.OK, MessageBoxIcon.Warning);   
            }
            catch(Exception ex)
            {
                MessageBox.Show("Dados incorretos");
                MessageBox.Show(ex.Message);
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label5.Text = "0";
            textBox1.Clear();
            textBox2.Clear();
            textBox3.Clear();
            radioButton1.Checked = false;
            radioButton2.Checked = false;
        }
    }
}
