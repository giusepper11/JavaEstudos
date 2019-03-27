package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.Arrays;

//Array []
public class TesteArrayDePrimitivos {
    public static void main(String[] args) {
        int[] idades = new int[5]; //inicializa array com padroes, no caso int é 0
//
//        idades[0] = 51;
//        idades[1] = 52;
//        idades[2] = 53;
//        idades[3] = 54;
//        idades[4] = 55;
//        System.out.println(Arrays.toString(idades));
//        System.out.println(idades.length);

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i + 1;
        }
        System.out.println(Arrays.toString(idades));
        System.out.println(idades.length);
        System.out.println(idades[0]);


    }

}
