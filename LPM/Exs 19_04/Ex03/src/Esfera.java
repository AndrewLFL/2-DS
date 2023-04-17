public class Esfera extends FormaTriDimensional{
    private double r;

    @Override
    public double obterArea(){
        return 4*3.14*r*r;
    }
    @Override
    public double obterVolume(){
        return (4*3.14*r*r*r)/3;
    }

    //m.e

    public Esfera(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
