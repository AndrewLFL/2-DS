public class Produto {
    private String descricao;
    private double preco;
    private String codigo;
    private int quantidade;
    private double caloria;

    //m.e

        public Produto(String descricao, double preco, String codigo, int quantidade, double caloria) {

    if(descricao.length()<200)
    {
    throw new LimiteDescricaoException();
    }

    else if (preco<0)
    {
        throw new NegativoException();
    }
    else if (String.valueOf(preco).matches("[A-Z]*")||String.valueOf(preco).matches("[a-z]*"))
    {
        throw new CaracterException();
    }

    else if (codigo.matches("[A-Z]*")||codigo.matches("[a-z]*"))
    {
        throw new CaracterException();
    }
    else if(codigo.contains("-"))
    {
        throw new NegativoException();
    }
    else if (codigo==null)
    {
        throw new NullPointerException();
    }

    else if (quantidade<0)
    {
        throw new NegativoException();
    }
    else if (String.valueOf(quantidade).matches("[A-Z]*")||String.valueOf(quantidade).matches("[a-z]*"))
    {
        throw new CaracterException();
    }

    else if (caloria<0)
    {
        throw new NegativoException();
    }
    else if (String.valueOf(caloria).matches("[A-Z]*")||String.valueOf(caloria).matches("[a-z]*"))
    {
        throw new CaracterException();
    }
    else
    {
        this.descricao = descricao;
        this.preco = preco;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.caloria = caloria;
    }
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getCaloria() {
        return caloria;
    }

    public void setCaloria(double caloria) {
        this.caloria = caloria;
    }
}
