public class TesteTributaveis {
    public static void main(String[] args) {

        CalculadorImpostos ci = new CalculadorImpostos();

        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100);
        ci.registra(cc);

        SeguroVida sv = new SeguroVida();
        ci.registra(sv);

        System.out.println(ci.getTotalImposto());
    }
}
