public class Cubo  extends FormaTriDimensional{
    private double aresta;

    @Override
    public double obterArea(){
        return aresta*aresta*6;
    }
    @Override
    public double obterVolume(){
        return aresta*aresta*aresta;
    }

    //m.e

    public Cubo(double aresta) {
        this.aresta = aresta;
    }

    public double getAresta() {
        return aresta;
    }

    public void setAresta(double aresta) {
        this.aresta = aresta;
    }
}
