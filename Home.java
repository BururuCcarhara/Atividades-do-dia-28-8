package Interfase;

public class Home implements Computador{

	String ligar;
	String desligar;
	String reiniciar;
	String carregandoSistemas;
	
	@Override
	public void ligar() {
		System.out.println ("Ligar");
	}
	@Override
	public void reiniciar () {
		System.out.println ("Reiniciar");
	}
	@Override
	public void desligar () {
		System.out.println ("Desligar");
	}
	@Override
	public void carregandoSistema() {
		System.out.println ("Carregar Sistema");
	}

	public String getLigar() {
		return ligar;
	}
	public void setLigar(String ligar) {
		this.ligar= ligar;
	}
	public String getReiniciar() {
		return reiniciar;
	}
	public void setReiniciar(String reiniciar) {
		this.reiniciar=reiniciar;
	}
	public String getDesligar() {
		return desligar;
	}
	public void setDesligar(String desligar) {
		this.desligar=desligar;
	}
	public String getCarregandoSistemas() {
		return carregandoSistemas;
	}
	public void setCarregandoSistemas(String carregandoSistemas) {
		this.carregandoSistemas=carregandoSistemas;
	}
}


