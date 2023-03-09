import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Funcionario("Robert", "Alvez", 1200.0);
        System.out.println("Digite seu nome, sobrenome e seu Salário Mensal");
        f1.setNome(scan.nextLine());
        f1.setSobrenome(scan.nextLine());
        f1.setSalarioMensal(scan.nextDouble());
        f1.mostrarSalarioAnual();
        f2.mostrarSalarioAnual();
        f1.aumentar();
        f2.aumentar();
        f1.mostrarSalarioAnual();
        f2.mostrarSalarioAnual();
    }
}