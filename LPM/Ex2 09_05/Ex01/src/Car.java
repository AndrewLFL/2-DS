public class Car implements CarbonFootprint{
    private String combustivel;
    private double cilindrada;

    @Override
    public int getCarbonFootprint()
    {
        return 2;
    }

    //m.e

    public Car(String combustivel, double cilindrada) {
        this.combustivel = combustivel;
        this.cilindrada = cilindrada;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }
}
