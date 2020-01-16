
public class Gerente extends Funcionario{
	
	private int senha;
	
	
	public boolean autencica(int senha) {
		if(this.senha == senha) {
			return true;
		}
		return false;
	}
	
	public double getBonificacao() {
		return super.getBonificacao() + super.salario;
	}
	
}
