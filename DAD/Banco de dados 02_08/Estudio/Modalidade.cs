using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Estudio
{
    class Modalidade
    {
        private String descricao;
        private double preco;
        private int qtdeAlunos;
        private int qtdeAulas;

        public Modalidade()
        {
        }

        public Modalidade(string descricao)
        {
            this.descricao = descricao;
        }

        public Modalidade(string descricao, double preco, int qtdeAlunos, int qtdeAulas)
        {
            this.descricao = descricao;
            this.preco = preco;
            this.qtdeAlunos = qtdeAlunos;
            this.qtdeAulas = qtdeAulas;
        }

        public string Descricao { get => descricao; set => descricao = value; }
        public double Preco { get => preco; set => preco = value; }
        public int QtdeAulas { get => qtdeAulas; set => qtdeAulas = value; }
        public int QtdeAlunos { get => qtdeAlunos; set => qtdeAlunos = value; }
       
        public bool cadastrarModalidade()
        {
            bool cad = false;
            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand insere = new MySqlCommand("insert into Estudio_Modalidade (descricaoModalidade, precoModalidade, qtdeAluno, qtdeAulas) values ('" + descricao + "'" +
                    ", "+ preco + ", " + qtdeAlunos + ", " + qtdeAulas + ")", DAO_Conexao.con);
                insere.ExecuteNonQuery();
                cad = true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
            finally
            {
                DAO_Conexao.con.Close();
            }
            return cad;
        }
 /*
        public MySqlDataReader consultarModalidade()
        {
            bool existe = false;
            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand consulta = new MySqlCommand("SELECT * FROM Estudio_Modalidade WHERE CPFAluno = '" + CPF + "'", DAO_Conexao.con);
                MySqlDataReader resultado = consulta.ExecuteReader();
                if (resultado.Read())
                    existe = true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
            finally
            {
                DAO_Conexao.con.Close();
            }
            return existe;
        }*/

        public MySqlDataReader consultarTodasModalidade()
        {
            MySqlDataReader resultado = null;
            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand consulta = new MySqlCommand("SELECT * FROM Estudio_Modalidade", DAO_Conexao.con);
                Console.WriteLine("entrou");
                resultado = consulta.ExecuteReader();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
            DAO_Conexao.con.Close();
            return resultado;
        }
/*
        public bool atualizarModalidade()
        {

        }

        public bool excluirModalidade() { 
        
        }*/
    }
}
