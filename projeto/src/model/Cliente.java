package model;

public class Cliente {
    private String nome;
    private String cpfCnpj;
    private String razaoSocial;
    public Endereco enderecoCliente;
    public boolean isFisico;

    public Cliente(String nome, String cpfCnpj, String razaoSocial, Endereco enderecoCliente) {
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.razaoSocial = razaoSocial;
        this.enderecoCliente = enderecoCliente;
        this.isFisico = isFisico();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Endereco getEnderecoCliente() {
        return enderecoCliente;
    }

    public void setEnderecoCliente(Endereco enderecoCliente) {
        this.enderecoCliente = enderecoCliente;
    }

    public boolean isFisico() {
        return isFisico;
    }

    public void setFisico(boolean fisico) {
        isFisico = fisico;
    }

    //Validação no controller sobre CPF e CNPJ


    @Override
    public String toString() {
        return  "\nNome='" + nome + '\'' +
                "\ncpfCnpj='" + cpfCnpj + '\'' +
                "\nrazaoSocial='" + razaoSocial + '\'' +
                "\nenderecoCliente=" + enderecoCliente +
                '}';
    }
}

