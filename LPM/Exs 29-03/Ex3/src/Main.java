public class Main {
    public static void main(String[] args) {
        RegistroAcademico r1 = new RegistroAcademico("Claudio",123,0.5);
        RegistroAcademico r2 = new RegistroAcademico("Carlos",321,0.9);
        System.out.println(RegistroAcademico.getNumMatricula());
    }
}