public class AlturaNegativaException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("A altura não pode ser negativa");
    }
}
