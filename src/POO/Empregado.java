package POO;

import java.text.NumberFormat;

public class Empregado {

	private String nome;
	private double salario;
	
	public Empregado(String nome, double salario) {
		
		this.setNome(nome);
		this.setSalario(salario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void aumentarSalario(double percentual) {
		salario *= 1 + percentual/100;
	}
	
	public String formatarMoeda() {
		NumberFormat  nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(2); //indica quantas casas terão depois da vírgula
		String formatoMoeda = nf.format(salario); //formatar o salario
		return formatoMoeda;
	}
	
	public void imprimir() {
		System.out.println("\n\n\t\tDados do empregado \nNome: "+nome+"\nSalario: "+this.formatarMoeda());
	}
}
