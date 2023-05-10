public class TestePlanos {

    public static void main(String[] args) {

        Escolha esc = new Escolha();

        boolean val = false;

        while(val == false) { // Enquanto "val"for "false" o while vai ficar fazendo loop, mas quando se tornar "true" ele vai parar
            int opc = esc.menu();
            val = esc.escolher(opc);
        }
    }
}


class Escolha {


    public boolean escolher(int escolha) {
        switch (escolha) {

            case 1:
                System.out.println("basic");
                return true;
            case 2:
                System.out.println("premium");
                return true;

            case 3:
                System.out.println("gold");
                return true;
            default:
                System.out.println("Opção inválida" + "\n" + "Por favor, escolha um de nossos serviços.");
        }
        return false; // Caso nenhuma das opções acima tenha sido escolhida ele cai aqui nesse "return false", fazendo com que o while rode novamente

    }

    public int menu() {
        System.out.println("-----------------------------------------" + "\n" +
                "BEM VINDO AO SISTEMA DE PLANOS DA MJVFONE" + "\n" +
                "-----------------------------------------" + "\n" +
                "DIGITE A OPÇÃO DESEJADA: " + "\n" +
                "[1] Para assinar o PLANO BÁSICO" + "\n" +
                "[2] Para assinar o PLANO PREMIUM" + "\n" +
                "[3] Para assinar o PLANO GOLD" + "\n" +
                "-----------------------------------------");


        Scanner sc = new Scanner(System.in);


        int escolha = sc.nextInt();

        return escolha; // retorna o numero que o usuário escreveu
    }
}
