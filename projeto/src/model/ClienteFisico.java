package model;

public class ClienteFisico extends Cliente {
    private String cpf;

    public ClienteFisico(String nome, String endereco, String telefone, String cpf) {
        super(nome, endereco, telefone);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString(){
        return "Cliente Fisico: \n" +
                "Nome = " + getNome() +
                "\nEndereco = " + getEndereco() +
                "\nTelefone = " + getTelefone() +
                "\nCPF = " + getCpf();
    }
}

