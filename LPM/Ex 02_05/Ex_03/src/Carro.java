public class Carro extends Veiculos{
    double km;

    @Override
    public double getPreco()
    {
        return super.getPreco();
    }
    //M.E

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
        if (getKm()>100000)
        {
            setPreco(getPreco()-getPreco()*0.08);
        }
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }
}
