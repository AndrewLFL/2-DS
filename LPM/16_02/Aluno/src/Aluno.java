public class Aluno {

    private int ra;
    private int idade;
    private double altura;
    private String nome;

    public Aluno(int ra, int idade, double altura, String nome)
    {
        this.ra = ra;
        this.idade = idade;
        this.altura = altura;
        this.nome = nome;
    }

    public void estudar()
    {
        System.out.println("O aluno está estudando");
    }

    public void mostrarIdade()
    {
        System.out.println("Idade: " + idade);
    }


    public int getRa()
    {
        return ra;
    }

    public int getIdade()
    {
        return idade;
    }

    public double getAltura()
    {
        return altura;
    }

    public String getNome()
    {
        return nome;
    }
}
