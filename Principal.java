package Interfase;

public class Principal {

	public static void main(String[] args) {
		
		Lobo lobinho = new Lobo();
		
		lobinho.dormir();
		lobinho.caminhar();
		lobinho.correr();
		lobinho.emitirsom();
		
		System.out.println(lobinho.getDormir());
		System.out.println(lobinho.getCaminhar());
		System.out.println(lobinho.getCorrer());
		System.out.println(lobinho.getEmitirsom());

	}

}
