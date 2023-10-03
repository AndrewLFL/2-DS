package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Servico;
import modelDAO.ServicoDAO;

public class ServicoControl {
    
    public void incluir (int cod, String desc, double preco) throws SQLException, ClassNotFoundException
    {
        ServicoDAO sd = new ServicoDAO();
        Servico s = new Servico(cod,desc,preco);
        sd.incluir(s);
    }
    
    public void excluir (int cod) throws SQLException, ClassNotFoundException
    {
        ServicoDAO sd = new ServicoDAO();
        sd.excluir(cod);
    }
    
    public ArrayList<Servico> consultar () throws SQLException, ClassNotFoundException
    {
        ServicoDAO sd = new ServicoDAO();
        return sd.consultar();
    }
}
