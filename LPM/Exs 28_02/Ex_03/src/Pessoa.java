public class Pessoa {
    private int idade;
    private int dia;
    private int mes;
    private int anoNasc;
    private String nome;

    public void calculaIdade(int anoAtual) {
        setIdade(anoAtual-getAnoNasc());
    }

    //M.E
    public Pessoa(int dia, int mes, int anoNasc, String nome) {
        if (dia>=1 && dia<=31 && mes>=1 && mes<=12 && anoNasc>=1000)
        {
            this.dia = dia;
            this.mes = mes;
            this.anoNasc = anoNasc;
            this.nome = nome;
        }
    }

    public Pessoa(int dia, int mes, int anoNasc) {
        if (dia>=1 && dia<=31 && mes>=1 && mes<=12 && anoNasc>=1000)
        {
            this.dia = dia;
            this.mes = mes;
            this.anoNasc = anoNasc;
        }
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
            this.idade = idade;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (dia>=1 && dia<=31)
            this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (mes>=1 && mes<=12)
            this.mes = mes;
    }

    public int getAnoNasc() {
        return anoNasc;
    }

    public void setAnoNasc(int anoNasc) {
        if (anoNasc>=1000)
            this.anoNasc = anoNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
