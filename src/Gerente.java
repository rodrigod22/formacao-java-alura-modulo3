
public class Gerente extends Funcionario implements Autenticavel{

	private Autenticador autenticador;
	
	public Gerente() {
		this.autenticador = new Autenticador();
	}
	
	@Override
	public double getBonificacao() {		
		return super.getSalario();
	}

	@Override
	public boolean autentica(int senha) {
		boolean autenticou = this.autenticador.autentica(senha);
		return autenticou;
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);		
	}	
	
}
