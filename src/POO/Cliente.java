package POO;

public class Cliente {
	
	private String nomeCliente;
	private String emailCliente;
	private String sexoCliente;
	private int cpfCliente;
	
	public Cliente(String nomeCliente, String emailCliente, String sexoCliente, int cpfCliente) {
		
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.sexoCliente = sexoCliente;
		this.cpfCliente	= cpfCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSexoCliente() {
		return sexoCliente;
	}

	public void setSexoCliente(String sexoCliente) {
		this.sexoCliente = sexoCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}
	
	public void imprimirDados() {
		System.out.println("\n\t\tDados do cliente \n\n Nome: "+nomeCliente+" \n E-mail: "+emailCliente+" \n Sexo: "+sexoCliente+" \n CPF: "+cpfCliente);
	}
}
