public class Produto {
    private int cod;
    private String nome;
    private double preco;

    public String toString (){
        return "Código: " + getCod() + "\nNome: " + getNome() + "\nPreço: " + getPreco();
    }

    //m.e

    public Produto(int cod, String nome, double preco) {
        this.cod = cod;
        this.nome = nome;
        this.preco = preco;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
