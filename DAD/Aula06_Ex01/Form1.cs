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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void calcularÓleoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if(Application.OpenForms.OfType<Form3>().Count()==0)
            {
            Form3 form = new Form3();
            form.MdiParent = this;
            form.Show();
            }

        }

        private void sairToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void calcularCombustívelToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms.OfType<Form2>().Count() == 0)
            {
                Form2 form = new Form2();
                form.MdiParent = this;
                form.Show();
            }
        }

        private void ajudaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (Application.OpenForms.OfType<Form2>().Count() == 0)
            {
                AboutBox1 about = new AboutBox1();
                about.ShowDialog();
            }
        }
    }
}
