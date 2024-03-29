package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Aluno;

public class AlunoDAO 

{
    
    Connection con = null;
    
    public void inserirAluno(Aluno al) throws SQLException, ClassNotFoundException
    {
        con = new Conexao().getConnection();
        String sql = "Insert into alunoJava (ra,nome) values (?, ?)";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, al.getRa());
        stmt.setString(2, al.getNome());
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public void excluir(int ra) throws SQLException, ClassNotFoundException 
    {
        con = new Conexao().getConnection();
        String sql = "DELETE FROM alunoJava WHERE ra = ?";
        PreparedStatement stmt = con.prepareStatement(sql);
        stmt.setInt(1, ra);
        stmt.execute();
        stmt.close();
        con.close();
    }
    
    public ArrayList<Aluno> buscarAlunos() throws SQLException, ClassNotFoundException
    {
        ResultSet rs;
        ArrayList<Aluno> lista = new ArrayList<Aluno>(); 
        con = new Conexao().getConnection();  
        String sql = "SELECT * FROM alunoJava";
        PreparedStatement stmt = con.prepareStatement(sql);       
        rs = stmt.executeQuery();
        while(rs.next())
        {
        int ra = rs.getInt("ra");
        String nome = rs.getString("nome");
        Aluno al = new Aluno(ra,nome);
        lista.add(al);
        }
        stmt.close();
        con.close();
        return lista;
    }
}
