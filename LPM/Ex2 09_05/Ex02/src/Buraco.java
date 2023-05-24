public class Buraco extends JogoDeCartas{

    @Override
    public int qtdCartasDistribuidas()
    {
        return 11;
    }

    @Override
    public int numParticipantes()
    {
        return 4;
    }

    @Override
    public void iniciar()
    {
        System.out.println("Começou o buraco");
    }

    @Override
    public void jogar()
    {
        System.out.println("Jogando buraco");
    }

    @Override
    public void finalizar()
    {
        System.out.println("Finalizando o buraco");
    }

}
