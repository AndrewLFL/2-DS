using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Estudio
{
    public partial class Form5 : Form
    {
        public Form5()
        {
            InitializeComponent();
        }

        private void btnModificar_Click(object sender, EventArgs e)
        {
            Aluno a = new Aluno(mtxtCPF.Text);
            if (a.consultarAluno())
            { 
            
            }
            // UPDATE Estudio_Aluno set = 'Alfred Schmidt', City= 'Frankfurt' WHERE CPFAluno = ;
        }
    }
}
