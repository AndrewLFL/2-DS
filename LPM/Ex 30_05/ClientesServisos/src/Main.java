import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList pet = new ArrayList();

        try {
            pet.add(-1);
        }
        catch (IllegalArgumentException e )
        {
            System.out.println(e.getMessage());
        }
        System.out.println("********FIM********");

    }
}