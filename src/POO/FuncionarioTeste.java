package POO;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		
		System.out.println("\n\t\t\tTabela de funcionários");
		System.out.println("\t\t\t________________________");
		
		Funcionario funcionario1 = new Funcionario("Marcos","Professor","Educação","Roberto",2439);
		funcionario1.imprimirDados();
		Funcionario funcionario2 = new Funcionario("Michele","Secretária","Financeiro","Helena",3219);
		funcionario2.imprimirDados();
		
		
		System.out.println("\n\t\t\tTabela de alterações");
		funcionario1.setSuperior("Cláudio");
		funcionario1.imprimirDados();
		funcionario2.setCargo("Auxiliar");
		funcionario2.imprimirDados();
	}

}
