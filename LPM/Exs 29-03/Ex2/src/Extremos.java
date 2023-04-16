public class Extremos {
    private static int maior;
    private static int menor;

    public static void comp (int a, int b){
        if(a>b){
            maior=a;
            menor=b;
        }
        else{
            maior=b;
            menor=a;
        }
    }

    public static void comp (int a, int b, int c){
        comp(a,b);
        if(maior<c){
            maior=c;
        }
        else if(menor>c){
            menor=c;
        }
    }

    public static void comp (int a, int b, int c, int d){
        comp(a,b,c);
        if(maior<d){
            maior=d;
        }
        else if(menor>d){
            menor=d;
        }
    }
    public static void comp (int a, int b, int c, int d, int e){
        comp(a,b,c,d);
        if(maior<e){
            maior=e;
        }
        else if(menor>e){
            menor=e;
        }
    }
    //M.E


    public static int getMaior() {
        return maior;
    }

    public static int getMenor() {
        return menor;
    }

}
