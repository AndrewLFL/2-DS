import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    Assalariado a1 = new Assalariado("Jeferson",1000);
    Horista h1 = new Horista("Evandro",100,5);
    Assalariado a2 = new Assalariado("Danilo",2000);
    Horista h2 = new Horista("Camila",150,2);

    ArrayList<Funcionario> lista = new ArrayList<Funcionario>();
    lista.add(a1);
    lista.add(h1);
    lista.add(a2);
    lista.add(h2);

        for(Funcionario f : lista)
        {
            if (f instanceof Assalariado)
            {

            }
            else
            {
                
            }
        }
    }
}