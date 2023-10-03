/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelDAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Imovel;

/**
 *
 * @author aluno
 */
public class ImovelDAO {
    Connection con;
    
    public void insertImovel(Imovel im) throws SQLException, ClassNotFoundException{
        con = new Conexao().getConnection();
        
        String sql = "insert into ProvaJava (codigo, tipo, descricao, precoDia) values (?, ?, ?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, im.getCodigo());
        stmt.setString(2, im.getTipo());
        stmt.setString(3, im.getDescricao());
        stmt.setDouble(4, im.getPreco());
        
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public void deleteImovel(int cod) throws SQLException, ClassNotFoundException{
        con = new Conexao().getConnection();
        
        String sql = "delete from ProvaJava where codigo=?";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        stmt.setInt(1, cod);
        
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public ArrayList<Imovel> selectImovel() throws SQLException, ClassNotFoundException{
        ArrayList<Imovel> lista = new ArrayList<>();
        ResultSet rs;
        con = new Conexao().getConnection();
        
        String sql = "select * from ProvaJava";
        PreparedStatement stmt = con.prepareStatement(sql);
        
        rs = stmt.executeQuery();
        
        while(rs.next()){
            int codigo = rs.getInt("codigo");
            String tipo = rs.getString("tipo");
            String descricao = rs.getString("descricao");
            double preco = rs.getDouble("precoDia");
            
            Imovel im = new Imovel(codigo, tipo, descricao, preco);
            
            lista.add(im);
        }
        
        stmt.close();
        con.close();
        
        return lista;
    }
}
