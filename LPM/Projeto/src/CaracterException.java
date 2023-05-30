public class CaracterException extends RuntimeException{
    @Override
    public String getMessage(){
        return ("Este campo não aceita letras");
    }
}
