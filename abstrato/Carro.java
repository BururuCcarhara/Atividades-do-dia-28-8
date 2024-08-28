package Interfase.abstrato;

public class Carro implements Abstration{

	String cor;
	String modelo;
	String placa;
	int ano;
		
		@Override
		public void acelerar() {
			System.out.println ("Acelerando");
	}
		@Override
		public void frear() {
			System.out.println ("Freando");
	}
		@Override
		public void virar() {
			System.out.println ("Virando");
	}
		@Override
		public void ligar() {
			System.out.println ("Ligando");
	}
}
