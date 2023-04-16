public class ContaPoupanca extends ContaBancaria{
    private int diaRendimento;

    public void calcularNovoSaldo(double taxaRendimento){
    setSaldo(getSaldo()*taxaRendimento);
    }

    //M.E

    public ContaPoupanca(String cliente, int numConta, double saldo, int diaRendimento) {
        super(cliente, numConta, saldo);
        this.diaRendimento = diaRendimento;
    }

    public int getDiaRendimento() {
        return diaRendimento;
    }

    public void setDiaRendimento(int diaRendimento) {
        this.diaRendimento = diaRendimento;
    }
}
