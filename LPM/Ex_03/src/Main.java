import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double precoCusto, lucro, precoVenda;
        for (int p = 0; p<20; p++)
        {
            System.out.println("Digite o preço de custo do produto: ");
            precoCusto = scan.nextDouble();
            if (precoCusto<100)
            {
                lucro = 20;
                precoVenda = precoCusto + lucro;
                System.out.printf("O preço de venda é: R$%.2f\n",precoVenda);
            }
            else
            {
                lucro = 50;
                precoVenda = precoCusto + lucro;
                System.out.printf("O preço de venda é: R$%.2f\n",precoVenda);
            }
        }

    }
}