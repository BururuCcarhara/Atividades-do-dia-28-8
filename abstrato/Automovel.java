package Interfase.abstrato;

public class Automovel {

	public static void main(String[] args) {
		Onibus busao= new Onibus();
		Carro car= new Carro();
		
		System.out.println("Busããããããããoooo");
		busao.acelerar();
		busao.frear();
		busao.ligar();
		busao.virar();
		System.out.println("...............");
		System.out.println("CAaaaaaaaaaaaar");
		car.acelerar();
		car.frear();
		car.ligar();
		car.virar();
	}

}
