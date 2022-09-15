package POO;

public class Cachorro extends Animal {
	
	public Cachorro(String nome, int idade) {
		super(nome,idade);
	}
	
	@Override
	public void som(String som) {
		System.out.println("\nO cachorro emite o som: au auuuuu. Este é seu latido!!");
	}
	
	@Override
	public void acao(String acao) {
		System.out.println("\nA açao do cachorro é correr!!\n\n\n\t---------------------------");
	}
	
	public void imprimirDados() {
		System.out.println("\n\t Dados do animal \n\nNome: "+getNome()+"\n\nIdade: "+getIdade());
	}
	
}
