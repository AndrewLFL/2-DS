public class Assalariado extends Funcionario{
    private double salario;

    @Override
    public double getPay(){
    return getSalario();
    }

    //m.e

    public Assalariado(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
