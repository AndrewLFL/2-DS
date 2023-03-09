public class Caneta {
    private String cor;
    private boolean tampada;
    private double ponta;

    public Caneta (String cor, boolean tampada, double ponta)
    {
        this.cor = cor;
        this.tampada = tampada;
        this.ponta = ponta;
    }

    public String getCor()
    {
        return cor;
    }

    public boolean getTampada()
    {
        return tampada;
    }

    public double getPonta()
    {
        return ponta;
    }


    public void escrever()
    {
        if(tampada!=true)
        System.out.println("Rabisco");
        else
        {
            System.out.println("Caneta tampada");
        }
    }

    public void tampar ()
    {
        tampada = true;
    }

    public void destampar()
    {
        tampada = false;
    }

}
