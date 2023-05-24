import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Empregado> lista = new ArrayList<Empregado>();
        Assalariado a1 = new Assalariado("Pablo", "Escobar","12345687",2000);
        Assalariado a2 = new Assalariado("Camila", "Pamela","12344687",1500);
        Comissionado c1 = new Comissionado("J","Bernardis","123456788",100,0.1);
        Comissionado c2 = new Comissionado("M","Gambaro","123256788",10,500);
        Horista h1 = new Horista("Joana","D'arc","789456212",50,5);
        Horista h2 = new Horista("Arvore","Mistica","765456212",900,27);
        lista.add(a1);
        lista.add(c1);
        lista.add(h1);
        lista.add(a2);
        lista.add(c2);
        lista.add(h2);
        double total=0;
        for(Empregado e :lista)
        {
            if (e instanceof Comissionado)
            {
                Comissionado c = (Comissionado) e;
                total+=c.getTotalVenda();
            }
        }
        System.out.println("O total de vendas dos Comissionados é: " + total);
    }
}