public class NomeNuloException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("O nome não pode ser nulo");
    }
}
