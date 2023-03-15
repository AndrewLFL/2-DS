public class Retangulo {
    private double base;
    private double altura;

    public double perimetro() {
        return base*2+altura*2;
    }

    public double area() {
        return this.getAltura()*this.getBase();
    }

    //metodos especiais

    public Retangulo() {
        this.base = 1;
        this.altura = 1;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        if (base>=1&&base<=20)
        {
            this.base = base;
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura>=1&&altura<=20) {
            this.altura = altura;
        }
    }
}
