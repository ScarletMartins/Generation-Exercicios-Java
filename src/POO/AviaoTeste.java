package POO;

public class AviaoTeste {

	public static void main(String[] args) {
		
		System.out.println("\n\t\t---------DADOS PRIMÁRIOS DO AVIÃO--------");

		Aviao aviao1 = new Aviao("PLM3124","PRATA",2003,250);
		aviao1.imprimirDados();
		Aviao aviao2 = new Aviao("QMDS94D","CINZA",1999,170);
		aviao2.imprimirDados();
		
		System.out.println("\n\t\t--------ALTERAÇÃO DE DADOS DO AVIÃO--------");
		
		aviao1.setModeloAviao("PSKE341");
		aviao1.imprimirDados();
		
		aviao2.getAssentosAviao();
		aviao2.imprimirDados();
	}

}
