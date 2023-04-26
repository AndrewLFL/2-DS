public class Cds extends Produto{
    private int numFaixas;

    public Cds(int codigo, double preco, String nome, int numFaixas){
        super(codigo,preco,nome);
        this.numFaixas = numFaixas;
    }

    public int getNumFaixas(){
        return numFaixas;
    }

    public void setNumFaixas(){
        this.numFaixas=numFaixas;
    }
}
