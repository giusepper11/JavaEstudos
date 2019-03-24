public class Administrador extends Funcionario implements Autenticavel {

    private int senha;
    private AutenticacaoUtil autenticador;

    public Administrador() {
        this.autenticador = new AutenticacaoUtil();

    }

    @Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Administrador");
        return 50;
    }

    @Override
    public void setSenha(int senha) {
        this.autenticador.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
        return this.autenticador.autentica(senha);

    }
}
