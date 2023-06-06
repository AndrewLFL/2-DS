using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex01
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void maskedTextBox1_MaskInputRejected(object sender, MaskInputRejectedEventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void tabControl1_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void listBox2_SelectedIndexChanged(object sender, EventArgs e)
        {

        }

        private void tabPage1_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void label2_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_KeyPress(object sender, KeyPressEventArgs e)
        {
            if(e.KeyChar == 13 && textBox1.Text!="")
            {
                maskedTextBox1.Focus();
            }
            if(e.KeyChar == 13 && textBox1.Text == "")
            {
                MessageBox.Show("Insira um evento");
            }

        }

        private void maskedTextBox1_KeyPress(object sender, KeyPressEventArgs e)
        {

            if (e.KeyChar==13)
            {
                try
                {
                    Convert.ToDateTime(maskedTextBox1.Text);
                    listBox1.Items.Add(textBox1.Text);
                    listBox2.Items.Add(maskedTextBox1.Text);
                    maskedTextBox1.Text = "";
                    textBox1.Text = "";
                    textBox1.Focus();
                }
                catch(Exception ex)
                {
                    MessageBox.Show("Insira uma data válida");
                    maskedTextBox1.Focus();
                }        
            }
        }

        private void button1_Click_1(object sender, EventArgs e)
        {
            if (listBox3.SelectedIndex == 0)
            {
                textBox2.Text = (int.Parse(textBox2.Text) + 1).ToString();
            }
            else if (listBox3.SelectedIndex == 1)
            {
                textBox3.Text = (int.Parse(textBox3.Text) + 1).ToString();
            }
            else if (listBox3.SelectedIndex == 2)
            {
                textBox4.Text = (int.Parse(textBox4.Text) + 1).ToString();
            }
            else
                MessageBox.Show("Selecione um candidato!");
            listBox3.ClearSelected();
        }

        private void listBox1_DoubleClick(object sender, EventArgs e)
        {

        }

        private void listBox1_SelectedValueChanged(object sender, EventArgs e)
        {

        }

        private void listBox2_DoubleClick(object sender, EventArgs e)
        {

        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox2.Text = "0";
            textBox3.Text = "0";
            textBox4.Text = "0";
        }

        private void listBox1_Click(object sender, EventArgs e)
        {
            try
            {
                listBox2.Items.RemoveAt(listBox2.SelectedIndex);
                listBox1.Items.RemoveAt(listBox1.SelectedIndex);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Selecione um evento");
            }
        }

        private void listBox2_Click(object sender, EventArgs e)
        {
            try
            {
                listBox1.Items.RemoveAt(listBox1.SelectedIndex);
                listBox2.Items.RemoveAt(listBox2.SelectedIndex);
            }
            catch (Exception ex)
            {
                MessageBox.Show("Selecione um evento");
            }
        }
    }
}
