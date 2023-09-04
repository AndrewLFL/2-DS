package control;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Atleta;

public class AtletaControl {
        
    private ArrayList<Atleta> listaAtleta = new ArrayList<Atleta>();
        
    public ArrayList<Atleta> getlistaAtleta()
    {
        return listaAtleta;
    }
    
    public void excluir(String cod)
    {
        boolean v=false;
            for(int i=0;i<listaAtleta.size();i++)
            {
                if(listaAtleta.get(i).getCod().equals(cod))
                {
                    v = true;
                    int resposta = JOptionPane.showConfirmDialog( null,"Tem certeza que deseja excluir o atleta " + listaAtleta.get(i).getNome() + "?", "Exclusão",JOptionPane.YES_NO_OPTION);
                    if(resposta == 0)
                    {
                        listaAtleta.remove(listaAtleta.get(i));  
                        JOptionPane.showMessageDialog(null,"Atleta excluido com sucesso!");  
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Atleta não excluido!");  
                    }
                }
            }
    if(v==false)
    {
       JOptionPane.showMessageDialog(null,"Atleta não encontrado!");  
    }
    }

    public void cadastrar(String cod, String nome, double peso,double altura,int idade)
    {
        Atleta a = new Atleta(cod,nome,peso,altura,idade);
        listaAtleta.add(a);
    }
    
    public double mediaPesos(){
    double soma=0;
    for(Atleta a : listaAtleta){
        soma+=a.getPeso();
    }
    return soma/listaAtleta.size();
    }
    
    public int maisAlto(){
    int index=0;
    double maior = listaAtleta.get(0).getAltura();
    for(int i=0; i<listaAtleta.size();i++)
    {
        if(listaAtleta.get(i).getAltura()>maior)
        {
            maior = listaAtleta.get(i).getAltura();
            index=i;
        }
    }
    return index;
    } 
    
    public int maiorDeIdade(){
        int cont=0;
        for(Atleta a : listaAtleta)
        {
            if(a.getIdade()>=18)
            {
                cont++;
            }
        }
        return cont;
    }
    
    public int menorDeIdade(){       
        int cont=0;
        for(Atleta a : listaAtleta)
        {
            if(a.getIdade()<=18)
            {
                cont++;
            }
        }
        return cont;
    }
    
    public ArrayList<Atleta> buscar(String input,int op)
    { 
        ArrayList<Atleta> lista = new ArrayList<Atleta>();   
        switch(op)
        {
            case 1:
                for(Atleta a : listaAtleta)
                {
                    if(a.getCod().equals(input))
                    {
                        lista.add(a);
                    }
                }
                break;
            case 2:
                for(Atleta a : listaAtleta)
                {
                    if(a.getNome().equals(input))
                    {
                        lista.add(a);
                    }
                }
                break;
            case 3:
                for(Atleta a : listaAtleta)
                {
                    if(a.getPeso() == Double.parseDouble(input))
                    {
                        lista.add(a);
                    }
                }
                break; 
            case 4:
                for(Atleta a : listaAtleta)
                {
                    if(a.getAltura() == Double.parseDouble(input))
                    {
                        lista.add(a);
                    }
                }
                break;   
            case 5:
                for(Atleta a : listaAtleta)
                {
                    if(a.getIdade() == Integer.parseInt(input))
                    {
                        lista.add(a);
                    }
                }
                break;                 
        }
        return lista;  
       
    }
}
