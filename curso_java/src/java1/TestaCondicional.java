package java1;

public class TestaCondicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 17;
        int quantidadePessoas = 1;
        if (idade >= 18) {
            System.out.println("vc tem mais de 18 anos");
//            System.out.println("Seja bem vindo");
        } else if (quantidadePessoas >= 2) {
            System.out.println("Beleza, pode entrar por estar acompanhado");
        } else {
            System.out.println("Vc nao pode entrar");

        }
    }
}
