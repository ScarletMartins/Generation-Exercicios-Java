package POO;

public class Preguica extends Animal {
	
	public Preguica(String nome, int idade) {
		super(nome, idade);
	}
	
	@Override
	public void som(String som) {
		System.out.println("\nA preguiça emite o som: ahh ahhh. Este é seu som característico!!");
	}
	
	@Override
	public void acao(String acao) {
		System.out.println("\nA açao da preguiça é subir em árvores!!\n\n\n\t---------------------------");
	}
	
	public void imprimirDados() {
		System.out.println("\n\tDados do animal \n\nNome: "+getNome()+"\n\nIdade: "+getIdade());
	}
}
