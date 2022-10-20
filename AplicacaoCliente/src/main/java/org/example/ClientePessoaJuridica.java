package org.example;

public class ClientePessoaJuridica extends  Cliente{

    private String cnpj;

    public ClientePessoaJuridica() {
        super();
        cnpj = "";
    }

    public ClientePessoaJuridica(String nome, String endereco, String cep, String cnpj) {
        super(nome, endereco, cep);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    }
