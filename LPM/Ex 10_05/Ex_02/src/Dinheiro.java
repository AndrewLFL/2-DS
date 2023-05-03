public class Dinheiro implements TipoPagamento{
    private double valor;

    public int getDiasFat()
    {
        return 0;
    }
    public double getPorcentagemFinanceiraPaga(){
        return 0;
    }

    //m.e

    public Dinheiro(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
