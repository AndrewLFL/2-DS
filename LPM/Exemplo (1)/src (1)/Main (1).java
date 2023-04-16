public class Main {
    public static void main(String[] args) {


        Pessoa p2 = new Aluno("Gilmar",45,85611331,202352);
        p2.mostraTipo();
        Pessoa p3 = new Professor("Rosana",254,00,00);
        p3.mostraTipo();
        Aluno al4 = new Bolsista("Romario",12,2343546,131424,22);
        al4.mostraTipo();
        Aluno al5 = new Aluno("Beltrao",36,47719240,354678);
        Pessoa p5 = (Pessoa) al5;
        p5.mostraTipo();
        if(p5 instanceof Pessoa)
            System.out.println("É instancia");
        else
            System.out.println("Não é instancia");

        Pessoa p1 = new Pessoa("Fernando",34,5678875);

    Aluno al1 = new Aluno("Pool",12,123454,454557);

    Professor rofs2 = new Professor("Ed Rofatto",7900,45678890,1010.00);

    Bolsista b1 = new Bolsista("Newton",13,678686,202150,10.00);

    //
    }
}