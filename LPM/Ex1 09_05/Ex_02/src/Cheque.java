public class Cheque implements TipoPagamento{
    private double valor;

    public int getDiasFat()
    {
        return 3;
    }
    public double getPorcentagemFinanceiraPaga(){
        return 0.3;
    }

    //m.e
    public Cheque(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
