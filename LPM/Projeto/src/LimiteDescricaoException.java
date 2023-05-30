public class LimiteDescricaoException extends RuntimeException{
    @Override
    public String getMessage() {
        return ("Limite de caracteres excedido (200)");
    }
}
