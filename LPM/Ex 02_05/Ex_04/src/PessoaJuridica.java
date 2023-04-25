public class PessoaJuridica extends Cliente{
    private int cnpj;
    private String nomeFantasia;

    @Override
    public void print ()
    {
        super.print();
        System.out.println("CNPJ: " + getCnpj() + "\nNome Fantasia: " + getNomeFantasia());
    }
    //M.E

    public PessoaJuridica(String nome, String endereco, int telefone, int cnpj, String nomeFantasia) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.nomeFantasia = nomeFantasia;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}
