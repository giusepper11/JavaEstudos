package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.Arrays;

public class TesteArrayReferencias {
    public static void main(String[] args) {

//        ContaCorrente[] contas = new ContaCorrente[5]; //Valor padrao de referencia é null
        Conta[] contas = new Conta[5];

        ContaCorrente cc1 = new ContaCorrente(123, 321);
        contas[0] = cc1;

        ContaPoupanca cc2 = new ContaPoupanca(456, 654);
        contas[1] = cc2;
        System.out.println(Arrays.toString(contas));
        System.out.println(contas[1].getNumero());

        ContaPoupanca ref =(ContaPoupanca) contas[1]; // (ContaPoupanca) é um cast
        System.out.println(ref.toString());
    }
}
