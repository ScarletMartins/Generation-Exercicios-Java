package POO;

public class Aviao {
	
	private String modeloAviao;
	private String corAviao;
	private int anoAviao;
	private int assentosAviao;
	
	public Aviao(String modeloAviao, String corAviao, int anoAviao, int assentosAviao) {
		
		this.modeloAviao = modeloAviao;
		this.corAviao = corAviao;
		this.anoAviao = anoAviao;
		this.assentosAviao	= assentosAviao;
		
	}

	public String getModeloAviao() {
		return modeloAviao;
	}

	public void setModeloAviao(String modeloAviao) {
		this.modeloAviao = modeloAviao;
	}

	public String getCorAviao() {
		return corAviao;
	}

	public void setCorAviao(String corAviao) {
		this.corAviao = corAviao;
	}

	public int getAnoAviao() {
		return anoAviao;
	}

	public void setAnoAviao(int anoAviao) {
		this.anoAviao = anoAviao;
	}

	public int getAssentosAviao() {
		return assentosAviao;
	}

	public void setAssentosAviao(int assentosAviao) {
		this.assentosAviao = assentosAviao;
	}
	
	public void imprimirDados() {
		System.out.println("\n\t\t\t Características do avião: \nModelo: "+modeloAviao+"\nCor: "+corAviao+"\nAno de fabricação: "+anoAviao+"\nQuantidade de assentos: "+assentosAviao);
	}
	
}
