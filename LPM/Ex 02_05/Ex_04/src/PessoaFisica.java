public class PessoaFisica extends Cliente{
    private int cpf;

    @Override
    public void print ()
    {
        super.print();
        System.out.println("CPF: " + getCpf());
    }
    //M.E

    public PessoaFisica(String nome, String endereco, int telefone, int cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
