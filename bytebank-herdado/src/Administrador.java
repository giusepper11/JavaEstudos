public class Administrador extends Funcionario implements Autenticavel {
	
	private int senha;

	@Override
	public double getBonificacao() {
		System.out.println("Chamando o método de bonificacao do Administrador");
		return 50;
	}
	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}

	@Override
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}
}
