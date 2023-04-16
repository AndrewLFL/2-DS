public class ContaBancaria {
    protected String cliente;
    protected int numConta;
    protected double saldo;

    public void sacar(double saque){
        if(getSaldo()-saque>=0)
        {
            setSaldo(getSaldo()-saque);
        }
        else
            System.out.println("Saldo insuficiente");
    }

    public void depositar(){

    }

    //M.E

    public ContaBancaria(String cliente, int numConta, double saldo) {
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
