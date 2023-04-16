public class Item {
    private int codigo;
    private String descricao;
    private int quantComprada;
    private double preco;

    public double getTotal() {
        if (getQuantComprada()>0 && getPreco()>0) {
            return getQuantComprada() * getPreco();
        }
        else {
            return 0;
        }
    }

    // M.E
    public Item(int codigo, String descricao, int quantComprada, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.quantComprada = quantComprada;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
