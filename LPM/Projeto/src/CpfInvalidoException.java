public class CpfInvalidoException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("CPF invalido (Esse campo necessita de 11 digitos)");
    }

}
