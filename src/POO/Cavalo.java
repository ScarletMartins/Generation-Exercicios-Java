package POO;

public class Cavalo extends Animal {
	
	private String acao;
	
	public Cavalo(String nome, String emitirSom, int idade, String acao) {
		super(nome, emitirSom, idade);
		
		this.acao = acao;
	}

	public String getCorrer() {
		return acao;
	}

	public void setCorrer(String correr) {
		this.acao = correr;
	}

	public void imprimirDados() {
		System.out.println("\n\t\tDados do animal: \n\nNome: "+getNome()+"\nIdade: "+getIdade()+"\nEmite o som: "+getEmitirSom()+"\nAção: "+acao);
	}
}
