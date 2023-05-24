public class Retangulo extends FormaBiDimensional{
    private double b;
    private double h;

    @Override
    public double obterArea(){
        return b*h;
    }

    //m.e

    public Retangulo(double b, double h) {
        if(b<=0 || h<=0)
        {
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que zero");
        }else if(b==h)
        {
            throw new IllegalArgumentException("Valor inválido, modifique um dos valores a fim de torná-los diferentes");
        }
        else {
            this.b = b;
            this.h = h;
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        if(b<=0)
        {
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que zero");
        }else {
            this.b = b;
        }

    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        if(h<=0)
        {
            throw new IllegalArgumentException("Valor inválido, o valor esperado é maior que zero");
        }else {
            this.h = h;
        }
    }
}
