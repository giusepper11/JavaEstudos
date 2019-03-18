package java1;

public class AlicotaIfs {
    public static void main(String[] args) {
        double salario = 4000.0;

        if (salario >= 1900.0 && salario <= 2800.0) {
            System.out.println("IR de 7.5%");
            System.out.println("Deduçao de R$142");
        } else if (salario >= 2800.01 && salario <= 3751.0) {
            System.out.println("IR de 15%");
            System.out.println("Deduçao de R$350");

        } else if (salario >= 3751.01 && salario <= 4664.0) {
            System.out.println("IR de 22.5%");
            System.out.println("Deduçao de R$636");
        }
    }
}
