public class Gerente extends Funcionario {
    private String usuario;
    private String senha;

    //M.E

    public Gerente(String nome, double salario, String usuario, String senha) {
        super(nome, salario);
        this.usuario = usuario;
        this.senha = senha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
