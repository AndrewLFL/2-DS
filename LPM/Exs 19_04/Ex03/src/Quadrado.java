public class Quadrado extends FormaBiDimensional{
    private double l;

    @Override
    public double obterArea(){
        return l*l;
    }

    //m.e

    public Quadrado(double l) {
        this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }
}
