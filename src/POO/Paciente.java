package POO;

public class Paciente {

	private String nome;
	private String quadro;
	private String sexo;
	private int idade;
	
	public Paciente(String nome, String quadro, String sexo, int idade) {
		
		this.nome = nome;
		this.quadro = quadro;
		this.sexo = sexo;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuadro() {
		return quadro;
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void imprimirDados() {
		System.out.println("\n\t\tDados do paciente \nNome: "+nome+"\nQuadro clínico: "+quadro+"\nSexo: "+sexo+"\nIdade: "+idade+"anos");
	}
}
