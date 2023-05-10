public static void main(String[] args) {
        String cliente = "";
        String celular = "";
        String endereco = "";
        String motoboyEntrega = "";
        String clienteBusca = "";
        double valorPedido = 0;
        double pagDin;
        double pagCar;

        int opcao = 10;
        while (opcao != 0) {

        //MENU PRINCIPAL COM OS SABORES DE PIZZA  E SAIR
        opcao = Integer.parseInt(JOptionPane.showInputDialog(null
        + "1: Pizza calabresa R$ 25,00 \n"
        + "2: Pizza quatro queijos R$ 20,00 \n"
        + "3: Pizza camarão R$ 35,00 \n"
        + "4: Pizza portuesa R$ 25,00 \n"
        + "5: Pizza Baiana R$ 25,00 \n"
        + "Escolha o sabor de sua preferência! \n"
        + "Digite 0 para sair"));

        //CASOS
        switch (opcao) {
        case 1:
        //PIZZA CALABRESA
        break;
        case 2:
        //PIZZA QUATRO QUEIJOS
        break;
        case 3:
        //PIZZA CAMARÃO
        break;
        case 4:
        //PIZZA PORTUGUES
        break;
        case 5:
        //PIZZA BAIANA
        break;
default: System.out.println ("Resposta inválida");
        break;
        }


        }

        }
        }




