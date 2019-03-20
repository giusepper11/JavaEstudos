public class TesteReferencias {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("giu");
        g1.setSalario(5000.00);
        String nome = g1.getNome();

        Funcionario f1 = new Funcionario();
        f1.setSalario(1234);

        EditorVideo ed1 = new EditorVideo();
        ed1.setSalario(2000);

        System.out.println(nome);

        ControleBonificacao controle = new ControleBonificacao();
        controle.registra(g1);
        controle.registra(f1);
        controle.registra(ed1);

        System.out.println(controle.getSoma());
    }
}
