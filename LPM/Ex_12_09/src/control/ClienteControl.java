package control;
import java.sql.SQLException;
import java.util.ArrayList;
import modelDAO.ClienteDAO;
import model.Cliente;

public class ClienteControl {
    public void incluir(String cpf, String nome) throws SQLException, ClassNotFoundException 
    {
        Cliente c = new Cliente(cpf,nome);
        ClienteDAO cDao = new ClienteDAO();
        cDao.incluir(c);
    }
    
    public void excluir(String cpf) throws SQLException, ClassNotFoundException 
    {
        ClienteDAO cDao = new ClienteDAO();
        cDao.excluir(cpf);
    }
        
    public ArrayList<Cliente> buscar() throws SQLException, ClassNotFoundException 
    {
        ClienteDAO cDao = new ClienteDAO();
        return cDao.buscar();
    }
}
