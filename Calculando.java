package Interfase;

public class Calculando implements Calculo {
	
	@Override
	public double somar() {
		return 10+15;
	}
	public double sub() {
		return 15-10;
	}
	public double mult() {
		return 15*10;
	}
	public int div() {
		return 10/2;
	}
	public int exp() {
		return 5*5*5;
	}
}
