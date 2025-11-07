package model;

public class Cliente {
    private String nome;
    private String cpf;
    private String cnpj;
    private String razaoSocial;
    public Endereco enderecoCliente;

    public Cliente(String nome, String cpf, String cnpj, String razaoSocial, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
        this.enderecoCliente = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String toString(){
        String tipoCliente;

        if (this.cnpj != null && !this.cnpj.isEmpty()){ //||
            tipoCliente = "Juridico";
        } else {
            tipoCliente = "Fisico";
        }

        return "\n=== Dados do Cliente " + tipoCliente + " ===\n" +
               "Nome: " + getNome() +
               "\nCPF: " + getCpf() +
               "\nCNPJ: " + getCnpj() +
               "\nRazão Social: " + getRazaoSocial() +
               "\n" + enderecoCliente + "\n";
    }
}

