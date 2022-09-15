package POO;

import java.security.PublicKey;

public class AnimalTeste {

	public static void main(String[] args) {

		Cachorro dog = new Cachorro("Ragnar", 3);

		Cavalo horse = new Cavalo("Fenix", 7);

		Preguica sloth = new Preguica("Joana", 5);

		Animal animal = null;

		
			animal = dog;
			dog.imprimirDados();
			animal.som("");
			animal.acao("");
			
			animal = horse;
			horse.imprimirDados();
			animal.som("");
			animal.acao("");
			
			animal = sloth;
			sloth.imprimirDados();
			animal.som("");
			animal.acao("");
	

	}
}


