import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
    VIP v1 = new VIP(80,30);
    Comum c1 = new Comum(80);
    VIP v2 = new VIP(100,50);
    Comum c2 = new Comum(100);
    double soma=0;
    ArrayList<Ingresso> lista = new ArrayList<Ingresso>();
    lista.add(v1);
    lista.add(v2);
    lista.add(c1);
    lista.add(c2);
    for (Ingresso i:lista)
    {
        if(i instanceof VIP)
        {
            VIP v = (VIP)i;
            soma+= v.getValor()+v.getValorAdc();
        }
        else
            soma+=i.getValor();
    }

    System.out.println("O faturamento da rede de shows será de: R$" + soma);
    }
}