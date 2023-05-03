using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Avaliação
{
    public partial class Form1 : Form
    {
        double total;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (String.IsNullOrEmpty(textBox1.Text)||String.IsNullOrEmpty(textBox2.Text)||String.IsNullOrEmpty(textBox3.Text))
            {
                MessageBox.Show("Não é permitido campos em branco!");
            }
            else
            {
                bool isNumericProd = textBox1.Text.Any(char.IsDigit);
                bool isNumericQuant = textBox2.Text.All(char.IsDigit);
                bool isNumericPrec = textBox3.Text.All(char.IsDigit);
                foreach(char i in textBox3.Text)
                {
                    if (i == ',')
                    {
                        isNumericPrec = true;
                    }
                }
                if (isNumericProd==true)
                {
                    MessageBox.Show("O campo produto não aceita números!");
                }
                else if (isNumericQuant==false)
                {
                    MessageBox.Show("Este campo não aceita letras!");
                }
                else if(isNumericPrec == false)
                {
                    MessageBox.Show("Este campo não aceita letras!");
                }
                else
                {
                double mult = Convert.ToDouble(textBox2.Text) * Convert.ToDouble(textBox3.Text);
                listBox1.Items.Add(textBox1.Text + " - " + mult);
                textBox1.Text = "";
                textBox2.Text = "";
                textBox3.Text = "";
                total += mult;
                }

            }
        }

        private void button2_Click(object sender, EventArgs e)
        {
            if(listBox1.Items != null && listBox1.Items.Count > 0)
            {
                label5.Text = "Total: " + total;
                MessageBox.Show("Compra efetuada com sucesso"); 
            }
            else
            {
                MessageBox.Show("Insira um produto");
            }

        }

        private void button3_Click(object sender, EventArgs e)
        {
            total = 0;
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";
            label5.Text = "Total: ";
            listBox1.Items.Clear();
        }

        private void listBox1_DoubleClick(object sender, EventArgs e)
        {
            if (listBox1.SelectedItem != null)
            { 
                string[] strArray1 = null;
                char[] splitchar1 = { '-' };
                string selectedItemString = listBox1.SelectedItem.ToString();
                strArray1 = selectedItemString.Split(splitchar1);
                total -= Convert.ToDouble(strArray1[1]);
                label5.Text = "Total: " + total;
                listBox1.Items.Remove(listBox1.SelectedItem);

            }
        }
    }
}
