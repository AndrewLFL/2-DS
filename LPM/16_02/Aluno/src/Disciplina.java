public class Disciplina {
    private String nome;
    private String area;
    private int ch;

    public Disciplina(String nome, String area, int ch)
    {
        this.nome = nome;
        this.area = area;
        this.ch = ch;
    }

    public void mostrarDados()
    {
        System.out.println("nome: " + nome + "\n" + "area: " + area + "\n" + "ch: " + ch);
    }

    public String getNome()
    {
        return nome;
    }

    public String getArea()
    {
        return area;
    }

    public int getCh()
    {
        return ch;
    }


}
