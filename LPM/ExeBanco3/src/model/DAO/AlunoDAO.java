package model.DAO;

import conexao.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import model.Aluno;

public class AlunoDAO {
    
    Connection con = null;
    
    public void inserirAluno(Aluno al) throws SQLException, ClassNotFoundException
    {
            con = new Conexao().getConnection();
            String sql = "Insert into alunoJava (ra,nome) values (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, al.getRa());
            stmt.setString(2, al.getNome());
            stmt.execute();
            stmt.close();
            con.close();
    }
}