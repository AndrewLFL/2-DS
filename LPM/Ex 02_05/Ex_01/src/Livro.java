public class Livro extends Produto{
    private String autor;

    @Override
    public String toString (){
        return super.toString() + "\nAutor: " + getAutor();
    }
    //m.e

    public Livro(int cod, String nome, double preco, String autor) {
        super(cod, nome, preco);
        this.autor = autor;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
