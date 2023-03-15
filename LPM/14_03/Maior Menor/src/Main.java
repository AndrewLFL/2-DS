public class Main {
    public static void main(String[] args) {
     Extremos comparador = new Extremos();
     Extremos.comp(10,5);
     System.out.println(Extremos.getMaior());
     System.out.println(Extremos.getMenor());
        System.out.println("\n");
     Extremos.comp(4,8,16);
     System.out.println(Extremos.getMaior());
     System.out.println(Extremos.getMenor());
        System.out.println("\n");
     Extremos.comp(7,2,3,15);
     System.out.println(Extremos.getMaior());
     System.out.println(Extremos.getMenor());
        System.out.println("\n");
     Extremos.comp(1,8,5,19,13);
     System.out.println(Extremos.getMaior());
     System.out.println(Extremos.getMenor());
    }
}