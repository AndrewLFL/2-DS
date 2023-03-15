public class Poupanca {
    private static double taxaJurosAnual;
    private double saldo;
    private int cod;

    public double calcJurosMensais(){
        setSaldo(getSaldo()*getTaxaJurosAnual()/12+getSaldo());
        return getSaldo()*getTaxaJurosAnual()/12;
    }

    public static void modificarTaxaJuros (double taxaJurosAnual) {
        Poupanca.taxaJurosAnual = taxaJurosAnual;
    }

    //M.E

    public Poupanca(double saldo,int cod) {
        this.saldo = saldo;
        this.cod = cod;
        taxaJurosAnual=0.5;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }


    public static double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
