public class DVD  extends Produto{
    private double duracao;

    @Override
    public String toString (){
        return super.toString() + "\nDuração: " + getDuracao();
    }

    //m.e

    public DVD(int cod, String nome, double preco, double duracao) {
        super(cod, nome, preco);
        this.duracao = duracao;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }
}
