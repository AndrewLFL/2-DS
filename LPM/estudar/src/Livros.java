public class Livros extends Produto{

    private String autor;

    public Livros(int codigo, double preco, String nome, String autor) {
        super(codigo, preco, nome);
        this.autor = autor;
    }

    public String getAutor (){
        return autor;
    }

    public void setAutor(){
        this.autor = autor;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public void setCodigo(int codigo) {
        super.setCodigo(codigo);
    }

    @Override
    public double getPreco() {
        return super.getPreco();
    }

    @Override
    public void setPreco(double preco) {
        super.setPreco(preco);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }


    public String toString(int codigo, double preco, String nome, String autor) {
        return super.toString(codigo, preco, nome) + " " + autor;
    }
}
