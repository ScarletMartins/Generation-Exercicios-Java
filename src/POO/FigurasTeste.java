package POO;

public class FigurasTeste {

	public static void main(String[] args) {

		Quadrado figura1 = new Quadrado(10,"Quadrado 1");
		Retangulo figura2 = new Retangulo(3,4,"Retangulo 1");
		
		System.out.println("\n"+figura1.getNome()+" :  "+figura1.getDiagonal());
		System.out.println("\n"+figura2.getNome()+" :  "+figura2.getDiagonal());
	}

}
