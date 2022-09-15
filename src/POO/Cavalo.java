package POO;

public class Cavalo extends Animal {
	
	public Cavalo(String nome, int idade) {
		super(nome,idade);
	}
	@Override
	public void som(String som) {
		System.out.println("\nO cavalo emite o som: iiihhh ihhhh. Este é seu relincho!!");
	}
	
	@Override
	public void acao(String acao) {
		System.out.println("\nA açao do cavalo é correr!!\n\n\n\t---------------------------");
	}

	public void imprimirDados() {
		System.out.println("\n\tDados do animal \n\nNome: "+getNome()+"\n\nIdade: "+getIdade());
	}
	
}
