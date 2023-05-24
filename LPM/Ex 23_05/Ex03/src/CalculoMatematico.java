public class CalculoMatematico {

    public int divisao(int n,int d){
        try{
            return n/d;
        }
        catch (ArithmeticException e)
        {
            System.out.println("Não pode dividir por zero");
            return 0;
        }
    }
}
