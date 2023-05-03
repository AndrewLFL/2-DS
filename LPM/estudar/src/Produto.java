public class Produto {

    protected int codigo;
    protected double preco;
    protected String nome;

    public Produto (int codigo, double preco, String nome){
        this.codigo= codigo;
        this.nome = nome;
        this.preco = preco;
    }


    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String toString (int codigo, double preco, String nome){
        return codigo + " " + preco + " " + nome;
    }
}
