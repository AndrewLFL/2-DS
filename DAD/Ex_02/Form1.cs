﻿using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_02
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            label4.Text = "";
            if (checkBox1.Checked)
                label4.Text += checkBox1.Text+" ";
            if (checkBox2.Checked)
                label4.Text += checkBox2.Text + " ";
            if (checkBox3.Checked)
                label4.Text += checkBox3.Text + " ";
            if (checkBox4.Checked)
                label4.Text += checkBox4.Text + " ";
        }
    }
}
