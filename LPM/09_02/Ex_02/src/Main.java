import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0,idade = 0 ,n = 0;
        double media;
do
        {
            System.out.println("Digite a idade da criança: ");
            idade = scan.nextInt();
            if(idade<=0) {
                break;
            }
            sum += idade;
            n++;
        }        while (idade>0);
        media = (double) sum/n;
        System.out.println("A media das idades é: " + media);
    }
}