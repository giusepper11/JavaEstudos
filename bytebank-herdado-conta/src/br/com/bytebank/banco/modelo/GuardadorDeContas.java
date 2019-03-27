package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
    private Conta[] refencias;
    private int posicaoLivre;

    public GuardadorDeContas() {
        this.refencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Conta ref) {
        this.refencias[this.posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidadeDeElementos() {
        return this.posicaoLivre;
    }

    public Conta getReferenia(int i) {
        return this.refencias[i];
    }
}
