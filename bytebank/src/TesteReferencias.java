public class TesteReferencias {
    public static void main(String[] args) {
        Conta conta1 = new Conta();
        conta1.saldo = 300;

        System.out.println("Saldo conta1: " + conta1.saldo);

        Conta conta2 = conta1;
        conta2.saldo = 150;
        System.out.println("Saldo conta1: " + conta1.saldo);
        System.out.println("Saldo conta2: " + conta2.saldo);

        if (conta1==conta2){
            System.out.println("sao as mesmas");
        }
    }
}
