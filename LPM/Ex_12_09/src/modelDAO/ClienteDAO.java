package modelDAO;
import model.Cliente;
import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author aluno
 */
public class ClienteDAO {
    
    Connection con = null;
    
    public void incluir(Cliente c) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String sql = "Insert into clienteJava (cpf,nome) values (?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, c.getCpf());
        stmt.setString(2, c.getNome());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public void excluir(String cpf) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM clienteJava WHERE cpf = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, cpf);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public ArrayList<Cliente> buscar() throws SQLException, ClassNotFoundException
    {
        ResultSet rs;
        ArrayList<Cliente> lista = new ArrayList<Cliente>(); 
        con = new Conexao().getConnection();  
        String sql = "SELECT * FROM clienteJava";
        PreparedStatement stmt = con.prepareStatement(sql);       
        rs = stmt.executeQuery();
        while(rs.next())
        {
        String cpf = rs.getString("cpf");
        String nome = rs.getString("nome");
        Cliente c = new Cliente(cpf,nome);
        lista.add(c);
        }
        stmt.close();
        con.close();
        return lista;
    }
}
