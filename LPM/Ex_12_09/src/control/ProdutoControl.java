package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Produto;
import modelDAO.ProdutoDAO;

/**
 *
 * @author aluno
 */
public class ProdutoControl {
    public void incluir(String cpf, String nome) throws SQLException, ClassNotFoundException 
    {
        Produto p = new Produto(cpf,nome);
        ProdutoDAO pDao = new ProdutoDAO();
        pDao.incluir(p);
    }
    
    public void excluir(String cpf) throws SQLException, ClassNotFoundException 
    {
        ProdutoDAO pDao = new ProdutoDAO();
        pDao.excluir(cpf);
    }
        
    public ArrayList<Produto> buscar() throws SQLException, ClassNotFoundException 
    {
        ProdutoDAO pDao = new ProdutoDAO();
        return pDao.buscar();
    }   
}
