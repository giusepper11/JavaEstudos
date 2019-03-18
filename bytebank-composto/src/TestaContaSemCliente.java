public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
//        System.out.println(conta1.saldo);
        System.out.println(conta1.consultaExtrato());

        conta1.titular = new Cliente();

        conta1.titular.nome = "Marcela";
        System.out.println(conta1.titular.nome);
    }
}
