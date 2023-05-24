public class Futebol extends JogoComBola{

    @Override
    public void setNomesEquipes(String equipe1,String equipe2){
        this.equipe1 = equipe1;
        this.equipe2 = equipe2;
    }

    @Override
    public void iniciar()
    {
        System.out.println("Bola rolando");
    }

    @Override
    public void jogar() {
        System.out.println("Bola em jogo");

    }

    @Override
    public void finalizar()
    {
        System.out.println("Apita o árbitro");
    }
}
