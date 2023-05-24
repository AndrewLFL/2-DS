public class Main {
    public static void main(String[] args) {
    ContaCorrente cc = new ContaCorrente(500);
    ContaInvestimento ci = new ContaInvestimento(400);
    try {
        cc.Depositar(100);
    }catch (ValorInvalidoException e){
        System.out.println(e.getMessage());
    }
    try {
        ci.Depositar(-500);
    }catch (ValorInvalidoException e){
        System.out.println(e.getMessage());
    }
    catch (SaldoInsuficienteException e){
        System.out.println(e.getMessage());
    }
    try {
        ci.Sacar(50);
    }catch (ValorInvalidoException e){
        System.out.println(e.getMessage());
    }
    catch (SaldoInsuficienteException e){
        System.out.println(e.getMessage());
    }
    try {
        cc.Sacar(900);
    }catch (ValorInvalidoException e){
        System.out.println(e.getMessage());
    }
    catch (SaldoInsuficienteException e){
        System.out.println(e.getMessage());
    }
    try {
        cc.Transferir(200,ci);
    }catch (ValorInvalidoException e){
        System.out.println(e.getMessage());
    }
    catch (SaldoInsuficienteException e){
        System.out.println(e.getMessage());
    }
    try {
        ci.Transferir(-9,cc);
    }catch (ValorInvalidoException e){
        System.out.println(e.getMessage());
    }
    catch (SaldoInsuficienteException e){
        System.out.println(e.getMessage());
    }
    }
}