using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.IO;

namespace Exemplo01
{
    public partial class Form2 : Form
    {
        int op;

        public Form2()
        {
            InitializeComponent();
        }

        private void monthCalendar1_DateChanged(object sender, DateRangeEventArgs e)
        {
            string nome_arq = monthCalendar1.SelectionRange.Start.ToLongDateString();

                textBox1.Text = monthCalendar1.SelectionRange.Start.ToLongDateString();
        }

        private void label7_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 7;
            label2.BackColor = Color.LightBlue;
            label7.BackColor = Color.LightBlue;
        }

        private void label8_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 8;
            label3.BackColor = Color.LightBlue;
            label8.BackColor = Color.LightBlue;
        }

        private void label9_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 9;
            label4.BackColor = Color.LightBlue;
            label9.BackColor = Color.LightBlue;
        }

        private void label10_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 10;
            label5.BackColor = Color.LightBlue;
            label10.BackColor = Color.LightBlue;
        }

        private void label11_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 11;
            label6.BackColor = Color.LightBlue;
            label11.BackColor = Color.LightBlue;
        }

        private void button1_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            switch (op)
            {
                case 7:
                label7.Text = textBox2.Text;
                break;
                case 8:
                label8.Text = textBox2.Text;
                break;
                case 9:
                label9.Text = textBox2.Text;
                break;
                case 10:
                label10.Text = textBox2.Text;
                break;
                case 11:
                label11.Text = textBox2.Text;
                break;

                default:
                    MessageBox.Show("Escolha um horário");
                    break;

            }
        }

        private void button2_Click(object sender, EventArgs e)
        {

            string nome_arq = monthCalendar1.SelectionRange.Start.ToLongDateString();
            StreamWriter arquivo;
            if (System.IO.File.Exists("D:\\" + nome_arq + ".txt"))
                File.Delete("D:\\" + nome_arq + ".txt");
            arquivo = new StreamWriter("D:\\" + nome_arq + ".txt");

            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                arquivo.WriteLine(controle.Text);
            }
            arquivo.Close();
            MessageBox.Show("Arquivo gravado com sucesso!","Finalização", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }

        private void label2_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 7;
            label2.BackColor = Color.LightBlue;
            label7.BackColor = Color.LightBlue;
        }

        private void label3_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 8;
            label3.BackColor = Color.LightBlue;
            label8.BackColor = Color.LightBlue;
        }

        private void label4_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 9;
            label4.BackColor = Color.LightBlue;
            label9.BackColor = Color.LightBlue;
        }

        private void label5_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 10;
            label5.BackColor = Color.LightBlue;
            label10.BackColor = Color.LightBlue;
        }

        private void label6_Click(object sender, EventArgs e)
        {
            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.LightGray;
            }
            op = 11;
            label6.BackColor = Color.LightBlue;
            label11.BackColor = Color.LightBlue;
        }

        private void label7_DoubleClick(object sender, EventArgs e)
        {
            label7.Text = "Disponível";
        }

        private void label8_DoubleClick(object sender, EventArgs e)
        {
            label8.Text = "Disponível";
        }

        private void label9_DoubleClick(object sender, EventArgs e)
        {
            label9.Text = "Disponível";
        }

        private void label10_DoubleClick(object sender, EventArgs e)
        {
            label10.Text = "Disponível";
        }

        private void label11_DoubleClick(object sender, EventArgs e)
        {
            label11.Text = "Disponível";
        }

        private void label2_DoubleClick(object sender, EventArgs e)
        {
            label7.Text = "Disponível";
        }

        private void label3_DoubleClick(object sender, EventArgs e)
        {
            label8.Text = "Disponível";
        }

        private void label4_DoubleClick(object sender, EventArgs e)
        {
            label9.Text = "Disponível";
        }

        private void label5_DoubleClick(object sender, EventArgs e)
        {
            label10.Text = "Disponível";
        }

        private void label6_DoubleClick(object sender, EventArgs e)
        {
            label11.Text = "Disponível";
        }
    }
}
