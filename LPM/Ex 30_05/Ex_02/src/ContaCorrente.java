public class ContaCorrente extends ContaBancaria{

    @Override
    public double calcSaldo(){
        return getSaldo()-getSaldo()*0.1;
    }

    //m.e

    public ContaCorrente(double saldo) {
        super(saldo);
    }
}
