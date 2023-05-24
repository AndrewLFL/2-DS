public class SaldoInsuficienteException extends RuntimeException{
    private double x;

    public SaldoInsuficienteException(double x)
    {
        this.x = x;
    }

    @Override
    public String getMessage(){
    return ("Saldo insuficiente, foi informado: " + x);
    }
}
