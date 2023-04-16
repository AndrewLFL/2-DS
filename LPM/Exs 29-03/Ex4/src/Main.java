public class Main {
    public static void main(String[] args) {
        SimuladorDeCaixaDeBanco s1 = new SimuladorDeCaixaDeBanco(4);
        SimuladorDeCaixaDeBanco s2 = new SimuladorDeCaixaDeBanco(1);
        s1.proximoAtendimento();
        System.out.println(SimuladorDeCaixaDeBanco.getNumeroDoCliente());

    }
}