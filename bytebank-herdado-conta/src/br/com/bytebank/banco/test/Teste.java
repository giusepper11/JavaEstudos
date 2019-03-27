package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
        System.out.println("x");
        System.out.println(1);
        System.out.println(1.7);
        System.out.println(false);

        ContaCorrente cc = new ContaCorrente(1223,213);
        System.out.println(cc);
        print(cc);
    }

    static void print(Object a){}
}
