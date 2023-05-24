public abstract class ContaBancaria {
    protected double saldo;

    public void Depositar(double valor){
        if(valor<=0)
            throw new ValorInvalidoException(valor);
        else
            setSaldo(getSaldo()+valor);
    }

    public void Sacar (double valor){
        if(valor<=0)
            throw new ValorInvalidoException(valor);
        else if(valor>getSaldo())
            throw new SaldoInsuficienteException(valor);
        else
        setSaldo(getSaldo()-valor);
    }

    public void Transferir(double valor,ContaBancaria cb){
        if(valor<=0)
            throw new ValorInvalidoException(valor);
        else if(valor>getSaldo())
            throw new SaldoInsuficienteException(valor);
        else
        {
            this.setSaldo(this.getSaldo()-valor);
            cb.setSaldo(valor+cb.getSaldo());
        }

    }

    public abstract double calcSaldo();

    //m.e

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
