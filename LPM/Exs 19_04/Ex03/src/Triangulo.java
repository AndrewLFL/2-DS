public class Triangulo extends FormaBiDimensional{
    private double b;
    private double h;

    @Override
    public double obterArea(){
        return b*h/2;
    }

    //m.e

    public Triangulo(double b, double h) {
        this.b = b;
        this.h = h;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }
}
