public class CD extends Produto{
    private int numFaixa;

    @Override
    public String toString (){
        return super.toString() + "\nNúmero de Faixas: " + getNumFaixa();
    }
    //m.e

    public CD(int cod, String nome, double preco, int numFaixa) {
        super(cod, nome, preco);
        this.numFaixa = numFaixa;
    }

    public int getNumFaixa() {
        return numFaixa;
    }

    public void setNumFaixa(int numFaixa) {
        this.numFaixa = numFaixa;
    }
}
