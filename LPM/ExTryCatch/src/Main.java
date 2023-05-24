public class Main {
    public static void main(String[] args) {
        String nome = "abc";
        try {
            System.out.println(nome.toUpperCase().charAt(10));
        }
        catch (NullPointerException e)
        {
            System.out.println("error string nula");
        }
        catch (StringIndexOutOfBoundsException e)
        {
            System.out.println("indice inexistente");
        }catch (Exception e)
        {
            System.out.println("erro");
        }
        finally {
            System.out.println("pasei no finally");
        }

        System.out.println();

        Aluno al1 = new Aluno();
        try{
            al1.setRa(-1);
        }catch (RaNegativoException e)
        {
            System.out.println(e.getMessage());
        }
        try{
            al1.setNome(null);
        }catch (NomeNuloException e)
        {
            System.out.println(e.getMessage());
        }
        try {
            al1.setAltura(-1);
            }
        catch(AlturaNegativaException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println("*****FIM***-*");
    }
}