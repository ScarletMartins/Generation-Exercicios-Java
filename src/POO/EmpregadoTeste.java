package POO;

public class EmpregadoTeste {

	public static void main(String[] args) {

		Empregado[]	lista = new Empregado[3];
		
		lista[0] = new Empregado("Letícia Santos", 25000);
		lista[1] = new Empregado("Hellen Digramont", 15000);
		lista[2] = new Empregado("Isabel", 45750);
		
		for(Empregado roda:lista) {//laço para rodar a classe com uma varial loop "roda
			
			roda.imprimir();
			
		}
		
		System.out.println("\n\t-----------------------------------------");
		System.out.println("\n\t\tSalário com aumento de 20%");
		
		for(Empregado roda:lista) {
			roda.aumentarSalario(20);
			roda.imprimir();
	
		}
	}
}