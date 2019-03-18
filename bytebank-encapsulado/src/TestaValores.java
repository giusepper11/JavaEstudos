public class TestaValores {
    public static void main(String[] args) {
        Conta conta = new Conta(1337,24226);
        conta.setNumero(-10);
        System.out.println(conta.getNumero());
    }
}
