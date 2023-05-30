public class CepInvalidoException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("CEP invalido (Esse campo necessita de 8 digitos)");
    }
}
