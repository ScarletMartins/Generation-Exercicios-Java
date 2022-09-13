package POO;

public class ProdutoEletronico {
	
	private String nome;
	private String tipo;
	private String privacidade;
	private String design;
	private int valor;
	
	public ProdutoEletronico(String nome, String tipo, String privacidade, String design, int valor) {
		
		this.nome = nome;
		this.tipo = tipo;
		this.privacidade = privacidade;
		this.design = design;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPrivacidade() {
		return privacidade;
	}

	public void setPrivacidade(String privacidade) {
		this.privacidade = privacidade;
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void imprimirDados() {
		System.out.println("\n\t\t\tDescrição do produto eletronico: \nNome: "+nome+"\nTipo: "+tipo+"\nPrivacidade: "+privacidade+"\nDesign: "+design+"\nValor: R$"+valor+",00");
	}
}
