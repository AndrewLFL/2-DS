public class NomeInvalidoException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("Este campo não aceita números");
    }
}
