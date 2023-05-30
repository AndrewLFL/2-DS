public class NegativoException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("Este campo não pode ser negativa");
    }
}
