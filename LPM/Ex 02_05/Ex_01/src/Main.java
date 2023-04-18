import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Livro l1 = new Livro(001,"ONE PIECE",60,"ECHIRO ODA");
        CD cd1 = new CD(002,"GALINHA PINTADINHA",1.90,5);
        DVD dvd1 = new DVD(003,"APENAS UM SHOW",20.99,1.20);
        Livro l2 = new Livro(004,"HOBBIT",90.00,"TOLKIEN");
        CD cd2 = new CD(005,"BONDE DO TIGRÃO",10.50,7);
        DVD dvd2 = new DVD(006,"TURMA DA MONICA",15,1.50);

        Scanner scan = new Scanner(System.in);
        ArrayList<Produto> lista = new ArrayList<Produto>();
        lista.add(l1);
        lista.add(cd1);
        lista.add(dvd1);
        lista.add(l2);
        lista.add(cd2);
        lista.add(dvd2);

        for(Produto p:lista)
        {
            if(p instanceof Livro)
            {
                Livro l=(Livro) p;
                System.out.println(l.toString());
            }
            else if (p instanceof CD)
            {
                CD cd =(CD) p;
                System.out.println(cd.toString());
            }
            else
            {
                DVD dvd =(DVD) p;
                System.out.println(dvd.toString());
            }
        }
        System.out.println();
        System.out.println("Insira o código e busque pelo produto aqui: ");
        int codigo = scan.nextInt();
        boolean achou=false;
        for(Produto p:lista)
        {
            if(codigo == p.getCod())
            {
                achou = true;
                if(p instanceof Livro)
                {
                        Livro l=(Livro) p;
                    System.out.println(l.toString());
                }
                else if (p instanceof CD)
                {
                        CD cd=(CD) p;
                    System.out.println(cd.toString());
                }
                else
                {
                        DVD dvd=(DVD) p;
                    System.out.println(dvd.toString());
                }
            }
        }
        if (!achou)
            System.out.println("Produto não encontrado!");
        System.out.println();
        System.out.println("Digite 1 para ver todos os Livros\n" +
                "Digite 2 para ver todos os CDs\n" +
                "Digite 3 para ver todos os DVDs");
        int i = scan.nextInt();
        switch (i)
        {
            case 1:
                for(Produto p : lista)
                {
                    if(p instanceof Livro) {
                        Livro l = (Livro) p;
                        System.out.println(l.toString());
                        System.out.println();
                    }
                }
                break;
            case 2:
                for(Produto p : lista)
                {
                    if(p instanceof CD)
                    {
                        CD cd=(CD) p;
                    System.out.println(cd.toString());
                        System.out.println();
                    }
                }
                break;
            case 3:
                for(Produto p : lista)
                {
                    if(p instanceof DVD) {
                        DVD dvd = (DVD) p;
                        System.out.println(dvd.toString());
                        System.out.println();
                    }
                }
                break;
            default:
                System.out.println("Categoria não encontrada");
                break;
        }
    }
}