import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Building h1 = new House(500,true,30,true);
        Building s1 = new School(200,false,15,false);
        Car c1 = new Car("Etanol",250);
        Car c2 = new Car("Diesel",200);
        Bicycle bi1 = new Bicycle("Yamaha",24);
        Bicycle bi2 = new Bicycle("Soul Cycles",26);
        ArrayList<CarbonFootprint> lista = new ArrayList<CarbonFootprint>();
        lista.add(h1);
        lista.add(s1);
        lista.add(c1);
        lista.add(c2);
        lista.add(bi1);
        lista.add(bi2);

        for (CarbonFootprint c: lista)
        {
            System.out.println(c.getCarbonFootprint());
        }
    }
}