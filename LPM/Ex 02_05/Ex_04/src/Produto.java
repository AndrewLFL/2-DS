public class Produto {
    private int cod;
    private String descricao;
    private double preco;
    private String unidade;

    //M.E

    public Produto(int cod, String descricao, double preco, String unidade) {
        this.cod = cod;
        this.descricao = descricao;
        this.preco = preco;
        this.unidade = unidade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
}
