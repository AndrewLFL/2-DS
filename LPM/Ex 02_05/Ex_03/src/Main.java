import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    double total=0;
    int qm=0,qc=0,mMenor=0,cMenor=2,i=0;
    Moto m1 = new Moto("Yamaha",3300.00,2009);
    Moto m2 = new Moto("Susuki",5000.00,1999);
    Carro c1 = new Carro("New Fiesta",9000.00, 0);
    Carro c2 = new Carro("Impala", 11000.00, 100001);

    ArrayList<Veiculos> lista = new ArrayList<Veiculos>();
    lista.add(m1);
    lista.add(m2);
    lista.add(c1);
    lista.add(c2);

    for (Veiculos v : lista)
    {
        if(v instanceof Carro)
        {
            if(lista.get(cMenor).getPreco()>lista.get(i).getPreco())
            {
                cMenor = i;
            }
            qc++;
            total += v.getPreco();
        }
        else
        {
                if(lista.get(mMenor).getPreco()>lista.get(i).getPreco())
                {
                    mMenor = i;
                }
            qm++;
            total += v.getPreco();
        }
        i++;
    }
    System.out.println("Total dos preços: " + total);
    System.out.println("Quatidade de motos cadastradas: " + qm);
    System.out.println("Quatidade de motos cadastradas: " + qc);
    lista.get(cMenor).print();
    lista.get(mMenor).print();
    }
}