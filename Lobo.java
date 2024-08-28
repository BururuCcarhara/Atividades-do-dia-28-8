package Interfase;

public class Lobo implements Animal {
 
	String dormir;
	String caminhar;
	String correr;
	String emitirsom;
	
	@Override
	public void dormir () {
		System.out.println ("Dormindo");
	}
	@Override
	public void caminhar () {
		System.out.println ("Caminhando");
	}
	@Override
	public void correr () {
		System.out.println ("Correndo");
	}
	@Override
	public void emitirsom () {
		System.out.println ("Uivando");
	}
	public String getDormir() {
		return dormir;
	}
	public void setDormir(String dormir) {
		this.dormir= dormir;
	}
	public String getCaminhar() {
		return caminhar;
	}
	public void setCaminhar(String caminhar) {
		this.caminhar=caminhar;
	}
	public String getCorrer() {
		return correr;
	}
	public void setCorrer(String correr) {
		this.correr=correr;
	}
	public String getEmitirsom() {
		return emitirsom;
	}
	public void setEmitirsom(String emitirsom) {
		this.emitirsom=emitirsom;
	}
}
