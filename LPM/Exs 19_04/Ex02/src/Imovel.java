public class Imovel {
    private String endereco;
    private double preco;

    public void mostra(){
        System.out.println(endereco);
        System.out.println("R$"+preco);
    }
    //m.e

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
