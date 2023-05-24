import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        try {
            Quadrado q1 = new Quadrado(-2);
        }catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }

        try {
            Retangulo r1=new Retangulo(2,2);
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
            System.out.println("**FIM**");
    }
}