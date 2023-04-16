public class VIP extends Ingresso{
    private double valorAdc;

    //m.e

    public VIP(double valor, double valorAdc) {
        super(valor);
        this.valorAdc = valorAdc;
    }

    public double getValorAdc() {
        return valorAdc;
    }

    public void setValorAdc(double valorAdc) {
        this.valorAdc = valorAdc;
    }
}
