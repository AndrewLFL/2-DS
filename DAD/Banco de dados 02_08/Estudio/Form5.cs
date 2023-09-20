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
    public partial class Form5 : Form
    {
        DialogResult resultado = DialogResult.No;
        public Form5()
        {
            InitializeComponent();
        }

        private void btnModificar_Click(object sender, EventArgs e)
        {     
            Aluno aluno = new Aluno(mtxtCPF.Text, txtNome.Text, txtEndereco.Text, txtNum.Text, txtBairro.Text, txtComp.Text, mtxtCEP.Text, txtCidade.Text, txtEstado.Text, mtxtTel.Text, txtEmail.Text);
            if (aluno.consultarAluno())
            {
                if(aluno.atualizarAluno())
                {
                    MessageBox.Show("Aluno atualizado com sucesso");
                }
                else
                {
                    MessageBox.Show("Falha na atualização!");
                }
            }
        }

        private void mtxtCPF_MaskInputRejected(object sender, MaskInputRejectedEventArgs e)
        {

        }

        private void mtxtCPF_KeyPress(object sender, KeyPressEventArgs e)
        {
            Aluno aluno = new Aluno(mtxtCPF.Text);
            if (e.KeyChar == 13)
            {
                Console.WriteLine("Entrou");
                if (aluno.consultarAluno())
                {
                    DialogResult result = MessageBox.Show("Aluno já cadastrado! Você deseja atualizar os dados?", "Aluno já existente",
                        MessageBoxButtons.YesNo);
                    if (result == DialogResult.Yes)
                    {
                        Console.WriteLine("Entrou2");
                        MySqlDataReader r = aluno.consultarAluno01();
                        r.Read();
                        txtNome.Text = r["nomeAluno"].ToString();
                        txtEndereco.Text = r["ruaAluno"].ToString();
                        txtNum.Text = r["numeroAluno"].ToString();
                        txtBairro.Text = r["bairroAluno"].ToString();
                        txtComp.Text = r["complementoAluno"].ToString();
                        mtxtCEP.Text = r["CEPAluno"].ToString();
                        txtCidade.Text = r["cidadeAluno"].ToString();
                        txtEstado.Text = r["estadoAluno"].ToString();
                        mtxtTel.Text = r["telefoneAluno"].ToString();
                        txtEmail.Text = r["emailAluno"].ToString();
                        mtxtCPF.Enabled = false;
                        resultado = result;
                    }
                }
                else
                {
                    txtNome.Focus();
                }
                DAO_Conexao.con.Close();
            }
        }
    }
}
