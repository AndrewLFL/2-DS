﻿using System;
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
    public partial class Form3 : Form
    {
        public Form3()
        {
            InitializeComponent();
        }

        private void label6_Click(object sender, EventArgs e)
        {

        }

        private void label7_Click(object sender, EventArgs e)
        {

        }

        private void textBox5_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnCadastro_Click(object sender, EventArgs e)
        {

            Aluno aluno = new Aluno(mtxtCPF.Text, txtNome.Text, txtEndereco.Text, txtNum.Text, txtBairro.Text, txtComp.Text, mtxtCEP.Text, txtCidade.Text, txtEstado.Text, mtxtTel.Text, txtEmail.Text);
            if (aluno.cadastrarAluno()) 
                MessageBox.Show("Cadastro realizado com Sucesso");
            else 
                MessageBox.Show("Erro no cadastro");
        }

        private void mtxtCPF_KeyPress(object sender, KeyPressEventArgs e)
        {
           Aluno aluno = new Aluno(mtxtCPF.Text);
           if (e.KeyChar == 13)
           {
             if (aluno.consultarAluno())
                {
                    MessageBox.Show("Aluno já cadastrado!");
                }
             else
                {
                    txtNome.Focus();
                }
                DAO_Conexao.con.Close();
           }
        }

        private void mtxtCPF_MaskInputRejected(object sender, MaskInputRejectedEventArgs e)
        {

        }

        private void btnFoto_Click(object sender, EventArgs e)
        {

        }
    }
}
