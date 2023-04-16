public class Main {
    public static void main(String[] args) {
        Item computador = new Item(001,"Computador Gamer",2,3500.99);
        System.out.println(computador.getTotal());
        Item ventilador = new Item(002,"Ventilador VentinhoFeliz",0,500);
        System.out.println(ventilador.getTotal());
    }
}