public class Telefonista extends Funcionario{
    private int codT;

    //M.E

    public Telefonista(String nome, double salario, int codT) {
        super(nome, salario);
        this.codT = codT;
    }

    public int getCodT() {
        return codT;
    }

    public void setCodT(int codT) {
        this.codT = codT;
    }
}
