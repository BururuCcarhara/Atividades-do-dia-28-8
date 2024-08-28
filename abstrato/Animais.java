package Interfase.abstrato;

public class Animais {

	public static void main(String[] args) {
		Lobo lobao= new Lobo();
		Leão lion= new Leão();
		Tigre chitos = new Tigre();
		Cachorro scooby= new Cachorro();
		Gato uni= new Gato();
		
		System.out.println("zoolologico");
		System.out.println("-----Leão-----");
		lobao.dormir();
		lobao.caminhar();
		lobao.correr();
		lobao.emitirsom();
		System.out.println(lobao.getNome());
		System.out.println(lobao.getSexo());
		System.out.println(lobao.getRaca());
		lobao.setNome("Lobo Mal");
		lobao.setSexo("Masculino");
		lobao.setRaca("Lobo das Neves");
		System.out.println("-----Lion----");
		lion.dormir();
		lion.caminhar();
		lion.correr();
		lion.emitirsom();
		System.out.println(lion.getNome());
		System.out.println(lion.getSexo());
		System.out.println(lion.getRaca());
		lion.setNome("Madadascar");
		lion.setSexo("Masculino");
		lion.setRaca("Laranja");

		System.out.println("----Tigre----");
		chitos.dormir();
	    chitos.caminhar();
		chitos.correr();
		chitos.emitirsom();
		System.out.println(chitos.getNome());
		System.out.println(chitos.getSexo());
		System.out.println(chitos.getRaca());
		chitos.setNome("Chitos");
		chitos.setSexo("Masculino");
		chitos.setRaca("Tigre laranja");

		System.out.println("----Cachorro----");
		scooby.dormir();
	    scooby.caminhar();
		scooby.correr();
		scooby.emitirsom();
		System.out.println(scooby.getNome());
		System.out.println(scooby.getSexo());
		System.out.println(scooby.getRaca());
		scooby.setNome("Scooby");
		scooby.setSexo("Masculino");
		scooby.setRaca("Labrador");

		System.out.println("----Gato----");
		uni.dormir();
	    uni.caminhar();
		uni.correr();
		uni.emitirsom();
		System.out.println(uni.getNome());
		System.out.println(uni.getSexo());
		System.out.println(uni.getRaca());
		uni.setNome("uni");
		uni.setSexo("Feminino");
		uni.setRaca("Frajola");

	}
}
