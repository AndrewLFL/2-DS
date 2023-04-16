public class Main {
    public static void main(String[] args)
    {
        Estoque estoque1 = new Estoque("Impressora",13,6);
        Estoque estoque2 = new Estoque("Monitor",11,13);
        Estoque estoque3 = new Estoque("Mouse",6,2);
        estoque1.baixa(5);
        estoque2.repor(7);
        estoque3.baixa(4);
        System.out.println(estoque1.precisaRepor());
        System.out.println(estoque2.precisaRepor());
        System.out.println(estoque3.precisaRepor());
        System.out.println(estoque1.mostrar());
        System.out.println(estoque2.mostrar());
        System.out.println(estoque3.mostrar());
    }
}