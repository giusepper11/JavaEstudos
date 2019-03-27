package br.com.bytebank.banco.test;

public class TestaString {
    public static void main(String[] args) {
        String nome = "Aluno"; // object literal
        System.out.println(nome.toUpperCase());

        nome.replace("A","B");
        char c = 'x';
        System.out.println(nome);
        System.out.println(c);
        System.out.println(nome.replace("A","B"));
    }
}
