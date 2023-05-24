public class Bicycle implements CarbonFootprint{
    private String marca;
    private int tamanhoAro;

    @Override
    public int getCarbonFootprint()
    {
        return 3;
    }

    //m.e

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanhoAro() {
        return tamanhoAro;
    }

    public void setTamanhoAro(int tamanhoAro) {
        this.tamanhoAro = tamanhoAro;
    }

    public Bicycle(String marca, int tamanhoAro) {
        this.marca = marca;
        this.tamanhoAro = tamanhoAro;
    }
}
