public class Main {
    public static void main(String[] args) {

        String nome="Aula de Progr";
        System.out.println(nome.toUpperCase());
        try{
            System.out.println(nome.toUpperCase());
        }catch(NullPointerException e)
        {
            System.out.println("A String não pode ser nula");
        }
        catch(StringIndexOutOfBoundsException e){
            System.out.println("O indice não corresponde ao tamanho da String");
        }
        catch(Exception e){
            System.out.println("ERRO");
        }
        finally {
            System.out.println("Passei aqui");
        }
        System.out.println("Término do programa");
        System.out.println("********************");
    }
}