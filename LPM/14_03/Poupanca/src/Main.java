import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat("#,##0.00");
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
    Poupanca p1 = new Poupanca(2000,001);
    Poupanca p2 = new Poupanca(3000,002);
    Poupanca.modificarTaxaJuros(0.03);
    System.out.println("O juros da conta "+ p1.getCod() + " é de R$" +  decimalFormat.format(p1.calcJurosMensais()));
    System.out.println("O juros da conta "+ p2.getCod() + " é de R$" +  decimalFormat.format(p2.calcJurosMensais()));
    System.out.println("O saldo da conta "+ p1.getCod() + " é de R$" +  decimalFormat.format(p1.getSaldo()));
    System.out.println("O saldo da conta "+ p2.getCod() + " é de R$" +  decimalFormat.format(p2.getSaldo()));
    Poupanca.modificarTaxaJuros(0.04);
        System.out.println("O juros da conta "+ p1.getCod() + " é de R$" +  decimalFormat.format(p1.calcJurosMensais()));
        System.out.println("O juros da conta "+ p2.getCod() + " é de R$" +  decimalFormat.format(p2.calcJurosMensais()));
        System.out.println("O saldo da conta "+ p1.getCod() + " é de R$" +  decimalFormat.format(p1.getSaldo()));
        System.out.println("O saldo da conta "+ p2.getCod() + " é de R$" +  decimalFormat.format(p2.getSaldo()));
    }
}