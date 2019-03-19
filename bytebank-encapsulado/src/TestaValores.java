public class TestaValores {
    public static void main(String[] args) {
        Conta conta1 = new Conta(1337,24226);
        Conta conta2 = new Conta(1337,16589);

        System.out.println(Conta.getTotal());
    }
}
