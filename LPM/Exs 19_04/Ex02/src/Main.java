import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Novo n1 = new Novo("Rua Arthur Paulino Araújo",3200,500);
    Antigo a1 = new Antigo("Rua Joâo d'Dona",1800,200);
    Novo n2 = new Novo("Rua Tira Dentes",5000,1200);
    Antigo a2 = new Antigo("Rua Jorge Amado",2000,50);
    ArrayList<Imovel>lista=new ArrayList<Imovel>();
    lista.add(n1);
    lista.add(n2);
    lista.add(a1);
    lista.add(a2);
    for(Imovel i:lista)
    {
        if (i instanceof Novo)
        {
            Novo n=(Novo) i;
            n.mostra();
            System.out.println("**Preço total: R$"+n.precoTotal());
            System.out.println("\n");
        }
    }
    }
}