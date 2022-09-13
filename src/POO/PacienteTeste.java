package POO;

public class PacienteTeste {

	public static void main(String[] args) {

		System.out.println("\t\t---Quadro de pacientes---");
		
		Paciente paciente1 = new Paciente("Carlos","Pneumonia","Masculino",58);
		paciente1.imprimirDados();
		Paciente paciente2 = new Paciente("Alice","Enxaqueca","Feminino",12);
		paciente2.imprimirDados();
		
		System.out.println("\t\t---Quadro de pacientes com quadro alterado---");

		paciente1.setQuadro("Melhora - Paciente em alta");
		paciente1.imprimirDados();
		paciente2.setQuadro("Piora - Paciente em transferencia para UTI");
		paciente2.imprimirDados();
	}

}
