package ExerciciosPOO;

public class executarPessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.setNome("Adriano");
		pessoa1.setIdade(18);
		pessoa1.setSexo("Masculino");
		
		System.out.println(pessoa1.getNome());
		System.out.println(pessoa1.getIdade());
		System.out.println(pessoa1.getSexo());

	}

}
