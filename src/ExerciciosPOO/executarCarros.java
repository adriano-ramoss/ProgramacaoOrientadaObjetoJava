package ExerciciosPOO;

public class executarCarros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Carros carro1 = new Carros(); //Criando Objeto
		
		carro1.setCor("Azul"); //Dizendo a cor
		carro1.setModelo("Uno"); //Dizendo o modelo
		carro1.setCapacidadeTanque(40); //Dizendo a CapscidadeDoTanque
		
		
		System.out.println(carro1.getCor()); //Mostrando os valores usando o get
		System.out.println(carro1.getModelo());
		System.out.println(carro1.getCapacidadeTanque());
		System.out.println(carro1.TotalValorTanque(7)); //Chamando o método do calculo da gasolina
		System.out.println("----------------------------");
		
		Carros carro2 = new Carros("Preto", "Fiat", 50); //Usando sobrecarga adicionando novos parâmetros
		
		
		System.out.println(carro2.getCor());
		System.out.println(carro2.getModelo());
		System.out.println(carro2.getCapacidadeTanque());
		System.out.println(carro1.TotalValorTanque(7));
		
		
		

	}

}
