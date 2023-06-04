public class Funcionario extends Pessoa implements IPessoa{
    private String numRegistro;

    @Override
    public void exibir(){
        System.out.println("NOME: " + getNome() + "\nIDADE: "+ getIdade() + "\nCPF: " +
                getCpf() + "\nCEP: " + getCep() + "\nNÚMERO DE REGISTRO: " + getNumRegistro());
    }

    //m.e

    public Funcionario(String nome, int idade, String cpf, String cep, String numRegistro) {
        super(nome, idade, cpf, cep);
        if (numRegistro==null)
        {
            throw new NullPointerException();
        }
        else if(numRegistro.matches("[A-Z]*")||numRegistro.matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else if(numRegistro.contains("-"))
        {
            throw new NegativoException();
        }
        else
        this.numRegistro = numRegistro;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        if (numRegistro==null)
        {
            throw new NullPointerException();
        }
        else if(numRegistro.matches("[A-Z]*")||numRegistro.matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else if(numRegistro.contains("-"))
        {
            throw new CaracterException();
        }
        else
        this.numRegistro = numRegistro;
    }
}
