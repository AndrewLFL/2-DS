public class Novo extends Imovel{
    private double precoAdicional;

    @Override
    public void mostra(){
    super.mostra();
        System.out.println(getPrecoAdicional());
    }

    public double precoTotal(){
       return getPreco()+getPrecoAdicional();
    }
    //m.e

    public Novo(String endereco, double preco, double precoAdicional) {
        super(endereco, preco);
        this.precoAdicional = precoAdicional;
    }

    public double getPrecoAdicional() {
        return precoAdicional;
    }

    public void setPrecoAdicional(double precoAdicional) {
        this.precoAdicional = precoAdicional;
    }
}
