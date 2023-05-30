public class SenhaInvalidaException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("Senha invalido (Esse campo necessita de 8 digitos)");
    }
}
