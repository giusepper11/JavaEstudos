package java1;

public class TestaCondicional2 {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 18;
        int quantidadePessoa = 2;
        boolean acompanhado = quantidadePessoa >= 2;
        if (idade >= 18 && acompanhado == true) { // && e || ou
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Vc nao pode entrar");
        }


    }
}

