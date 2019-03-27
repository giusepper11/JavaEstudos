package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class TesteArrayListEquals {
    public static void main(String[] args) {
        ArrayList<Conta> lista = new ArrayList<Conta>(); //Forçando que a arraylist tenha apenas ref do tipo conta

        ContaCorrente cc = new ContaCorrente(123, 321);
        lista.add(cc);

        ContaCorrente cc2 = new ContaCorrente(345, 543);
        lista.add(cc2);
        ContaCorrente cc3 = new ContaCorrente(345, 543);
//        lista.add(cc3);

        boolean existe = lista.contains(cc3); // contains agora esta sendo sobescrito na Classe conta
        System.out.println(existe);


//        for (Conta conta : lista) {
//            if (conta.ehIgual(cc3)) {
//                System.out.println("Sim, já existe");
//            }
//        }

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}
