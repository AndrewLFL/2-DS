package modelDAO;

import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Servico;

public class ServicoDAO {
    private Connection con = null;
    
    public void incluir(Servico s) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String sql = "Insert into servicoJava (cod,descricao,preco) values (?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, s.getCod());
        stmt.setString(2, s.getDesc());
        stmt.setDouble(3, s.getPreco());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public void excluir(int cod) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM servicoJava WHERE cod = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, cod);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public ArrayList<Servico> consultar() throws SQLException, ClassNotFoundException 
    {
        ResultSet rs = null;
        ArrayList<Servico> lista = new ArrayList<Servico>();
        con = new Conexao().getConnection();
        String sql = "SELECT * FROM servicoJava";
        PreparedStatement stmt = con.prepareStatement(sql);
        rs = stmt.executeQuery();
        while(rs.next())
        {
            int cod = rs.getInt("cod");
            String desc = rs.getString("descricao");
            double preco = rs.getDouble("preco");
            Servico s = new Servico(cod,desc,preco);
            lista.add(s);
        }
        stmt.close();
        con.close();
        return lista;
    }
    
}
