import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome;
        double salarioFixo, totalVendas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.println("Digite seu salário: ");
        salarioFixo = sc.nextDouble();
        System.out.println("Digite seu total de vendas no mês em dinheiro: ");
        totalVendas = sc.nextDouble();
        double com = totalVendas*15/100,
        total = com + salarioFixo;
        System.out.printf("Total a receber: " + "%.2f",total );
    }
}