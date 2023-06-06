import java.util.ArrayList;
import java.util.InputMismatchException;
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
                "9-BUSCAR PRODUTO\n" +
                "10-ESTATISTICAS");
        var = sc.nextInt();

            switch (var) {
                case 0: {
                    System.out.println("TEM CERTEZA QUE DESEJA SAIR? (S/N)");
                    String op = sc.next();
                    if (op.equals("S") || op.equals("s"))
                    {
                        System.out.println("\nENCERRANDO PROGRAMA...\n");
                    }
                    else
                    {
                        var = 10;
                    }
                    break;
                }
                case 1: {
                    clearBuffer(sc);
                    System.out.println("TEM CERTEZA QUE DESEJA ADICIONAR UM CLIENTE? (S/N)");
                    String op = sc.next();
                    if (op.equals("N") || op.equals("n"))
                    {
                        System.out.println("VOLTANDO AO MENU...\n");
                        break;
                    }
                    boolean controle = false;
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
                    System.out.println("DIGITE A SENHA (minimo de 8 caracteres):");
                    senha = sc.nextLine();
                    try{
                        Cliente cl = new Cliente(nome, idade, cpf, cep, senha);
                        listaCliente.add(cl);
                    }
                    catch (NullPointerException e)
                    {
                        controle=true;
                        System.out.println("TODO OS CAMPOS DEVEM SER PREENCHIDOS");
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
                    clearBuffer(sc);
                    System.out.println("TEM CERTEZA QUE DESEJA ADICIONAR UM FUNCIONARIO? (S/N)");
                    String op = sc.next();
                    if (op.equals("N") || op.equals("n"))
                    {
                        System.out.println("VOLTANDO AO MENU...\n");
                        break;
                    }
                    boolean controle = false;
                    String nome;
                    int idade;
                    String cpf;
                    String cep;
                    String numRegistro;
                    clearBuffer(sc);
                    System.out.println("ADICIONANDO FUNCIONARIO:\n\nDIGITE UM NOME:");
                    nome = sc.nextLine();
                    System.out.println("DIGITE A IDADE:");
                    idade = sc.nextInt();
                    clearBuffer(sc);
                    System.out.println("DIGITE O CPF:");
                    cpf = sc.nextLine();
                    System.out.println("DIGITE O CEP:");
                    cep = sc.nextLine();
                    System.out.println("DIGITE O NUMERO DE REGISTRO:");
                    numRegistro = sc.nextLine();
                    try{
                        Funcionario f = new Funcionario(nome, idade, cpf, cep, numRegistro);
                        listaFuncionario.add(f);
                    }
                    catch (NullPointerException e)
                    {
                        controle=true;
                        System.out.println("Todos os campos devem ser preenchidos");
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
                    if (!controle)
                    {
                        System.out.println("\nFUNCIONARIO INSERIDO COM SUCESSO!\n");
                    }
                    else
                        System.out.println("\nFUNCIONARIO NÃO INSERIDO!\n");
                    break;
                }
                case 3: {
                    clearBuffer(sc);
                    System.out.println("TEM CERTEZA QUE DESEJA ADICIONAR UM PRODUTO? (S/N)");
                    String op = sc.next();
                    if (op.equals("N") || op.equals("n"))
                    {
                        System.out.println("VOLTANDO AO MENU...\n");
                        break;
                    }
                    boolean controle = false;
                    String nome;
                    int quantidade;
                    String descricao;
                    String codigo;
                    double preco;
                    clearBuffer(sc);
                    System.out.println("ADICIONANDO PRODUTO:\n\nDIGITE O NOME:");
                    nome = sc.nextLine();
                    System.out.println("DIGITE A DESCRIÇÃO:");
                    descricao = sc.nextLine();
                    System.out.println("DIGITE O PREÇO:");
                    try{
                        preco = sc.nextDouble();
                    }
                    catch(InputMismatchException e )
                    {
                        System.out.println("Esse campo só aceita valores numéricos");
                        var = 10;
                        clearBuffer(sc);
                        break;
                    }
                    clearBuffer(sc);
                    System.out.println("DIGITE O CODIGO:");
                    codigo = sc.nextLine();
                    System.out.println("DIGITE A QUANTIDADE NO ESTOQUE:");
                    quantidade = sc.nextInt();
                    try{
                        Produto p = new Produto(nome, descricao, preco, codigo, quantidade);
                        listaProduto.add(p);
                    }
                    catch (NullPointerException e)
                    {
                        controle=true;
                        System.out.println("Todos os campos devem ser preenchidos");
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
                    catch (CaracterException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    catch (LimiteDescricaoException e)
                    {
                        controle=true;
                        System.out.println(e.getMessage());
                    }
                    if (!controle)
                    {
                        System.out.println("\nPRODUTO INSERIDO COM SUCESSO!\n");
                    }
                    else
                        System.out.println("\nPRODUTO NÃO INSERIDO!\n");
                    break;
                }
                case 4: {
                    if(listaCliente.isEmpty())
                    {
                        System.out.println("NÃO HÁ CLIENTES CADASTRADOS!\n");
                        break;
                    }
                    System.out.println("REMOVENDO CLIENTE:\n\n");
                    System.out.println("LISTA DE CLIENTES:\n");
                    for (Cliente c : listaCliente)
                    {
                        c.exibir();
                    }
                    clearBuffer(sc);
                    System.out.println("\nDIGITE O CPF DO CLIENTE QUE DESEJA REMOVER:");
                    String cpf = sc.nextLine();
                    for (Cliente c : listaCliente)
                    {
                        if (c.getCpf().equals(cpf))
                        {
                            System.out.println("TEM CERTEZA QUE DESEJA REMOVER O CLIENTE? (S/N)");
                            String op = sc.next();
                            if (op.equals("N") || op.equals("n"))
                            {
                                System.out.println("CLIENTE NÃO FOI REMOVIDO\n");
                            }
                            else
                            {
                                listaCliente.remove(c);
                                System.out.println("\nCLIENTE REMOVIDO COM SUCESSO!\n");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 5: {
                    if(listaFuncionario.isEmpty())
                    {
                        System.out.println("NÃO HÁ FUNCIONARIOS CADASTRADOS!\n");
                        break;
                    }
                    System.out.println("REMOVENDO FUNCIONARIO:\n\n");
                    System.out.println("LISTA DE FUNCIONARIOS:\n");
                    for (Funcionario f : listaFuncionario)
                    {
                        f.exibir();
                    }
                    clearBuffer(sc);
                    System.out.println("\nDIGITE O CPF DO FUNCIONARIO QUE DESEJA REMOVER:");
                    String cpf = sc.nextLine();
                    for (Funcionario f : listaFuncionario)
                    {
                        if (f.getCpf().equals(cpf))
                        {
                            System.out.println("VOCE TEM CERTEZA QUE DESEJA REMOVER O FUNCIONARIO? (S/N)");
                            String op = sc.next();
                            if (op.equals("N") || op.equals("n"))
                            {
                                System.out.println("FUNCIONARIO NÃO FOI REMOVIDO!\n");
                            }
                            else
                            {
                                listaFuncionario.remove(f);
                                System.out.println("\nFUNCIONARIO REMOVIDO COM SUCESSO!\n");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 6: {
                    if(listaProduto.isEmpty())
                    {
                        System.out.println("NÃO HÁ PRODUTOS CADASTRADOS!\n");
                        break;
                    }
                    System.out.println("REMOVENDO PRODUTO:\n\n");
                    System.out.println("LISTA DE PRODUTOS:\n");
                    for (Produto p : listaProduto)
                    {
                        p.exibir();
                    }
                    clearBuffer(sc);
                    System.out.println("\nDIGITE O CODIGO DO PRODUTO QUE DESEJA REMOVER:");
                    String codigo = sc.nextLine();
                    for (Produto p : listaProduto)
                    {
                        if (p.getCodigo().equals(codigo))
                        {
                            System.out.println("VOCÊ DESEJA REMOVER O PRODUTO: "+p.getNome()+"? (S/N)");
                            String op = sc.nextLine();
                            if (op.equals("S") || op.equals("s"))
                            {
                                listaProduto.remove(p);
                                System.out.println("\nPRODUTO REMOVIDO COM SUCESSO!\n");
                            }
                            else
                            {
                                System.out.println("\nPRODUTO NÃO FOI REMOVIDO!\n");
                            }
                            break;
                        }
                    }
                    break;
                }
                case 7: {
                    if(listaCliente.isEmpty())
                    {
                        System.out.println("NÃO HÁ CLIENTES CADASTRADOS!\n");
                        break;
                    }
                    clearBuffer(sc);
                    System.out.println("QUER CONTINUAR A BUSCAR CLIENTES? (S/N)");
                    String op = sc.nextLine();
                    if (op.equals("N") || op.equals("n"))
                    {
                        System.out.println("VOLTANDO AO MENU PRINCIPAL!\n");
                        break;
                    }
                    System.out.println("BUSCANDO CLIENTES:\n\n");
                    System.out.println("Insira o nome do cliente que deseja buscar:");
                    String nome = sc.nextLine();
                    boolean controle = false;
                    for (Cliente c : listaCliente)
                    {
                        if (c.getNome().toLowerCase().startsWith(nome.toLowerCase()))
                        {
                            c.exibir();
                            controle = true;
                            System.out.println();
                        }
                    }
                    if (!controle)
                        System.out.println("CLIENTE NÃO ENCONTRADO!\n");
                    break;
                }
                case 8: {
                    if(listaFuncionario.isEmpty())
                    {
                        System.out.println("NÃO HÁ FUNCIONARIOS CADASTRADOS!\n");
                        break;
                    }
                    clearBuffer(sc);
                    System.out.println("QUER CONTINUAR A BUSCAR FUNCIONARIOS? (S/N)");
                    String op = sc.nextLine();
                    if (op.equals("N") || op.equals("n"))
                    {
                        System.out.println("VOLTANDO AO MENU PRINCIPAL!\n");
                        break;
                    }
                    System.out.println("BUSCANDO FUNCIONARIOS:\n\n");
                    clearBuffer(sc);
                    System.out.println("Insira o nome do funcionario que deseja buscar:");
                    String nome = sc.nextLine();
                    boolean controle = false;
                    for (Funcionario f : listaFuncionario)
                    {
                        if (f.getNome().toLowerCase().startsWith(nome.toLowerCase()))
                        {
                            f.exibir();
                            controle = true;
                            System.out.println();
                        }
                    }
                    if (!controle)
                        System.out.println("FUNCIONARIO NÃO ENCONTRADO!\n");
                    break;
                }
                case 9: {
                    if(listaProduto.isEmpty())
                    {
                        System.out.println("NÃO HÁ PRODUTOS CADASTRADOS!\n");
                        break;
                    }
                    clearBuffer(sc);
                    System.out.println("QUER CONTINUAR A BUSCAR POR PRODUTOS? (S/N)");
                    String conf = sc.nextLine();
                    if (conf.equals("N") || conf.equals("n"))
                    {
                        System.out.println("VOLTANDO AO MENU PRINCIPAL!\n");
                        break;
                    }
                    System.out.println("BUSCANDO PRODUTOS:\n");
                    int op;
                    do {
                        System.out.println("INSIRA COMO VOCE DESEJA BUSCAR O PRODUTO:\n" + "1 - PELA DESCRIÇÃO\n" + "2 - PELO CODIGO\n" + "3 - PELO PREÇO\n");
                        op = sc.nextInt();
                    }while (op >= 4 || op <= 0);
                    boolean controle = false;
                    switch (op)
                    {
                        case 1: {
                            clearBuffer(sc);
                            System.out.println("Insira a descrição do produto que deseja buscar:");
                            String descricao = sc.nextLine();
                            for (Produto p : listaProduto)
                            {
                                if (p.getDescricao().toLowerCase().contains(descricao.toLowerCase()))
                                {
                                    p.exibir();
                                    System.out.println();
                                    controle = true;
                                }
                            }
                            break;
                        }
                        case 2: {
                            clearBuffer(sc);
                            System.out.println("Insira o codigo do produto que deseja buscar:");
                            String codigo = sc.nextLine();
                            for (Produto p : listaProduto)
                            {
                                if (p.getCodigo().equals(codigo))
                                {
                                    p.exibir();
                                    System.out.println();
                                    controle = true;
                                }
                            }
                            break;
                        }
                        case 3: {
                            clearBuffer(sc);
                            System.out.println("Insira o preço do produto que deseja buscar:");
                            double preco = sc.nextDouble();
                            for (Produto p : listaProduto)
                            {
                                if (p.getPreco() == preco)
                                {
                                    p.exibir();
                                    System.out.println();
                                    controle = true;
                                }
                            }
                            break;
                        }
                    }
                    if (!controle)
                        System.out.println("PRODUTO NÃO ENCONTRADO!\n");
                    break;
                }
                case 10: {
                    if(listaCliente.isEmpty()&&listaProduto.isEmpty())
                    {
                        System.out.println("NÃO HÁ NENHUM PRODUTO OU CLIENTE CADASTRADO!\n");
                        break;
                    }
                    int op;
                    do {
                        System.out.println("***ESTATISTICAS***\n0-VOLTAR AO MENU PRINCIPAL\n\n" +
                                "**CLIENTES**\n" +
                                "1-MAIS VELHO\n" +
                                "2-MAIS JOVEM\n" +
                                "3-QUANTIDADE DE MAIORES DE 60 ANOS\n"+
                                "4-QUANTIDADE DE MENORES DE 18 ANOS\n"+
                                "5-MEDIA DE IDADE\n\n"+
                                "**PRODUTOS**\n" +
                                "6-MAIS CARO\n" +
                                "7-MAIS BARATO\n" +
                                "8-MEDIA DE PREÇO\n" +
                                "9-ACIMA DA MEDIA\n");
                        op=sc.nextInt();
                        switch (op)
                        {
                            case 0:
                            {
                                System.out.println("VOLTANDO AO MENU PRINCIPAL!\n");
                                break;
                            }
                            case 1:
                            {
                                if(listaCliente.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM CLIENTE CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("CLIENTE MAIS VELHO:\n");
                                int maiorIdade=0;
                                for (Cliente c : listaCliente)
                                {
                                    if (c.getIdade()>maiorIdade)
                                    {
                                        maiorIdade=c.getIdade();
                                    }
                                }
                                for (Cliente c : listaCliente)
                                {
                                    if (c.getIdade()==maiorIdade)
                                    {
                                        c.exibir();
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            case 2:
                            {
                                if(listaCliente.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM CLIENTE CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("CLIENTE MAIS NOVO:\n");
                                int menorIdade=listaCliente.get(0).getIdade();
                                for (Cliente c : listaCliente)
                                {
                                    if (c.getIdade()<menorIdade)
                                    {
                                        menorIdade=c.getIdade();
                                    }
                                }
                                for (Cliente c : listaCliente)
                                {
                                    if (c.getIdade()==menorIdade)
                                    {
                                        c.exibir();
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            case 3:
                            {
                                if(listaCliente.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM CLIENTE CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("QUANTIDADE DE CLIENTES MAIORES DE 60 ANOS:\n");
                                int cont=0;
                                for (Cliente c : listaCliente)
                                {
                                    if (c.getIdade()>60)
                                    {
                                        cont++;
                                    }
                                }
                                System.out.println(cont + "\n");
                                break;
                            }
                            case 4:
                            {
                                if(listaCliente.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM CLIENTE CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("QUANTIDADE DE CLIENTE MENORES DE 18 ANOS:\n");
                                int cont=0;
                                for (Cliente c : listaCliente)
                                {
                                    if (c.getIdade()<18)
                                    {
                                        cont++;
                                    }
                                }
                                System.out.println(cont + "\n");
                                break;
                            }
                            case 5:
                            {
                                if(listaCliente.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM CLIENTE CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("MEDIA DE IDADE DOS CLIENTES:\n");
                                int soma=0;
                                for (Cliente c : listaCliente)
                                {
                                    soma+=c.getIdade();
                                }
                                System.out.println(soma/listaCliente.size() + " ANOS\n");
                                break;
                            }
                            case 6:
                            {
                                if(listaProduto.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM PRODUTO CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("PRODUTO MAIS CARO:\n");
                                double maiorPreco=0;
                                for (Produto p : listaProduto)
                                {
                                    if (p.getPreco()>maiorPreco)
                                    {
                                        maiorPreco=p.getPreco();
                                    }
                                }
                                for (Produto p : listaProduto)
                                {
                                    if (p.getPreco()==maiorPreco)
                                    {
                                        p.exibir();
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            case 7:
                            {
                                if(listaProduto.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM PRODUTO CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("PRODUTO MAIS BARATO:\n");
                                double menorPreco=listaProduto.get(0).getPreco();
                                for (Produto p : listaProduto)
                                {
                                    if (p.getPreco()<menorPreco)
                                    {
                                        menorPreco=p.getPreco();
                                    }
                                }
                                for (Produto p : listaProduto)
                                {
                                    if (p.getPreco()==menorPreco)
                                    {
                                        p.exibir();
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                            case 8:
                            {
                                if(listaProduto.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM PRODUTO CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("MEDIA DE PREÇO DOS PRODUTOS:\n");
                                double soma=0;
                                for (Produto p : listaProduto)
                                {
                                    soma+=p.getPreco();
                                }
                                System.out.println(soma/listaProduto.size() + " REAIS\n");
                                break;
                            }
                            case 9:
                            {
                                if(listaProduto.isEmpty())
                                {
                                    System.out.println("NÃO HÁ NENHUM PRODUTO CADASTRADO!\n");
                                    break;
                                }
                                System.out.println("PRODUTOS ACIMA DA MEDIA:\n");
                                double soma=0;
                                for (Produto p : listaProduto)
                                {
                                    soma+=p.getPreco();
                                }
                                double media=soma/listaProduto.size();
                                for (Produto p : listaProduto)
                                {
                                    if (p.getPreco()>media)
                                    {
                                        p.exibir();
                                        System.out.println();
                                    }
                                }
                                break;
                            }
                        }
                    }while (op!=0);
                    break;
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