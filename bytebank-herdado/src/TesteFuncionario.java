public class TesteFuncionario {
    public static void main(String[] args) {
        Funcionario peppe = new Funcionario();
        peppe.setNome("giuseppe rosa");
        peppe.setCpf("123456789-02");
        peppe.setSalario(2500.80);

        System.out.println(peppe.getNome());
        System.out.println(peppe.getBonificacao());

    }
}
