package POO;

public class TelefonePublico extends Telefone {
	
	public TelefonePublico() {
		super("Publico");
	}

	@Override
	public void toca(int numToques) {
		
		for( int i=0;i<numToques;i++) {
			System.out.println("\nPiririnPiririnPiririn");
		}
	}
	
	@Override
	public void disca(String numero) {
		if(numero.charAt(0) == '9' || numero.charAt(0) == '8') { //charAt busca um caractere em uma determina posicao
			System.out.println("\nEste telefone não liga para celular!!!");
		}else {
			System.out.println("\nOK!");
		}
	}
	
}
