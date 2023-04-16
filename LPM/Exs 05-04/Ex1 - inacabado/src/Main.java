public class Main {
    public static void main(String[] args) {
    Gerente g1 = new Gerente("Michel",10.00,"omelhorchef","123abc");
    Secretaria s1 = new Secretaria("Dwight",5000.00,24);
    Telefonista t1 = new Telefonista("Pam",3000.00,3435);
    Funcionario f1 = new Funcionario("Jim",2.00);
    System.out.println("Usuário: " + g1.getUsuario() +
            "\nSenha: " + g1.getSenha() +
            "\nSalario Anterior de " + g1.getNome() + " - - - " + "R$" + g1.getSalario() +
            "\nBonificação: " + g1.calcBonificacao() + "\nSalário Atual: " + g1.getSalario());
    System.out.println("\nSalario Anterior de " + s1.getNome() + " - - - " + "R$" + s1.getSalario() +
                "\nBonificação: " + s1.calcBonificacao() + "\nSalário Atual: " + s1.getSalario() + "\nNúmero de Ramal: " + s1.getRamal());
}
}