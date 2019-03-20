public class ControleBonificacao {

    private double soma;


    public void registra(Funcionario f) {
        System.out.println(f);
        double boni = f.getBonificacao();
        this.soma += boni;

    }


    public double getSoma() {
        return soma;
    }
}
