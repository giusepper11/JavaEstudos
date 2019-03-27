package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardador {
    public static void main(String[] args) {
        GuardadorDeContas guardador = new GuardadorDeContas();

        ContaCorrente cc = new ContaCorrente(123,321);
        ContaCorrente cc2 = new ContaCorrente(345,543);

        guardador.adiciona(cc);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = guardador.getReferenia(1);
        System.out.println(ref.getNumero());

    }
}
