using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculadora
{
    public partial class Form1 : Form
    {
        int ope;

        public Form1()
        {
            InitializeComponent();
        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void button07_Click(object sender, EventArgs e)
        {
            textBox1.Text += "7";
        }

        private void button08_Click(object sender, EventArgs e)
        {
            textBox1.Text += "8";
        }

        private void button09_Click(object sender, EventArgs e)
        {
            textBox1.Text += "9";
        }

        private void button04_Click(object sender, EventArgs e)
        {
            textBox1.Text += "4";
        }

        private void button05_Click(object sender, EventArgs e)
        {
            textBox1.Text += "5";
        }

        private void button06_Click(object sender, EventArgs e)
        {
            textBox1.Text += "6";
        }

        private void button01_Click(object sender, EventArgs e)
        {
            textBox1.Text += "1";
        }

        private void button02_Click(object sender, EventArgs e)
        {
            textBox1.Text += "2";
        }

        private void button03_Click(object sender, EventArgs e)
        {
            textBox1.Text += "3";
        }

        private void button00_Click(object sender, EventArgs e)
        {
            textBox1.Text += "0";
        }

        private void ponto_Click(object sender, EventArgs e)
        {
            if(!(textBox1.Text.Contains(","))){
               if (String.IsNullOrEmpty(textBox1.Text))
               {
                    textBox1.Text += "0,";
               }
               else
                    textBox1.Text += ",";
            }

        }

        private void igual_Click(object sender, EventArgs e)
        {
            switch(ope){
                case 1:
                    double v1,v2;
                    string[] strArray1 = null;
                    char[] splitchar1 = {'/'};

                    strArray1 =textBox1.Text.Split(splitchar1);
                    if (!String.IsNullOrEmpty(strArray1[0]) && !String.IsNullOrEmpty(strArray1[1]))
                    {
                        v1 = Convert.ToDouble(strArray1[0]);
                        v2 = Convert.ToDouble(strArray1[1]);
                    if (v2==0)
                    {
                        textBox1.Text = "erro!";
                    }
                    else
                    {

                    double result1 = v1 / v2;                       
                    textBox1.Text = Convert.ToString(result1); 
                    }
                    }
                    break;      
                case 2:
                    double v01, v02;
                    string[] strArray2 = null;
                    char[] splitchar2 = { '*' };

                    strArray2 = textBox1.Text.Split(splitchar2);
                    if (!String.IsNullOrEmpty(strArray2[0]) && !String.IsNullOrEmpty(strArray2[1]))
                    {
                        v01 = Convert.ToDouble(strArray2[0]);
                    v02 = Convert.ToDouble(strArray2[1]);
                    double result2 = v01 * v02;
                    textBox1.Text = Convert.ToString(result2);
                    }

                    break;
                case 3:
                    double v3, v4;
                    string[] strArray3 = null;
                    char[] splitchar3 = { '+' };

                    strArray3 = textBox1.Text.Split(splitchar3);
                    if (!String.IsNullOrEmpty(strArray3[0]) && !String.IsNullOrEmpty(strArray3[1]))
                    {
                        v3 = Convert.ToDouble(strArray3[0]);
                        v4 = Convert.ToDouble(strArray3[1]);
                        double result3 = v3 + v4;
                        textBox1.Text = Convert.ToString(result3);
                    }
                    break;
                case 4:
                    double v03, v04;
                    string[] strArray4 = null;
                    char[] splitchar4 = { '-' };

                    strArray4 = textBox1.Text.Split(splitchar4);
                    if (!String.IsNullOrEmpty(strArray4[0]) && !String.IsNullOrEmpty(strArray4[1]))
                    {
                        v03 = Convert.ToDouble(strArray4[0]);
                        v04 = Convert.ToDouble(strArray4[1]);
                        double result4 = v03 - v04;
                        textBox1.Text = Convert.ToString(result4);
                    }
                    break;
                default:
                    textBox1.Text = "erro!";
                    break;
            }
        }

        private void dividir_Click(object sender, EventArgs e)
        {
            textBox1.Text += "/";
            ope = 1;
        }

        private void vezes_Click(object sender, EventArgs e)
        {
            textBox1.Text += "*";
            ope = 2;
        }

        private void soma_Click(object sender, EventArgs e)
        {
            textBox1.Text += "+";
            ope = 3;
        }

        private void menos_Click(object sender, EventArgs e)
        {
            textBox1.Text += "-";
            ope = 4;
        }

        private void apagar_Click(object sender, EventArgs e)
        {
            textBox1.Text = textBox1.Text.Remove(textBox1.TextLength - 1);
        }

        private void limpar_Click(object sender, EventArgs e)
        {
            textBox1.Clear();
        }
    }
}
