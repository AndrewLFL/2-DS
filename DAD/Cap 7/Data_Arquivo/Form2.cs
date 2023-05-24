using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.IO;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Data_Arquivo
{
    public partial class Form2 : Form
    {
        int op;
        public Form2()
        {
            InitializeComponent();
        }

        private void label4_Click(object sender, EventArgs e)
        {
            op = 5;
            pintar();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(op == 6)
            {
                label6.Text = textBox2.Text;
            }
            if (op == 7)
            {
                label7.Text = textBox2.Text;
            }
            if (op == 8)
            {
                label8.Text = textBox2.Text;
            }
            if (op == 9)
            {
                label9.Text = textBox2.Text;
            }
            if (op == 10)
            {
                label10.Text = textBox2.Text;
            }
            else
            {
                MessageBox.Show("Escolha um horário");
            }
        }

        private void monthCalendar1_DateChanged(object sender, DateRangeEventArgs e)
        {
            textBox2.Text = monthCalendar1.SelectionRange.Start.ToString("MM/dd/yyyy");

        }

        private void label6_Click(object sender, EventArgs e)
        {
            op = 6;
            pintar();
        }

        private void label2_Click(object sender, EventArgs e)
        {
            op = 1;
            pintar();
            Label2.BackColor = Color.LightGreen;
        }

        private void pintar()
        {
            foreach(Label controle in tableLayoutPanel1.Controls)
            {
                controle.BackColor = Color.White;
            }
        }

        private void label3_Click(object sender, EventArgs e)
        {
            op = 2;
            pintar();
        }

        private void label1_Click(object sender, EventArgs e)
        {
            op = 3;
            pintar();
        }

        private void label5_Click(object sender, EventArgs e)
        {
            op = 4;
            pintar();
        }

        private void label7_Click(object sender, EventArgs e)
        {
            op = 7;
            pintar();
        }

        private void label8_Click(object sender, EventArgs e)
        {
            op = 8;
            pintar();
        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }

        private void label9_Click(object sender, EventArgs e)
        {
            op = 9;
            pintar();
        }

        private void label10_Click(object sender, EventArgs e)
        {
            op = 10;
            pintar();
        }

        private void button2_Click(object sender, EventArgs e)
        {
            String nome_arq = monthCalendar1.SelectionRange.Start.ToLongDateString();
            StreamWriter arquivo;

            if (System.IO.File.Exists("C:\\Users\\aluno\\Documents\\" + nome_arq + ".txt"))
                File.Delete("C:\\Users\\aluno\\Documents\\" + nome_arq + ".txt");
            arquivo = new StreamWriter("C:\\Users\\aluno\\Documents\\" + nome_arq + ".txt");

            foreach (Label controle in tableLayoutPanel1.Controls)
            {
                arquivo.WriteLine(controle.Text);
            }
            arquivo.Close();

            MessageBox.Show("Aquivo Gravado com Sucesso!", "Finalização", MessageBoxButtons.OK, MessageBoxIcon.Information);
        }
    }
}
