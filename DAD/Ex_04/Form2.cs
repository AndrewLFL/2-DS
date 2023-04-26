using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Ex_04
{
    public partial class Form2 : Form
    {
        List<Form2> lista = new List<Form2>();

        public Form2()
        {
            InitializeComponent();
        }

        private void novoToolStripMenuItem_Click(object sender, EventArgs e)
        {
        if(lista.Count()<1)
            {
            try
            {
                if (Application.OpenForms["Form2"] == this)
                {
                    Form2 form2 = new Form2();
                    form2.Show();            
                    form2.BackColor = Color.Gray;
                    lista.Add(form2);
                }
            }
            catch { }
            }
        }
    }
}
