
public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario func = new Gerente();
		func.setNome("Rodrigo");
		func.setCpf("Rodrigo");
		func.setSalario(1000);		
		System.out.println(func.getNome());
		System.out.println(func.getBonificacao());		
		
	}

}
