public class Truco extends JogoDeCartas {

    @Override
    public int qtdCartasDistribuidas()
    {
        return 3;
    }

    @Override
    public int numParticipantes()
    {
        return 4;
    }

    @Override
    public void iniciar()
    {
        System.out.println("Tornaaaa");
    }

    @Override
    public void jogar()
    {
        System.out.println("SEISSS");
    }

    @Override
    public void finalizar()
    {
        System.out.println("Corro");
    }
}
