public class Moto extends Veiculos{
    private int ano;

    @Override
    public double getPreco()
    {
        return super.getPreco();
    }
    //M.E
    public Moto(String modelo, double preco, int ano)
    {
        super(modelo,preco);
        this.ano = ano;
        if (getAno()>=2008)
        {
            this.setPreco(getPreco()+getPreco()*0.10);
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
        if (getAno()>=2008)
        {
            this.setPreco(getPreco()+getPreco()*0.10);
        }
    }
}
