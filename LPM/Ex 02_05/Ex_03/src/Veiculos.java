public class Veiculos {
    private String modelo;
    private double preco;

    public void print()
    {
        System.out.println("Modelo: " + getModelo() +
                "\nPreço: " + getPreco());
    }

    //M.E

    public Veiculos(String modelo, double preco)
    {
        this.modelo = modelo;
        this.preco = preco;
    }

    public String getModelo()
    {
        return modelo;
    }

    public double getPreco()
    {
        return preco;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public void setPreco(double preco)
    {
        this.preco = preco;
    }
}
