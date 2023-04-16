public class Funcionario {
    private String nome;
    private String sobrenome;
    private double salarioMensal;

    public void aumentar (){
        setSalarioMensal(getSalarioMensal()+(getSalarioMensal()*0.1));
    }
    public void mostrarSalarioAnual() {
        System.out.println("O salário anual de " + getNome() + " " + getSobrenome() + " é R$" + getSalarioMensal()*12 );
    }

    //M.E

    public Funcionario() {
        this.setNome("");
        this.setSobrenome("");
        this.setSalarioMensal(0);
    }

    public Funcionario(String nome, String sobrenome, double salarioMensal) {
        this.setNome(nome);
        this.setSobrenome(sobrenome);
        if (salarioMensal > 0){
            this.setSalarioMensal(salarioMensal);
        }
        else
            this.setSalarioMensal(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0 ){
            this.salarioMensal = salarioMensal;
        }
    }
}
