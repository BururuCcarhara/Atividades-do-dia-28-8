package Interfase;

public class Resultado {

	public static void main(String[] args) {
		Calculando calc= new Calculando();
		
		System.out.println(calc.somar());
		System.out.println(calc.sub());
		System.out.println(calc.mult());
		System.out.println(calc.div());
		System.out.println(calc.exp());
	}

}
