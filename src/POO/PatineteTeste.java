package POO;

public class PatineteTeste {

	public static void main(String[] args) {
		
		System.out.println("\t----Descrição do produto----");
		
		Patinete patinete1 = new Patinete("Rosa","Infantil","Plastico","Caloi",329);
		patinete1.imprimirDados();
		Patinete patinete2 = new Patinete("Verde","Intanfo-Juvenil","Alumínio","Urbano",474);
		patinete2.imprimirDados();
		
		patinete1.setMaterial("Alumínio");
		patinete1.imprimirDados();
		patinete2.setCor("Cinza");
		patinete2.getMarca();
		patinete2.imprimirDados();

	}

}
