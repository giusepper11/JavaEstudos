public class CriaConta {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 200;
        System.out.println(conta1.saldo);

        conta1.saldo += 100;
        System.out.println(conta1.saldo);

        Conta conta2 = new Conta();
        conta2.saldo = 3000;
        System.out.println(conta2.saldo);

        System.out.println(conta1.agencia);
        System.out.println(conta1.numero);

    }
}
