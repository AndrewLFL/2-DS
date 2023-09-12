package modelDAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;

public class ProdutoDAO {
    
    Connection con = null;
    
    public void incluir(Produto p) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String sql = "Insert into produtoJava (id,nome) values (?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, p.getId());
        stmt.setString(2, p.getNome());
        stmt.execute();
        stmt.close();
        con.close();
    }

    public void excluir(String id) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM produtoJava WHERE id = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setString(1, id);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public ArrayList<Produto> buscar() throws SQLException, ClassNotFoundException
    {
        ResultSet rs;
        ArrayList<Produto> lista = new ArrayList<Produto>(); 
        con = new Conexao().getConnection();  
        String sql = "SELECT * FROM produtoJava";
        PreparedStatement stmt = con.prepareStatement(sql);       
        rs = stmt.executeQuery();
        while(rs.next())
        {
        String id = rs.getString("id");
        String nome = rs.getString("nome");
        Produto p = new Produto(id,nome);
        lista.add(p);
        }
        stmt.close();
        con.close();
        return lista;
    }    
}
