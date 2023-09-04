using MySql.Data.MySqlClient;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Estudio
{
    class Aluno
    {
        private String CPF;
        private String Nome;
        private String Rua;
        private String Numero;
        private String Bairro;
        private String Complemento;
        private String CEP;
        private String Cidade;
        private String Estado;
        private String Telefone;
        private String Email;
        private byte[] Foto;
        private bool Ativo;

        public bool excluirAluno()
        {
            bool exc = false;

            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand exclui = new MySqlCommand("update Estudio Aluno set ativo = 1 where CPFALuno = '"+ CPF + "'", DAO_Conexao.con);
                exclui.ExecuteNonQuery(); 
                exc = true;
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());   
            }
            finally
            {
                DAO_Conexao.con.Close();
            }
            return exc;
        }


        public bool verificaCPF() 
        {
            int soma, resto, cont = 0;
            soma = 0;
            CPF = CPF.Trim();
            CPF = CPF.Replace(".", "");
            CPF = CPF.Replace("-", "");
        }

        public bool cadastrarAluno()
        {
            bool cad = false;
            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand insere = new MySqlCommand("insert into Estudio_Aluno (CPFAluno, nomeAluno, ruaAluno, numeroAluno, bairroAluno, complementoAluno, CEPAluno, cidadeAluno, estadoAluno, telefoneAluno, emailAluno, fotoAluno) values ('" + CPF + "','" + Nome + "','" + Rua + "','" + Numero + "','" + Bairro + "','" + Complemento + "','" + CEP + "','" + Cidade + "','" + Estado + "','" + Telefone + "','" + Email + "',@foto)", DAO_Conexao.con);
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

        public bool consultarAluno()
        {
            bool existe = false;
            try
            {
                DAO_Conexao.con.Open();
                MySqlCommand consulta = new MySqlCommand("SELECT * FROM Estudio_Aluno WHERE CPFAluno = '" + CPF + "'", DAO_Conexao.con);
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
        }

        //M.E

        public Aluno(String cpf, String nome, String rua, String numero, String bairro, String complemento, String cep, String cidade, String estado, String telefone, String email, byte[] foto)
        {
            setCPF(cpf);
            setNome(nome);
            setRua(rua);
            setNumero(numero);
            setBairro(bairro);
            setComplemento(complemento);
            setCEP(cep);
            setCidade(cidade);
            setEstado(estado);
            setTelefone(telefone);
            setEmail(email);
            setFoto(foto);
        }
        public Aluno(String cpf, String nome, String rua, String numero, String bairro, String complemento, String cep, String cidade, String estado, String telefone, String email)
        {
            setCPF(cpf);
            setNome(nome);
            setRua(rua);
            setNumero(numero);
            setBairro(bairro);
            setComplemento(complemento);
            setCEP(cep);
            setCidade(cidade);
            setEstado(estado);
            setTelefone(telefone);
            setEmail(email);
        }

        public Aluno()
        {


        }
        public Aluno(string cpf)
        {

            setCPF(cpf);
        }

        public String getCPF()
        {
            return CPF;
        }

        public void setCPF(String CPF)
        {
            this.CPF = CPF;
        }

        public String getNome()
        {
            return Nome;
        }

        public void setNome(String nome)
        {
            Nome = nome;
        }

        public String getRua()
        {
            return Rua;
        }

        public void setRua(String rua)
        {
            Rua = rua;
        }

        public String getNumero()
        {
            return Numero;
        }

        public void setNumero(String numero)
        {
            Numero = numero;
        }

        public String getBairro()
        {
            return Bairro;
        }

        public void setBairro(String bairro)
        {
            Bairro = bairro;
        }

        public String getComplemento()
        {
            return Complemento;
        }

        public void setComplemento(String complemento)
        {
            Complemento = complemento;
        }

        public String getCEP()
        {
            return CEP;
        }

        public void setCEP(String CEP)
        {
            this.CEP = CEP;
        }

        public String getCidade()
        {
            return Cidade;
        }

        public void setCidade(String cidade)
        {
            Cidade = cidade;
        }

        public String getEstado()
        {
            return Estado;
        }

        public void setEstado(String estado)
        {
            Estado = estado;
        }

        public String getTelefone()
        {
            return Telefone;
        }

        public void setTelefone(String telefone)
        {
            Telefone = telefone;
        }

        public String getEmail()
        {
            return Email;
        }

        public void setEmail(String email)
        {
            Email = email;
        }

        public byte[] getFoto()
        {
            return Foto;
        }

        public void setFoto(byte[] foto)
        {
            Foto = foto;
        }

        public bool isAtivo()
        {
            return Ativo;
        }

        public void setAtivo(bool ativo)
        {
            Ativo = ativo;
        }

    }
}



