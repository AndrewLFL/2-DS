public class SimuladorDeCaixaDeBanco {

        private static int numeroDoCliente=0;
        private int numeroDoCaixa;

        public void proximoAtendimento()
        {
            numeroDoCliente = numeroDoCliente + 1;
            System.out.print("Cliente com a senha no "+numeroDoCliente+" , favor ");
            System.out.println("dirigir-se ao caixa "+numeroDoCaixa+".");
        }

        // M.E

    public SimuladorDeCaixaDeBanco (int n)
    {
        numeroDoCaixa = n;
        System.out.println("Caixa "+numeroDoCaixa+" iniciou operação.");
    }

    public static int getNumeroDoCliente() {
        return numeroDoCliente;
    }

    public static void setNumeroDoCliente(int numeroDoCliente) {
        SimuladorDeCaixaDeBanco.numeroDoCliente = numeroDoCliente;
    }

    public int getNumeroDoCaixa() {
        return numeroDoCaixa;
    }

    public void setNumeroDoCaixa(int numeroDoCaixa) {
        this.numeroDoCaixa = numeroDoCaixa;
    }
}
