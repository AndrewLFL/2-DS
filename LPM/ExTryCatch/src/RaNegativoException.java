public class RaNegativoException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("O RA não pode ser negativo");
    }
}
