package org.example;

public class ClientePessoaFisica extends Cliente{

    private String cpf;

    ClientePessoaFisica(){
        super();
        cpf = "";
    }
    public ClientePessoaFisica(String nome, String endereco, String cep, String cpf) {
        super(nome, endereco, cep);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCPF(String cpf) {
        this.cpf = cpf;
    }
}
