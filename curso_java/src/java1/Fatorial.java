package java1;

public class Fatorial {
    public static void main(String[] args) {

        for (int c = 1; c < 10; c++) {
            int total = 1;
            for (int n = 1; n <= c; n++) {
                total *= n;
            }
            System.out.println(total);
        }
    }
}
