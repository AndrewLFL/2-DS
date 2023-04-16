public class Aluno extends Pessoa {
    private int ra;

    //M.E

    public Aluno(String nome, int idade, int cpf, int ra) {
        super(nome, idade, cpf);
        this.ra = ra;
    }

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }
}
