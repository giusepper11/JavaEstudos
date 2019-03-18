package java1;

public class TestaEscopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 18;
        int quantidadePessoa = 2;
        boolean acompanhado;
//        boolean acompanhado = quantidadePessoa >= 2;
        if (quantidadePessoa >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        if (idade >= 18 && acompanhado == true) { // && e || ou
            System.out.println("Seja bem vindo");
        } else {
            System.out.println("Vc nao pode entrar");
        }


    }


}
