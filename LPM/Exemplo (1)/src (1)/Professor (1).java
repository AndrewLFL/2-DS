public class Professor extends Pessoa {
    private double salario;

    @Override
    public void mostraTipo(){
        System.out.println("É um Professor");
    }

    //M.E

    public Professor(String nome, int idade, int cpf, double salario) {
        super(nome, idade, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
