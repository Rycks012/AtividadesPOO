package org.example;

public class Cliente {
    private String nome;
    private String endereco;
    private String cep;

    public Cliente() {
        nome = "";
        endereco = "";

    }

    public Cliente(String nome, String endereco, String cep) {
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
