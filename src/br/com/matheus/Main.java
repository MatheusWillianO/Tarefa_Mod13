package br.com.matheus;

public class Main {
    public static void main(String[] args) {
        PessoaFisica fisica = new PessoaFisica();
        fisica.setNome("Matheus");
        fisica.setSobrenome("Willian ");
        fisica.setCpf("111.222.333-44");
        imprimir(fisica);
        System.out.println(fisica.getCpf());



        PessoaJuridica juridica = new PessoaJuridica();
        juridica.setNome("Toninho");
        juridica.setSobrenome("Autoeletrica ");
        juridica.setCnpj("12.345.678/0001-00");
        imprimir(juridica);
        System.out.println(juridica.getCnpj());
    }

    public static void imprimir(Pessoa pessoa) {
        pessoa.imprimirPessoa();
    }
}
