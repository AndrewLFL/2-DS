public class Circulo extends FormaBiDimensional{
    private double r;

    @Override
    public double obterArea(){
        return 3.14*r*r;
    }

    //m.e

    public Circulo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
