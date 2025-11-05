package model;

public class Cliente {
    public String nome;
    public String endereco;
    public String cpf;
    public String cnpj;
    public String razaoSocial;

    public Cliente(String nome, String endereco, String cpf, String cnpj, String razaoSocial) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    public String listarCliente() {
        return nome;
    }

    public void cadastrarCliente(String nome) {
        this.nome = nome;
    }

    public String listarEndereco() {
        return endereco;
    }

    public void cadastrarEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String retornarCpf() {
        return cpf;
    }

    public void cadastrarCpf(String cpf) {
        this.cpf = cpf;
    }

    public String retornarCnpj() {
        return cnpj;
    }

    public void cadastrarCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String retornarRazaoSocial() {
        return razaoSocial;
    }

    public void cadastrarRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
