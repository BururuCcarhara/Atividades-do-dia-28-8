package Interfase.abstrato;

public class Cachorro implements Animal {
	String nome;
	String sexo;
	String raca;
	
	@Override
	public void dormir() {
		System.out.println ("Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println ("Caminhando");
}
	@Override
	public void correr() {
		System.out.println ("Correndo");

}
	@Override
	public void emitirsom() {
		System.out.println ("Latido");

}

	public void setNome(String nome) {
		this.nome=nome;
	}
	public String getNome() {
		return nome;
	}
	public void setSexo(String sexo) {
		this.sexo=sexo;
	}
	public String getSexo() {
		return sexo;
	}
	public void setRaca(String raca) {
		this.raca=raca;
	}
	public String getRaca() {
		return raca;
	}


}

