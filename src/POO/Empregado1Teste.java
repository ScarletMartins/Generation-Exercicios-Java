package POO;

public class Empregado1Teste {

	public static void main(String[] args) {
		
		Empregado1 emp = new Empregado1("Juliana Cruz", "Rua da Marola 99", "12345273812", 948484848, 20, 122, 5000, 30);
		
		emp.imprimirDados();
		emp.calcularSalario();
	}

}
