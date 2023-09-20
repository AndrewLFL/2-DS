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
    public partial class Form7 : Form
    {
        public Form7()
        {
            InitializeComponent();
            Modalidade mod = new Modalidade();
            try
            {
                MySqlDataReader r = mod.consultarTodasModalidade();
                Console.WriteLine(r["descricaoModalidade"].ToString());
                while(r.Read())
                {
                    cbDesc.Items.Add(r["descricaoModalidade"].ToString());
                }
            }
            catch (Exception e) 
            {
                Console.WriteLine(e.ToString());
            }
            DAO_Conexao.con.Close();
        }
    }
}
