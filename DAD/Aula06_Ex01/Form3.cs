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
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }

        private void comboBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            label5.Text = "0";
            textBox1.Clear();
            comboBox1.Text = "";
        }

        private void button1_Click(object sender, EventArgs e)
        {
            float calc;
            try
            {
                if (comboBox1.SelectedIndex==0)
                {
                    calc = float.Parse(textBox1.Text)*20;
                    label5.Text = calc.ToString("0.00");
                }
                else if (comboBox1.SelectedIndex == 1)
                {
                    calc = float.Parse(textBox1.Text)*40;
                    label5.Text = calc.ToString("0.00");
                }
                else
                    MessageBox.Show("Selecione um frasco", "ATENÇÃO", MessageBoxButtons.OK, MessageBoxIcon.Warning);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Dados incorretos");
                MessageBox.Show(ex.Message);
            }
        }
    }
}
