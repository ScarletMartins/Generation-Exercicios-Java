package POO;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	abstract public void som(String som);
	abstract public void acao(String acao);
	
	public Animal(String nome, int idade) {
		
		this.setNome(nome);
		this.setIdade(idade);
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
