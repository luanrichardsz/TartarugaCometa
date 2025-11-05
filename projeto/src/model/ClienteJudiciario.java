package model;

public class ClienteJudiciario extends Cliente{
    private String cnpj;
    private String razaoSocial;

    public ClienteJudiciario(String nome, String endereco, String telefone, String cnpj, String razaoSocial) {
        super(nome, endereco, telefone);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
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
        return "\nCliente Judiciario: \n" +
               "Nome = " + getNome() +
               "\nEndereco = " + getEndereco() +
               "\nTelefone = " + getTelefone() +
               "\nCNPJ = " + getCnpj() +
               "\nRazão Social = " + getRazaoSocial();
    }
}
