public class Aluno {
    private int ra;
    private String nome;
    private double altura;

    //m.e

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        if(ra<0)
        {
            throw new RaNegativoException();
        }
        else {
            this.ra = ra;
        }


    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null)
        {
            throw new NomeNuloException();
        }
        else
            this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if(altura<0)
        {
            throw new AlturaNegativaException();
        }
        else
        {
            this.altura = altura;
        }

    }
}
