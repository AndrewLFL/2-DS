public class Cliente extends Pessoa implements IPessoa{
    private String senha;

    public void exibir(){
        System.out.println("NOME: " + getNome() + "\nIDADE: "+ getIdade() + "\nCPF: " +
                getCpf() + "\nCEP: " + getCep() + "\nSENHA: " + getSenha());
    }

    //m.e

    public Cliente(String nome, int idade, String cpf, String cep, String senha) {
        super(nome, idade, cpf, cep);
        if(senha.length()<8)
            throw new SenhaInvalidaException();
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if(senha.length()<8)
            throw new SenhaInvalidaException();
        this.senha = senha;
    }
}
