import java.util.Random;
import java.util.Scanner;

public class RegistraPedido {
    short contador = 0;
    private PedidoPizza[] pedidos = new PedidoPizza[200];

    private int gerarNumeroPedido(){
        short indice;
        short tamanho = 0;
        int pedido = 0;
        int[] pedidos = new int[200];
        Random random = new Random();

        for(short i = 0; i < pedidos.length; i++){
            if(pedidos[i] == 0){
                pedidos[i] = 1 + random.nextInt(200);
                indice = i;
                tamanho++;
                break;
            }
        }

        for(short i = 0; i < tamanho; i++){
            for(short j = 0; j <= tamanho; j++){
                if(pedidos[i] != pedidos[j]){
                    pedido = pedidos[i];
                    break;
                }
            }
        }
        return pedido;
    }

    public void exibirMenu(){
        System.out.println("\n");
        System.out.println("+--------------------------------------+");
        System.out.println("|                 MENU                 |");
        System.out.println("+--------------------------------------+");
        System.out.println(
                "| 01 - Pizza Calabresa      (R$ 25,00) |\n" +
                        "| 02 - Pizza Quatro Queijos (R$ 20,00) |\n" +
                        "| 03 - Pizza de Camarão     (R$ 35,00) |\n" +
                        "| 04 - Pizza Portuguesa     (R$ 25,00) |\n" +
                        "| 05 - Pizza Baiana         (R$ 25,00) |\n" +
                        "| 51 - Imprimir comanda     (R$ 25,00) |\n" +
                        "| 99 - Sair                            |"
        );
        System.out.println("+--------------------------------------+\n\n");
    }

    public void lerDadosPedido(short indice){
        char servico = 'N'; //Cliente vem buscar
        Scanner leitor = new Scanner(System.in);
        PedidoPizza pedidoPizza = new PedidoPizza(gerarNumeroPedido());

        System.out.println("Número pedido: " + pedidoPizza.getNumeroPedido());
        System.out.print("Cliente: ");
        pedidoPizza.setCliente(leitor.nextLine());

        System.out.print("Celular: ");
        pedidoPizza.setCelular(leitor.nextLine());

        System.out.print("Endereço: ");
        pedidoPizza.setEndereco(leitor.nextLine());

        System.out.print("Entrega [S/N]: ");
        servico = leitor.next().charAt(0);

        if(servico == 's' || servico == 'S'){
            String opcao;
            String[] motoboy = {"Zé", "João", "Bastião"};
            do{
                System.out.print("\nMotoboy: ");
                opcao = leitor.next();
                switch(opcao){
                    case "Zé":
                        pedidoPizza.setMotoboy(motoboy[0]);
                        break;
                    case "João":
                        pedidoPizza.setMotoboy(motoboy[1]);
                        break;
                    case "Bastião":
                        pedidoPizza.setMotoboy(motoboy[2]);
                        break;
                    default:
                        System.out.println("Motoboy não registrado!");
                }
            }while(!opcao.equals("Zé") && !opcao.equals("João") && !opcao.equals("Bastião"));
        }

        System.out.print("Valor do pedido: ");
        pedidoPizza.setValorPedido(leitor.nextDouble());

        System.out.println("Tipo de pagamento [0 = Dinheiro / 1 = Cartão]");
        System.out.print("Opção escolhida: ");
        short tipo = 0;

        do{
            tipo = leitor.nextShort();

            if(tipo == 0)
                pedidoPizza.setTipoPagamento(tipo);
            else if(tipo == 1)
                pedidoPizza.setTipoPagamento(tipo);

            else
                System.out.println("Tipo de pagamento inválido!");

        }while(tipo != 0 && tipo != 1);

        pedidos[indice] = pedidoPizza;
    }

    private void imprimirComanda(PedidoPizza[] pedidos, short tamanho){
        for(short pedido = 0; pedido < tamanho; pedido++){
            System.out.println("\n");
            System.out.printf("%-19s%03d", "Pedido: ", pedidos[pedido].getNumeroPedido());
            System.out.println("");
            System.out.println("Cliente:           " + pedidos[pedido].getCliente());
            System.out.println("Celular:           " + pedidos[pedido].getCelular());
            System.out.println("Endereco:          " + pedidos[pedido].getEndereco());

            if(pedidos[pedido].getMotoboy() == null)
                System.out.println("Entrega:           Não");
            else
                System.out.println("Entrega:           Sim [" + pedidos[pedido].getMotoboy() + "]");

            System.out.println("Valor do pedido:   " + pedidos[pedido].getValorPedido());

            if(pedidos[pedido].getTipoPagamento() == 0)
                System.out.println("Tipo de pagamento: Dinheiro\n");
            else
                System.out.println("Tipo de pagamento: Cartão\n");
        }
        System.out.println("\n");
    }

    public static void main(String[] args){
        short opcao;
        Scanner leitor = new Scanner(System.in);
        RegistraPedido registraPedido = new RegistraPedido();

        do{
            registraPedido.exibirMenu();
            System.out.print("Opção escolhida: ");
            opcao = leitor.nextShort();

            switch(opcao){
                case 1:
                    System.out.println("Sabor: Pizza Calabresa");
                    registraPedido.lerDadosPedido(registraPedido.contador++);
                    break;

                case 2:
                    System.out.println("Sabor: Pizza Quatro Queijos");
                    registraPedido.lerDadosPedido(registraPedido.contador++);
                    break;

                case 3:
                    System.out.println("Sabor: Pizza de Camarão");
                    registraPedido.lerDadosPedido(registraPedido.contador++);
                    break;

                case 4:
                    System.out.println("Sabor: Pizza Portuguesa");
                    registraPedido.lerDadosPedido(registraPedido.contador++);
                    break;

                case 5:
                    System.out.println("Sabor: Pizza Baiana");
                    registraPedido.lerDadosPedido(registraPedido.contador++);
                    break;

                case 51:
                    registraPedido.imprimirComanda(registraPedido.pedidos, registraPedido.contador);
                    break;

                case 99:
                    break;

                default:
                    System.out.println("Sabor indisponível");
            }

        }while(opcao != 99);

        leitor.close();
    }
}