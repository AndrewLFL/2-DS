public class ValorInvalidoException extends RuntimeException{

    private double x;

    public ValorInvalidoException(double x)
    {
        this.x = x;
    }

    @Override
    public String getMessage(){
        return ("Valor invalido, foi informado: " + x);
    }

}
