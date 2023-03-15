import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double base,altura;
        System.out.println("Digite a Base e a Altura do Retangulo");
        base = scan.nextDouble();
        altura = scan.nextDouble();
        Retangulo r = new Retangulo();
        r.setAltura(altura);
        r.setBase(base);
        System.out.println("O perimetro do Retangulo é: " + r.perimetro());
        System.out.println("A area do Retangulo é: " + r.area());

    }
}