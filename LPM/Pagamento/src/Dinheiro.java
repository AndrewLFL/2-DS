public class Cartao implements ITipoPagamento{

    protected double valorCartao;
    protected int diaCartao;

    @Override
    public int getDiasFaturamento() {
        return diaCartao=20;
    }

    @Override
    public double getPorcentagemFinanceiraPaga() {
        return valorCartao = (valorCartao*0.1);
    }

}
