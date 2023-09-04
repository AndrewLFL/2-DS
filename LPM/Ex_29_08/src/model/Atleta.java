package model;

public class Atleta {
    private String cod;
    private String nome;
    private double peso;
    private double altura;
    private int idade;
    
    public String mostrar(){
    return "Código: " + getCod() + " Nome: " + getNome() + " Peso: " + getPeso()+ " Altura: " + getAltura()+ " Idade: " + getIdade();
    }
    
    //m.e

    public Atleta(String cod, String nome, double peso, double altura, int idade) {
        this.cod = cod;
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
