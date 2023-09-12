package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Aluno;
import model.DAO.AlunoDAO;

public class AlunoControl {
    
    public void inserir (int ra, String nome) throws SQLException, ClassNotFoundException
    {
        Aluno al = new Aluno(ra,nome);
        AlunoDAO alDao = new AlunoDAO();
        alDao.inserirAluno(al);
    }

    public void excluir(int ra) throws SQLException, ClassNotFoundException {
       AlunoDAO alDao = new AlunoDAO(); 
       alDao.excluir(ra);      
    }
    
    public ArrayList<Aluno> buscar() throws SQLException, ClassNotFoundException 
    {
       AlunoDAO alDao = new AlunoDAO(); 
       ArrayList<Aluno> lista = alDao.buscarAlunos();  
       return lista;
    }
}
