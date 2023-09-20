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
    public partial class Form6 : Form
    {
        public Form6()
        {
            InitializeComponent();
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            Modalidade modalidade = new Modalidade(txtDesc.Text, Convert.ToDouble(txtPreco.Text) , Convert.ToInt32(txtAlunos.Text), Convert.ToInt32(txtAulas.Text));
            if (modalidade.cadastrarModalidade())
            {
                MessageBox.Show("Cadastro realizado!");
            }
        }
    }
}
