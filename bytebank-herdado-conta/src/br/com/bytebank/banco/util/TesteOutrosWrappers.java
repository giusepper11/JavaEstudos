package br.com.bytebank.banco.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {
    public static void main(String[] args) {
        Integer idadeRef = Integer.valueOf(29); //autoboxing
        System.out.println(idadeRef.intValue()); // unboxing

        Double dRef = Double.valueOf("3.2"); //autoboxing
        System.out.println(dRef.doubleValue()); //unboxing

        Boolean bRef = Boolean.TRUE;
        System.out.println(bRef.booleanValue());

        Number refNumber = Float.valueOf(29.9f);
        refNumber.floatValue();

        List<Number> lista = new ArrayList<>();
        lista.add(10);
        lista.add(10.9f);
        lista.add(10.9000);
        System.out.println(lista);


    }
}
