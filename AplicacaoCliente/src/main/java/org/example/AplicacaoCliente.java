package org.example;

public class AplicacaoCliente {
    public static void main(String[] args) {
        ClientePessoaFisica cli = new ClientePessoaFisica("Fulano","Rua tal","123","1451263");
        ClientePessoaJuridica cliPesFis = new ClientePessoaJuridica("Sicrano","Rua agora foi","123","84542145");
        AplicacaoCliente.imprime(cli);
        AplicacaoCliente.imprimindo(cliPesFis);
    }
    public static void imprime(ClientePessoaFisica c) {
        System.out.println("Nome: "+c.getNome());
        System.out.println("Endereco: " +c.getEndereco());
        System.out.println("CEP: "+c.getCep());
        System.out.println("CPF: "+c.getCpf());
    }

    public static void imprimindo(ClientePessoaJuridica d) {
        System.out.println("Nome: "+d.getNome());
        System.out.println("Endereco: " +d.getEndereco());
        System.out.println("CEP: "+d.getCep());
        System.out.println("CNPJ: "+d.getCnpj());
    }
}
