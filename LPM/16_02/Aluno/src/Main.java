public class Main {
    public static void main(String[] args) {
        Aluno al1 = new Aluno(202230,38,1.98,"Clovis");
        al1.estudar();
        al1.mostrarIdade();
        Aluno al2 = new Aluno(202252,78,3.98,"Joelma");
        al2.mostrarIdade();
        System.out.println(al1.getRa());

        Disciplina mat = new Disciplina("Matematica","Exatas", 16);
        mat.mostrarDados();
        Disciplina port = new Disciplina("Portugues", "Humanas", 18);
        port.mostrarDados();

        Caneta bic = new Caneta("Blue", false,0.7);
        bic.escrever();
        Caneta piloto = new Caneta("Vermelha", true,0.5);
        piloto.escrever();

        /*
        Encapsulamento = atributos devem ser privados
        o estado tem que ser escondido!
        valores = estado do objeto!
        public = indica que atributos e métodos estão disponíveis ao público,
        podem ser chamados por outros métodos no programa e por métodos de outras classes.
        private = indica que atributos ou métodos são acessíveis somente a métodos da classe para a qual são declaradas
        */
    }
}