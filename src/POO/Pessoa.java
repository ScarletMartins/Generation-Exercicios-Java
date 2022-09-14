package POO;

public class Pessoa {

	private String nome;
	private String endereço;
	private String CPF;
	private int telefone;
	private int idade;
	
	public Pessoa(String nome, String endereco, String CPF, int telefone, int idade) {
		
		this.setNome(nome);
		this.setEndereco(endereco);
		this.setCPF(CPF);
		this.setTelefone(telefone);
		this.setIdade(idade);
		
	}
	
	public void validarCPF() {
		if(getCPF().length()!=11) {
			System.out.println("\nCPF Inválido. Insira um documento com 11 digitos!");
		}else {
			System.out.println("\nCPF validado!!");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereço;
	}

	public void setEndereco(String endereço) {
		this.endereço = endereço;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
