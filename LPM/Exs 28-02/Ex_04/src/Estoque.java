public class Estoque {
    private String nome;
    private int qtdAtual;
    private int qtdMinima;

    public void repor(int qtd) {
        setQtdAtual(getQtdAtual() + qtd) ;
    }

    public void baixa(int qtd) {
        setQtdAtual(getQtdAtual() - qtd) ;
    }

    public String mostrar() {
        return getNome() + " \npossui uma Quantidade atual de: " + getQtdAtual() + "\npossui uma Quantidade Mínima de: "+ getQtdMinima() + "\n";
    }

    public boolean precisaRepor(){
    if(getQtdAtual()<=getQtdMinima())
    {
        return true;
    }
    else
    {
        return false;
    }
    }

    // M.E
    public Estoque() {

    }

    public Estoque(String nome, int qtdAtual, int qtdMinima) {
        this.nome = nome;
        this.qtdAtual = qtdAtual;
        this.qtdMinima = qtdMinima;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdAtual() {
        return qtdAtual;
    }

    public void setQtdAtual(int qtdAtual) {
        this.qtdAtual = qtdAtual;
    }

    public int getQtdMinima() {
        return qtdMinima;
    }

    public void setQtdMinima(int qtdMinima) {
        this.qtdMinima = qtdMinima;
    }
}
