package POO;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {

		System.out.println("\t\t\t\t TABELA DE PRODUTOS");
		System.out.println("\t\t\t____________________________________________");
		
		ProdutoEletronico produto1 = new ProdutoEletronico("Mouse","Dispositivo de entrada","Alta","Leve",129);
		produto1.imprimirDados();
		ProdutoEletronico produto2 = new ProdutoEletronico("Placa mãe","Dispositivo de processamento","Alta","Leve",1349);
		produto2.imprimirDados();

		System.out.println("\t\t\t\t TABELA DE PRODUTOS ALTERADOS");
		System.out.println("\t\t\t____________________________________________");

		produto1.setNome("Teclado");
		produto1.setValor(212);
		produto1.imprimirDados();
		
		System.out.println("\t\t\t\t TABELA DE PRODUTOS INALTERADOS");
		System.out.println("\t\t\t____________________________________________");
		
		produto2.imprimirDados();
	}

}
