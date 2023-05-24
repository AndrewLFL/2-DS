public class CartaoCredito implements TipoPagamento{
    private double valor;

    public int getDiasFat()
    {
        return 20;
    }
    public double getPorcentagemFinanceiraPaga(){
        return 0.1;
    }

    //m.e

    public CartaoCredito(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
