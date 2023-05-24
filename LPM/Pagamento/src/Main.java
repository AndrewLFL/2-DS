public class Main {
    public static void main(String[] args) {

        Cartao faturaC = new Cartao();

        System.out.println("Cartão\n");
        faturaC.getDiasFaturamento();
        System.out.println("Dia:  "+faturaC.getDiasFaturamento());
        faturaC.valorCartao= 200;
        System.out.println("Valor do Faturamento:  "+faturaC.valorCartao*0.1);
        System.out.println("\n");

        Dinheiro faturaD= new Dinheiro();

        System.out.println("Dinheiro\n");
        faturaD.getDiasFaturamento();
        System.out.println("Dia:  "+faturaD.getDiasFaturamento());
        faturaD.valorDinheiro= 200;
        System.out.println("Valor do Faturamento:  "+faturaD.valorDinheiro);
        System.out.println("\n");

        Cheque faturaCh = new Cheque();

        System.out.println("Cheque\n");
        faturaCh.getDiasFaturamento();
        System.out.println("Dia:  "+faturaCh.getDiasFaturamento());
        faturaCh.valorCheque= 200;
        System.out.println("Valor do Faturamento:  "+faturaCh.valorCheque*0.03);
        System.out.println("\n");

    }
}