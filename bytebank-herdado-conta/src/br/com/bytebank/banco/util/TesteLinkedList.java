package br.com.bytebank.banco.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteLinkedList {
    public static void main(String[] args) {
        List<Conta> lista = new LinkedList<>(); //Forçando que a arraylist tenha apenas ref do tipo conta

        ContaCorrente cc = new ContaCorrente(123, 321);
//
        ContaCorrente cc2 = new ContaCorrente(345, 543);

        lista.add(cc);
        lista.add(cc2);

//        Cliente cliente = new Cliente();
//        lista.add(cliente);

        System.out.println(lista.size());


        Conta ref = lista.get(0);
        System.out.println(ref.getNumero());

        lista.remove(0);
        System.out.println(lista.size());

        ContaCorrente cc3 = new ContaCorrente(123, 321);
        ContaCorrente cc4 = new ContaCorrente(345, 543);
        lista.add(cc3);
        lista.add(cc4);
        System.out.println(lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        System.out.println("-------------------------");

        for (Conta conta : lista) {
            System.out.println(conta);
        }

    }
}
