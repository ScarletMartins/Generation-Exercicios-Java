package POO;

public class Animal {
	
	private String nome;
	private String emitirSom;
	private int idade;
	
	public Animal(String nome, String emitirSom, int idade) {
		
		this.setNome(nome);
		this.setEmitirSom(emitirSom);
		this.setIdade(idade);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmitirSom() {
		return emitirSom;
	}

	public void setEmitirSom(String emitirSom) {
		this.emitirSom = emitirSom;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
