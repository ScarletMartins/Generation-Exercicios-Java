package POO;

public class Funcionario {

	private String nomeFunc;
	private String cargo;
	private String setor;
	private String superior;
	private int salario;
	
	public Funcionario(String nomeFunc, String cargo, String setor, String superior, int salario) {
		
		this.nomeFunc = nomeFunc;
		this.cargo = cargo;
		this.setor = setor;
		this.superior = superior;
		this.salario = salario;
	}

	public String getNomeFunc() {
		return nomeFunc;
	}

	public void setNomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getSuperior() {
		return superior;
	}

	public void setSuperior(String superior) {
		this.superior = superior;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}
	
	public void imprimirDados() {
		System.out.println("\n\n\tDados do funcionário: \n\nNome: "+nomeFunc+"\nCargo: "+cargo+"\nSetor: "+setor+"\nSuperior: "+superior+"\nSalario: R$"+salario+",00");
	}
}
