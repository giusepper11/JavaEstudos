package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29; //Integer no mundo OO
        Integer idadeRef = Integer.valueOf(29);
        List<Integer> numeros = new ArrayList<>();
        numeros.add(idade);
        numeros.add(28); //autoboxing > conversao automatica de primitivo para objeto


        System.out.println(idadeRef.longValue());
        System.out.println(Integer.MAX_VALUE);

        int valor = idadeRef.intValue(); //unboxing > conversao de objeto para primitivo




        System.out.println(numeros);



    }
}
