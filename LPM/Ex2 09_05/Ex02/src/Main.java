import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jogo> lista = new ArrayList<Jogo>();
        Truco t1 = new Truco();
        Buraco b1 = new Buraco();
        Futebol f1 = new Futebol();
        Volei v1 = new Volei();

        lista.add(t1);
        lista.add(b1);
        lista.add(f1);
        lista.add(v1);
        int totalCartas=0;
        int totalBolas=0;

        for(Jogo j:lista)
        {
            j.iniciar();
            j.jogar();
            if (j instanceof JogoDeCartas)
                totalCartas++;
            else
                totalBolas++;
        }
        System.out.println("Total de jogos de carta: " + totalCartas);
        System.out.println("Total de jogos de bola: " + totalBolas);



    }
}