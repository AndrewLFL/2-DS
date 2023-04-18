public class Horista extends Funcionario{
    private double hourlyRate;
    private double hours;

    @Override
    public double getPay(){
        return getHourlyRate()*getHours();
    }

    //m.e

    public Horista(String nome, double hourlyRate, double hours) {
        super(nome);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }
}
