package POO;

public interface Figuras {
	
	public String nomeInterface = "Figuras";
	
	abstract public String getNome();
	abstract public void setNome(String nome);
	public double getArea();
	public double getPerimetro();
	public double getDiagonal(); //se nao for definido o padrão é public

}
