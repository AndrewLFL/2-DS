public class RegistroAcademico {
    private String nome;
    private static int numMatricula = 0;
    private int codCurso;
    private double percentualCobranca;

    //M.E


    public RegistroAcademico(String nome, int codCurso, double percentualCobranca) {
        this.nome = nome;
        this.codCurso = codCurso;
        this.percentualCobranca = percentualCobranca;
        numMatricula+=1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static int getNumMatricula() {
        return numMatricula;
    }

    public static void setNumMatricula(int numMatricula) {
        RegistroAcademico.numMatricula = numMatricula;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public double getPercentualCobranca() {
        return percentualCobranca;
    }

    public void setPercentualCobranca(double percentualCobranca) {
        this.percentualCobranca = percentualCobranca;
    }
}
