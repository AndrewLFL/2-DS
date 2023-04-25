import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Artista a1 = new Artista(001,"Pericles", "Brasileiro");
        Artista a2 = new Artista(002,"Adele","Britanica");
        Artista a3 = new Artista(003,"Miki Matsubara", "Japonesa");
        Musica m1 = new Musica(004,"Seperação", 3,"Desliga e vem", "Pericles");
        Musica m2 = new Musica(005,"easy on me", 2,"30","Adele");
        Musica m3 = new Musica(006, "Stay with me", 1,"Cupid","Miki Matsubara");

        ArrayList<Artista> listaA = new ArrayList<Artista>();
        ArrayList<Musica> listaM = new ArrayList<Musica>();

        listaA.add(a1);
        listaA.add(a2);
        listaA.add(a3);

        listaM.add(m1);
        listaM.add(m2);
        listaM.add(m3);

        int i;
        do {
            System.out.println("Digite 0 para sair\nDigite 1 para buscar um artista (Nome)\n" +
                    "Digite 2 para buscar um artista (Nacionalidade)\n" +
                    "Digite 3 para buscar todas as musicas de um álbum");
            i = scan.nextInt();
            switch (i)
            {
                case 0:
                    break;
                case 1:
                    String nome;
                    System.out.println("Digite um nome para a pesquisa: ");
                    nome = scan.next();
                    for (Artista a : listaA)
                    {
                        if (a.getNome().equals(nome))
                        {
                            a.print();
                        }
                    }
                    break;
                case 2:
                    String nacionalidade;
                    System.out.println("Digite um nacionalidade para a pesquisa: ");
                    nacionalidade = scan.next();
                    for (Artista a : listaA)
                    {
                        if (a.getNacionalidade().equals(nacionalidade))
                        {
                            a.print();
                        }
                    }
                    break;
                case 3:
                    String album;
                    System.out.println("Digite um album para ver todas as suas musicas: ");
                    album = scan.next();
                    for (Musica m : listaM)
                    {
                        if (m.getAlbum().equals(album))
                        {
                            m.print();
                        }
                    }
                    break;
                default:
                    System.out.println("Insira uma opção!");
                    break;
            }
        }while (i!=0);

    }
}