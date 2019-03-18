public class TestaGetSet {
    public static void main(String[] args) {
        Conta conta = new Conta(12345,5678);
        conta.setNumero(12345);
        System.out.println(conta.getNumero());

        Cliente cliente = new Cliente();
        conta.setTitular(cliente);
        cliente.setNome("Giuseppe");
        System.out.println(conta.getTitular().getNome());

        conta.getTitular().setProfissao("Programador");
        System.out.println(conta.getTitular().getProfissao());
    }
}
