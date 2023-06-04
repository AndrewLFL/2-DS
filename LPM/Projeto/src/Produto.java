public class Produto {
    private String nome;
    private String descricao;
    private double preco;
    private String codigo;
    private int quantidade;

    public void exibir(){
        System.out.println("NOME: " + getNome() + "\nDESCRIÇÃO: "+ getDescricao() + "\nPREÇO: " +
                getPreco() + "\nCODIGO: " + getCodigo() + "\nQUANTIDADE: " + getQuantidade());
    }

    //m.e

        public Produto(String nome, String descricao, double preco, String codigo, int quantidade) {

            if (nome.matches("[0-9]+"))
            {
                throw new NomeInvalidoException();
            }
            else if (nome==null)
            {
                throw new NullPointerException();
            }
            else if(descricao.length()>200)
            {
            throw new LimiteDescricaoException();
            }
            else if (preco<0)
            {
                throw new NegativoException();
            }
            else if (String.valueOf(preco).matches("[A-Z]*")||String.valueOf(preco).matches("[a-z]*"))
            {
                throw new CaracterException();
            }
            else if (codigo.matches("[A-Z]*")||codigo.matches("[a-z]*"))
            {
                throw new CaracterException();
            }
            else if(codigo.contains("-"))
            {
                throw new NegativoException();
            }
            else if (codigo==null)
            {
                throw new NullPointerException();
            }
            else if (quantidade<0)
            {
                throw new NegativoException();
            }
            else if (String.valueOf(quantidade).matches("[A-Z]*")||String.valueOf(quantidade).matches("[a-z]*"))
            {
                throw new CaracterException();
            }
            else
            {
                this.nome = nome;
                this.descricao = descricao;
                this.preco = preco;
                this.codigo = codigo;
                this.quantidade = quantidade;
            }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao.length()<200)
        {
            throw new LimiteDescricaoException();
        }
        else
            this.descricao = descricao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco<0)
        {
            throw new NegativoException();
        }
        else if (String.valueOf(preco).matches("[A-Z]*")||String.valueOf(preco).matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else
            this.preco = preco;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo.matches("[A-Z]*")||codigo.matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else if(codigo.contains("-"))
        {
            throw new NegativoException();
        }
        else if (codigo==null)
        {
            throw new NullPointerException();
        }
        else
            this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade<0)
        {
            throw new NegativoException();
        }
        else if (String.valueOf(quantidade).matches("[A-Z]*")||String.valueOf(quantidade).matches("[a-z]*"))
        {
            throw new CaracterException();
        }
        else
            this.quantidade = quantidade;
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

}
