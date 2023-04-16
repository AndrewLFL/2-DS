import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Circulo c1 = new Circulo(1);
    Quadrado q1 = new Quadrado(2);
    Triangulo t1 = new Triangulo(2,3);
    Esfera e1 = new Esfera(1);
    Cubo c2 = new Cubo(4);
    Tetraedro t2 = new Tetraedro(1,2,3,5);

        ArrayList<Forma>lista=new ArrayList<Forma>();

    for(Forma f:lista)
    {
        if(f instanceof FormaBiDimensional)
        {
            FormaBiDimensional fb=(FormaBiDimensional) f;
            System.out.println(fb.obterArea());
        }
        else
        {
            FormaTriDimensional ft=(FormaTriDimensional) f;
            System.out.println(ft.obterArea());
            System.out.println(ft.obterVolume());
        }
    }
    }
}