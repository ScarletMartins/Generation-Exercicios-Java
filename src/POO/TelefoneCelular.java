package POO;

public class TelefoneCelular extends Telefone {
	
	public TelefoneCelular() {
		super("Celular");
	}
	
	@Override //cria uma sobrescrita do método abstrado toca
	public void toca(int codigoToque) {
		switch(codigoToque) {
		case 1:
			System.out.println("Trimmmm... trimmmm...");
			break;
		case 2:
			System.out.println("Plinnn... plinnn...");
			break;
			default:
				System.out.println("Trummm... trummm...");
		}
	}
	
	@Override
	public void disca(String numero) {
		System.out.println("\nO número: "+numero+" é um celular com toque: ");
	}
	
}
