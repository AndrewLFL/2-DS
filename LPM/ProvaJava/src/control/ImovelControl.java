/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Imovel;
import modelDAO.ImovelDAO;

/**
 *
 * @author aluno
 */
public class ImovelControl {
    public void inserir(int codigo, String tipo, String descricao, double preco) throws SQLException, ClassNotFoundException{
        Imovel im = new Imovel(codigo, tipo, descricao, preco);
        ImovelDAO imdao = new ImovelDAO();
        
        imdao.insertImovel(im);
    }
    
    public void excluir(int codigo) throws SQLException, ClassNotFoundException{
        ImovelDAO imdao = new ImovelDAO();
        
        imdao.deleteImovel(codigo);
    }
    
    public ArrayList<Imovel> buscar() throws SQLException, ClassNotFoundException{
        ImovelDAO imdao = new ImovelDAO();
        
        return (imdao.selectImovel());
    }
    
}
