package ExerciciosPOO;

public class Pessoa {
	String nome = "";
	int idade = 0;
	String sexo = "";

	Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;

	}
	
	

	Pessoa() {
		
	}



	String getNome() {
		return nome;
	}

	void setNome(String nome) {
		this.nome = nome;
	}

	int getIdade() {
		return idade;
	}

	void setIdade(int idade) {
		this.idade = idade;
	}

	 String getSexo() {
		return sexo;
	}

	void setSexo(String sexo) {
		this.sexo = sexo;
	}

}
