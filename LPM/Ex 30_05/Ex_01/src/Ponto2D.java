public class Ponto2D {
    private double x;
    private double y;

    @Override
    public String toString(){
        return getX() + "," + getY();
    }

    //m.e
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
