package POO;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Cachorro dog = new Cachorro("Ragnar","Latido",3,"Corre");
		dog.imprimirDados();
		
		Cavalo horse = new Cavalo("Fenix","Relincho",7,"Corre");
		horse.imprimirDados();
		
		Preguica sloth = new Preguica("Joana","Who nows????",5,"Sobe em árvore");
		sloth.imprimirDados();
		
	}

}
