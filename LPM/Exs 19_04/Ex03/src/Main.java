import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Circulo c1 = new Circulo(6);
    Quadrado q1 = new Quadrado(2);
    Triangulo t1 = new Triangulo(2,3);
    Esfera e1 = new Esfera(6);
    Cubo c2 = new Cubo(4);
    Tetraedro t2 = new Tetraedro(1,2,3,5);

    ArrayList<Forma>lista=new ArrayList<Forma>();
    lista.add(c1);
    lista.add(q1);
    lista.add(t1);
    lista.add(e1);
    lista.add(c2);
    lista.add(t2);
    for(Forma f:lista)
    {
        if(f instanceof FormaBiDimensional)
        {
            FormaBiDimensional fb=(FormaBiDimensional) f;
            System.out.println("Área: " + fb.obterArea());
        }
        else
        {
            FormaTriDimensional ft=(FormaTriDimensional) f;
            System.out.println("Área: " + ft.obterArea());
            System.out.println("Volume: " + ft.obterVolume());
        }
    }
    }
}