public class TestaBanco {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente();
        cliente1.nome = "giuseppe rosa";
        cliente1.cpf = "222.222.222-22";
        cliente1.profissao = "programador";


        Conta conta1 = new Conta();
        conta1.deposita(400);
        conta1.titular = cliente1;

        System.out.println(conta1.titular.nome);

    }


}
