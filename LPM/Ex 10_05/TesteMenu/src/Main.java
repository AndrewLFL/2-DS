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

        switch (escolha) {

        case 1:
        System.out.println(basic);
        break;
        case 2:
        System.out.println(premium);
        break;
        case 3:
        System.out.println(gold);
        break;
default: System.out.println("Opção inválida" + "\n" + "Por favor, escolha um de nossos serviços.");

        }