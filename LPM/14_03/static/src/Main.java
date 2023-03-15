public class Main {
    public static void main(String[] args) {

        Aluno al1 = new Aluno(202230,"Paulo",4);
        Aluno al2 = new Aluno(202252,"Barbara",6);
        //metodo estatico é um metodo da classe
        double crTurma = Aluno.calcCrTurma();
        System.out.println(crTurma);
    }
}