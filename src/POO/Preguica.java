package POO;

public class Preguica extends Animal {
	
	private String acao;
	
	public Preguica(String nome, String emitirSom, int idade, String acao) {
		super(nome, emitirSom, idade);
		
		this.acao = acao;
	}

	public String getAcao() {
		return acao;
	}

	public void setAcao(String acao) {
		this.acao = acao;
	}
	
	public void imprimirDados() {
		System.out.println("\n\t\tDados do animal: \n\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nEmite o som: "+getEmitirSom()+"\nAção: "+acao);
	}
}
