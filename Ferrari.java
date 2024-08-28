package Interfase;

public class Ferrari implements Veiculo{
	String ligar;
	String desligar;
	String manobrar;
	String acelerando;
	String frear;
	
	@Override
	public void ligar() {
		System.out.println ("Ligar");
	}
	@Override
	public void desligar () {
		System.out.println ("Desligar");
	}
	@Override
	public void manobrar () {
		System.out.println ("Manobrando");
	}
	@Override
	public void engatar () {
		System.out.println ("Engatado");
	}
	@Override
	public void acelerar () {
		System.out.println ("Acelerando");
	}
	@Override
	public void frear () {
		System.out.println ("Freando");
	}
	public String getLigar() {
		return ligar;
	}
	public void setLigar(String ligar) {
		this.ligar= ligar;
	}
	public String getDesligar() {
		return desligar;
	}
	public void setDesligar(String desligar) {
		this.desligar=desligar;
	}
	public String getManobrar() {
		return manobrar;
	}
	public void setManobrar(String manobrar) {
		this.manobrar=manobrar;
	}
	public String getAcelerando() {
		return acelerando;
	}
	public void setAcelerando(String acelerando) {
		this.acelerando=acelerando;
	}
	public String getFrear() {
		return frear;
	}
	public void setFrear(String frear) {
		this.frear=frear;
	}
}