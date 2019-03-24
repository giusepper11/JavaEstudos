package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteContas {

    public static void main(String[] args) {

        ContaEspecial ce = new ContaEspecial(123,321);
        System.out.println(ce.getSaldo());

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100);

        ContaPoupanca cp = new ContaPoupanca(222, 222);
        cp.deposita(200);

//        cc.transfere(10,cp);

        System.out.println(cp.getSaldo());

    }
}
