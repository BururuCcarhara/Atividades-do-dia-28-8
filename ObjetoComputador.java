package Interfase;

public class ObjetoComputador {

	public static void main(String[] args) {
		Gamer gamer = new Gamer ();
		Home home = new Home ();

		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregandoSistema();
		
		System.out.println(gamer.getLigar());
		System.out.println(gamer.getReiniciar());
		System.out.println(gamer.getDesligar());
		System.out.println(gamer.getCarregandoSistemas());
		
		
		System.out.println(home.getLigar());
		System.out.println(home.getReiniciar());
		System.out.println(home.getDesligar());
		System.out.println(home.getCarregandoSistemas());
		
	}

}
