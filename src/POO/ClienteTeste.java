package POO;

public class ClienteTeste {

	public static void main(String[] args) {

		Cliente clienteA = new Cliente("Scarlet Martins","scarletgam@icloud.com","Feminino",432723312);
		clienteA.imprimirDados();
		Cliente clienteB = new Cliente("João Silva","joao_silva@gmail.com","Masculino",423432343);
		clienteB.imprimirDados();
		
		System.out.println("\n\n\t\t-----ALTERAÇÃO DE DADOS-----");
		
		clienteA.setSexoCliente("Indefinido");
		clienteA.imprimirDados();
		
		clienteB.setCpfCliente(124312314);
		clienteB.imprimirDados();
		
	}

}
