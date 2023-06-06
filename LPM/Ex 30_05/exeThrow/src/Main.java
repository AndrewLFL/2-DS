public class Main {
    public static void main(String[] args) {

        Aluno al1 = new Aluno();
        try {
            al1.setRa(-1);
        }
       catch (IllegalArgumentException e)
       {
           System.out.println(e.getMessage());
       }
        System.out.println("********FIM********");
    }
}