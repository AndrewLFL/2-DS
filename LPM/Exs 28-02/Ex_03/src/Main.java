public class Main {
    public static void main(String[] args) {
        Pessoa Einstein = new Pessoa(14,3,1879,"Einstein");
        Pessoa Newton = new Pessoa(4,1,1643);
        Einstein.calculaIdade(2023);
        Newton.calculaIdade(2023);
        System.out.println(Einstein.getIdade());
        System.out.println(Newton.getIdade());
    }
}