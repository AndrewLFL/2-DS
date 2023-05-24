public class Cheque implements ITipoPagamento{

    protected double valorCheque;
    protected int diaCheque;

    @Override
    public int getDiasFaturamento() {
        return diaCheque=3;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return (valorCheque*0.03);
    }


}
