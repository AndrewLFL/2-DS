public class Main {
    public static void main(String[] args) {
        ConversaoDeTemperatura conversor = new ConversaoDeTemperatura();
        System.out.println(ConversaoDeTemperatura.CelsiusFahrenheit(0));
        System.out.println(ConversaoDeTemperatura.CelsiusFahrenheit(100));
        System.out.println(ConversaoDeTemperatura.FahrenheitCelsius(50));
    }
}