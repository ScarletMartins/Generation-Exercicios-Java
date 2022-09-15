package POO;

public class BaseFigura {
	
	protected double lado1;
	protected double lado2;
	protected String nome;
	protected String nomeClasse; //apenas quem estiver na propria classe ou quem tiver extends pode puxar um dado protected
	
	
	BaseFigura(double lado1, double lado2, String nome){
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.nome = nome;
	}
	
	String getNomeClasse() {
		return nomeClasse;
	}
	
	public double getArea() {//getArea esta na interface
		return lado1 * lado2;
	}
	
	public double getPerimetro() {//getPerimetro esta na interface
		return (lado1+lado2) * 2.0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
}
