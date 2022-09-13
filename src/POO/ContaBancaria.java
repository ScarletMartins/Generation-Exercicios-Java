package POO;

public class ContaBancaria {

	private String tipoConta;
	private String proprietarioConta;
	private String banco;
	private int numConta;
	private int numAgencia;
	
	public ContaBancaria(String tipoConta, String proprietarioConta, String banco, int numConta, int numAgencia) {
		
		this.tipoConta = tipoConta;
		this.proprietarioConta = proprietarioConta;
		this.banco = banco;
		this.numConta = numConta;
		this.numAgencia = numAgencia;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public String getProprietarioConta() {
		return proprietarioConta;
	}

	public void setProprietarioConta(String proprietarioConta) {
		this.proprietarioConta = proprietarioConta;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public int getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(int numAgencia) {
		this.numAgencia = numAgencia;
	}
	
	public void imprimirDados() {
		System.out.println("\n\tDados da conta \nTipo de conta: "+tipoConta+"\nProprietario da conta: "+proprietarioConta+"\nBanco: "+banco+"\nNúmero da conta: "+numConta+"\nNúmero da agencia: "+numAgencia);
	}
}
