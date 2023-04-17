public class Tetraedro extends FormaTriDimensional{
    private double hPiramide;
    private double arestaBase;
    private double hBase;
    private double apotemaPiramide;

    @Override
    public double obterArea(){
        return (hBase*arestaBase/2)+((apotemaPiramide*arestaBase)/2*3);
    }
    @Override
    public double obterVolume(){
        return hBase*arestaBase/2*hPiramide/3;
    }

    //m.e

    public Tetraedro(double hPiramide, double arestaBase, double hBase, double apotemaPiramide) {
        this.hPiramide = hPiramide;
        this.arestaBase = arestaBase;
        this.hBase = hBase;
        this.apotemaPiramide = apotemaPiramide;
    }

    public double gethPiramide() {
        return hPiramide;
    }

    public void sethPiramide(double hPiramide) {
        this.hPiramide = hPiramide;
    }

    public double getArestaBase() {
        return arestaBase;
    }

    public void setArestaBase(double arestaBase) {
        this.arestaBase = arestaBase;
    }

    public double gethBase() {
        return hBase;
    }

    public void sethBase(double hBase) {
        this.hBase = hBase;
    }

    public double getApotemaPiramide() {
        return apotemaPiramide;
    }

    public void setApotemaPiramide(double apotemaPiramide) {
        this.apotemaPiramide = apotemaPiramide;
    }
}
