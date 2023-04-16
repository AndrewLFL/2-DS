public class Antigo extends Imovel{
    private double precoDescontado;

    @Override
    public void mostra(){
        super.mostra();
        System.out.println(getPrecoDescontado());
    }

    public double precoTotal(){
        return getPreco()-getPrecoDescontado();
    }
    //m.e

    public Antigo(String endereco, double preco, double precoDescontado) {
        super(endereco, preco);
        this.precoDescontado = precoDescontado;
    }

    public double getPrecoDescontado() {
        return precoDescontado;
    }

    public void setPrecoDescontado(double precoDescontado) {
        this.precoDescontado = precoDescontado;
    }
}
