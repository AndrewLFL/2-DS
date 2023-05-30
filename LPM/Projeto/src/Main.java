import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();
        ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
        ArrayList<Produto> listaProduto = new ArrayList<Produto>();
        int var;
        Scanner sc = new Scanner(System.in);
        do{
        System.out.println("***MENU***\n0-SAIR\n\n" +
                "**INSERIR**\n" +
                "1-INSERIR CLIENTE\n" +
                "2-INSERIR FUNCIONARIO\n" +
                "3-INSERIR PRODUTO\n\n" +
                "**REMOVER**\n" +
                "4-REMOVER CLIENTE\n" +
                "5-REMOVER FUNCIONARIO\n" +
                "6-REMOVER PRODUTO\n\n" +
                "**BUSCAR**\n" +
                "7-BUSCAR CLIENTE\n" +
                "8-BUSCAR FUNCIONARIO\n" +
                "9-BUSCAR PRODUTO");

        var = sc.nextInt();

            switch (var) {
                case 0: {
                    break;
                }
                case 1: {
                    Boolean controle=false;
                    String nome;
                    int idade;
                    String cpf;
                    String cep;
                    String senha;
                    clearBuffer(sc);
                    System.out.println("ADICIONANDO CLIENTE:\n\nDIGITE UM NOME:");
                    nome = sc.nextLine();
                    System.out.println("DIGITE A IDADE:");
                    idade = sc.nextInt();
                    clearBuffer(sc);
                    System.out.println("DIGITE O CPF:");
                    cpf = sc.nextLine();
                    System.out.println("DIGITE O CEP:");
                    cep = sc.nextLine();
                    System.out.println("DIGITE A SENHA:");
                    senha = sc.nextLine();
                    try{
                        Cliente cl = new Cliente(nome, idade, cpf, cep, senha);
                    }
                    catch (NullPointerException e)
                    {
                        controle=true;
                        System.out.println("Preencha o campo");
                    }
                    catch (NomeInvalidoException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    catch (NegativoException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    catch (CpfInvalidoException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    catch (CepInvalidoException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    catch (CaracterException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    catch (SenhaInvalidaException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    if (!controle)
                    {
                        System.out.println("\nCLIENTE INSERIDO COM SUCESSO!\n");
                    }
                    else
                        System.out.println("\nCLIENTE NÃO INSERIDO!\n");
                    break;
                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {

                }
                case 6: {

                }
                case 7: {

                }
                case 8: {

                }
                case 9: {

                }
            }
        }while (var!=0);

        }

    private static void clearBuffer (Scanner scanner){
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }

}
