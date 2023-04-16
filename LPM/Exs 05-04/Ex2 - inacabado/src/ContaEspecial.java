public class ContaEspecial extends ContaBancaria{
    private float limite;

    @Override
    public void sacar(double saque){
        if(getSaldo()-saque>=limite)
        {
            setSaldo(getSaldo()-saque);
        }
        else
            System.out.println("Saldo insuficiente");
    }

    //M.E


    public ContaEspecial(String cliente, int numConta, double saldo, float limite) {
        super(cliente, numConta, saldo);
        if(limite<0)
            this.limite = limite;
        else
            System.out.println("Limite positivo, insira um valor negativo");
    }

    public float getLimite() {
        return limite;
    }

    public void setLimite(float limite) {
        if(limite<0)
            this.limite = limite;
        else
            System.out.println("Limite positivo, insira um valor negativo");
    }
}
