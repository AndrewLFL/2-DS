public class IAluno implements Aluno {


    @Override
    public void chorar() {
        System.out.println("chora com dinheiro");
    }

    @Override
    public double calcMedia(double n1, double n2) {
        return (n1+n2);
    }
}
