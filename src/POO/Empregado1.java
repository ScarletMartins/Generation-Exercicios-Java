package POO;

public class Empregado1 extends Pessoa{

	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public Empregado1(String nome, String endereco, String CPF, int telefone, int idade, int codigoSetor, float salarioBase, float imposto) {
		super(nome,endereco,CPF,telefone,idade);
		
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
		
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}
	
	public void imprimirDados() {
		System.out.println("\nNome do empregado: "+getNome()+"\nCPF: "+getCPF()+"\nIdade: "+getIdade()
		+"\nEndereço: "+getEndereco()+"\nTelefone: "+getTelefone()+"\nCódigo do setor: "+codigoSetor+
		"\nSalario Base: "+salarioBase+"\nValor do imposto a ser retido: "+imposto);
	}
	
	public void calcularSalario() {
		double salarioTotal = salarioBase - (salarioBase * (imposto / 100));
		System.out.println("\nO salário total a ser recebido pelo empregado - "+getNome()+" é igual a: "+salarioTotal);
	}
}
