package POO;

public class ContaBancariaTeste {

	public static void main(String[] args) {
		
		System.out.println("\n\t\t\t-----Informe de dados bancários-----");

		ContaBancaria conta1 = new ContaBancaria("Poupança","Maria José","Itaú",120392,231);
		conta1.imprimirDados();
		ContaBancaria conta2 = new ContaBancaria("Corrente","José Maria","Bradesco",432368,654);
		conta2.imprimirDados();
		
		System.out.println("\n\t\t\t-----Alteração de dados bancários-----");
		
		conta1.setProprietarioConta("Fernanda Silva");
		conta1.imprimirDados();
		conta2.setBanco("Nubank");
		conta2.imprimirDados();
		
	}

}
