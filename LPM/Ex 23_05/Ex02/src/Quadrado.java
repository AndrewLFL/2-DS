public class Quadrado extends FormaBiDimensional{
    private double l;

    @Override
    public double obterArea(){
        return l*l;
    }

    //m.e

    public Quadrado(double l) {
        if(l<=0)
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que zero");
        else
            this.l = l;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        if(l<=0)
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que zero");
        else
            this.l = l;
    }
}
