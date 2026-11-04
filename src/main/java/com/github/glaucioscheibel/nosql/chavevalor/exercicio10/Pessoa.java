package com.github.glaucioscheibel.nosql.chavevalor.exercicio10;

public class Pessoa {

    private int id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private int idade;

    public Pessoa() {}

    public Pessoa(int id, String nome, String sobrenome, String telefone, int idade) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
        this.idade = idade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", telefone=" + telefone
                + ", idade=" + idade + "]";
    }
}
