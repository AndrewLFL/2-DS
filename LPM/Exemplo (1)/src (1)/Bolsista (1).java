public class Bolsista extends Aluno {
    private double bolsa;

    @Override
    public void mostraTipo(){
        System.out.println("É um Bolsista");
    }

    //M.E

    public Bolsista(String nome, int idade, int cpf, int ra, double bolsa) {
        super(nome, idade, cpf, ra);
        this.bolsa = bolsa;
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
