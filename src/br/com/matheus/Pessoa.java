package br.com.matheus;

public abstract class Pessoa {
    private String nome;

    private String sobrenome;

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

    public void imprimirPessoa() {
    System.out.println(this.nome + " " +this.sobrenome + "Tem a Documentação: ");
    }


}
