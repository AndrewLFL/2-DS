import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        PessoaFisica pf1 = new PessoaFisica("Jorge","Rua dos Alfineiros", 19996635,477192408);
        PessoaJuridica pj1 = new PessoaJuridica("Ed Rofs","Suiça", 190,477,"Katarina Tubaroa");
        PessoaFisica pf2 = new PessoaFisica("Ayrton","Bolinhos", 199635,4771908);
        PessoaJuridica pj2 = new PessoaJuridica("Amaral","Campinos", 192,4587,"Craque");
        Eletrico el1 = new Eletrico(001,"Um produto eletrico",100.00,"metro");
        Hidraulico h1 = new Hidraulico(002,"Um produto hidraulico",200.00,"Litro");
        Alvenaria a1 = new Alvenaria(003, "Um produto de alvenaria",80.00,"Kg" );
        Eletrico el2 = new Eletrico(004,"Um produto eletrico",150.00,"metro");
        Hidraulico h2 = new Hidraulico(005,"Um produto hidraulico",250.00,"Litro");
        Alvenaria a2 = new Alvenaria(006, "Um produto de alvenaria",130.00,"Kg" );

        ArrayList<Produto> listaP = new ArrayList<Produto>();
        listaP.add(el1);
        listaP.add(el2);
        listaP.add(h1);
        listaP.add(h2);
        listaP.add(a1);
        listaP.add(a2);

        ArrayList<Cliente> listaC = new ArrayList<Cliente>();
        listaC.add(pf1);
        listaC.add(pf2);
        listaC.add(pj1);
        listaC.add(pj2);

        for (Produto p : listaP)
        {
            if (p instanceof Eletrico)
            {
                p.setPreco(p.getPreco()-p.getPreco()*0.20);
                System.out.println("Novo preço: " + p.getPreco());
                System.out.println();
            }
            else if (p instanceof Alvenaria)
            {
                if(p.getPreco()<100)
                {
                    System.out.println("Codigo: " + p.getCod() + "\nDescrição: " + p.getDescricao() +
                            "\nPreço: " + p.getPreco() + "\nUnidade: " + p.getUnidade());
                    System.out.println();
                }
            }
        }

        for (Cliente c : listaC)
        {
            if (c.getNome().charAt(0) == 'A')
            {
                c.print();
                System.out.println();
            }
        }
    }
}