package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.CalculadorImpostos;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.SeguroVida;

public class TesteTributaveis {
    public static void main(String[] args) {

        CalculadorImpostos ci = new CalculadorImpostos();

        ContaCorrente cc = new ContaCorrente(222, 333);
        cc.deposita(100);
        ci.registra(cc);

        SeguroVida sv = new SeguroVida();
        ci.registra(sv);

        System.out.println(ci.getTotalImposto());
    }
}
