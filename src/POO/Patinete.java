package POO;

public class Patinete {

	private String cor;
	private String tamanho;
	private String material;
	private String marca;
	private int valor;
	
	public Patinete(String cor,String tamanho,String material,String marca,int valor) {
		
		this.cor = cor;
		this.tamanho = tamanho;
		this.material = material;
		this.marca = marca;
		this.valor = valor;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	
	public void imprimirDados() {
		System.out.println("\n\t\tDados do produto: \nCor: "+cor+"\nTamanho: "+tamanho+"\nMaterial: "+material+"\nMarca: "+marca+"\nValor: R$"+valor);
	}
}
