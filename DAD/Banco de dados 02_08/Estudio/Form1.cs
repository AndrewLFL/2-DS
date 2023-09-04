using MySql.Data.MySqlClient;
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
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();

            if (DAO_Conexao.getConexao("143.106.241.3", "cl202230", "cl202230", "NamesCode"))
                Console.WriteLine("Conectado");
            else
            {
                Console.WriteLine("Erro de Conexão");
            }
        }

        private void cadastrarAlunoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form3 cad_Aluno = new Form3();
            cad_Aluno.MdiParent = this;
            cad_Aluno.Show();
        }

        private void cadastrarLoginToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form2 cad_login = new Form2();
            cad_login.MdiParent = this;
            cad_login.Show();
        }

        private void sairToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Application.Exit();
        }

        private void btnLogar_Click(object sender, EventArgs e)
        {
            int tipo = DAO_Conexao.Validar(txtLogin.Text, txtSenha.Text);
            if (tipo==0)
            {
                MessageBox.Show("Login não realizado");
            }
            if(tipo==1)
            {
                groupBox1.Visible = false;
                menuStrip1.Enabled = true;
                MessageBox.Show("Login realizado como ADM");
            }
            if (tipo == 2)
            {
                groupBox1.Visible = false;
                menuStrip1.Enabled = true;
                cadastrarAlunoToolStripMenuItem.Enabled = true;
                cadastrarLoginToolStripMenuItem.Enabled = true;
                MessageBox.Show("Login realizado como restrito");
            }
        }

        private void excluirToolStripMenuItem_Click(object sender, EventArgs e)
        {
        }

        private void excluirAlunoToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Form4 excluir = new Form4();
            excluir.MdiParent = this;
            excluir.Show();
        }

        private void arquivoToolStripMenuItem_Click(object sender, EventArgs e)
        {

        }
    }
}
