import java.nio.Buffer;
import java.util.Scanner; // biblioteca

public class Main {
    public static void main(String[] args)
    {
        int idade;
        String nome;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu nome?");
        nome = teclado.nextLine();
        System.out.println("Qual a sua idade?");
        idade = teclado.nextInt();
        System.out.println("Seu nome é " + nome + "\nSua idade é " + idade);
    }
}