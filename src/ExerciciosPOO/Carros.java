package ExerciciosPOO;

public class Carros {
	String cor = "";
	String modelo = "";
	int capacidadeTanque = 0;

	Carros() {

	}

	Carros(String cor, String modelo, int capacidadeTanque) { //Construtor e sbrecarga da classe Carros
		this.cor = cor; //parametros
		this.modelo = modelo; //This é uma forma de diferenciar oq pertence e não pertence ao objeto
		this.capacidadeTanque = capacidadeTanque;
	}

	void setCor(String cor) { //Guarda o valor de Cor
		this.cor = cor;

	}

	String getCor() { //Devolve o valor de Cor guardado no set
		return cor;
	}

	void setModelo(String modelo) {  //Guarda o valor de Modelo guardado no set
		this.modelo = modelo;

	}
	String getModelo() { //Devolve o valor de Modelo guardado no set
		return modelo;
	}
	void setCapacidadeTanque(int capacidadeTanque) { //Guarda o valor de CapacidadeTanque
		this.capacidadeTanque = capacidadeTanque;
	}
	int getCapacidadeTanque() { //Devolve o valor de CapacidadeTanque guardado no set
		return capacidadeTanque;
	}
	double TotalValorTanque() {
		return capacidadeTanque = capacidadeTanque * ValorCombustivel;
	}

}
