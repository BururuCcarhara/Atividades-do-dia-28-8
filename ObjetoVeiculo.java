package Interfase;

public class ObjetoVeiculo {

	public static void main(String[] args) {
	
	Ferrari ferrari = new Ferrari ();
		ferrari.ligar();
		ferrari.desligar();
		ferrari.manobrar();
		ferrari.engatar();
		ferrari.acelerar();
		ferrari.frear();
		
		System.out.println(ferrari.getLigar());
		System.out.println(ferrari.getDesligar());
		System.out.println(ferrari.getManobrar());
		System.out.println(ferrari.getAcelerando());
		System.out.println(ferrari.getFrear());

	}

}
