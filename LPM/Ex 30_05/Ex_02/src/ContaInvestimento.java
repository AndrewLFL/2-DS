public class ContaInvestimento extends ContaBancaria{
    @Override
    public double calcSaldo(){
        return getSaldo()+getSaldo()*0.05;
    }

    //m.e

    public ContaInvestimento (double saldo) {
        super(saldo);
    }
}
