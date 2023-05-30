public abstract class Pessoa {
    private String nome;
    private int idade;
    private String cpf;
    private String cep;

    //m.e

    public Pessoa(String nome, int idade, String cpf, String cep) {
        if(nome==null)
        {
            throw new NullPointerException();
        }
        else if(nome.matches("[0-9]+"))
        {
            throw new NomeInvalidoException();
        }
        else if(cep==null)
        {
            throw new NullPointerException();
        }
        else if(cpf==null)
        {
            throw new NullPointerException();
        }
        else if (idade<=0)
        {
            throw new NegativoException();
        }
        else if(cpf.length()!=11)
        {
            throw new CpfInvalidoException();
        }
        else if(cep.length()!=8)
        {
            throw new CepInvalidoException();
        }
        else if(cep.matches("[A-Z]*")||cep.matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else if(cpf.matches("[A-Z]*")||cpf.matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else if(String.valueOf(idade).matches("[A-Z]*")||String.valueOf(idade).matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else
        {
            this.nome = nome;
            this.idade = idade;
            this.cpf = cpf;
            this.cep = cep;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome==null)
        {
            throw new NullPointerException();
        }
        else if(nome.matches("[0-9]+"))
        {
            throw new NomeInvalidoException();
        }
        else
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade<=0)
        {
            throw new NegativoException();
        }
        else if(String.valueOf(idade).matches("[A-Z]*")||String.valueOf(idade).matches("[a-z]*"))
        {
            throw new CaracterException();
        }else
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if(cpf.matches("[A-Z]*")||cpf.matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else if(cpf.length()!=11)
        {
            throw new CpfInvalidoException();
        }
        else if(cpf==null)
        {
            throw new NullPointerException();
        }
        else
        this.cpf = cpf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        if(cep.length()!=8)
        {
            throw new CepInvalidoException();
        }
        else if(cep.matches("[A-Z]*")||cep.matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else if(cep==null)
        {
            throw new NullPointerException();
        }
        else
        this.cep = cep;
    }
}
