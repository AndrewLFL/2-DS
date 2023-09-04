package exception;

public class StringVaziaException extends RuntimeException{
    
    @Override
    public String getMessage(){
    return ("Este campo deve ser preenchido!");
    }
}
