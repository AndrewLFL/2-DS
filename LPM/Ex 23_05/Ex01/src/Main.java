public class Main {
    public static void main(String[] args) {
        Object o = null;
        try{
            o.toString();
        }
        catch (NullPointerException e){
            System.out.println("Não pode ser null");
        }
        System.out.println("**FIM**");
    }
}