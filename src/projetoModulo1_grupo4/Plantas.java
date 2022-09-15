package projetoModulo1_grupo4;

public class Plantas {
	
	private String especie;
	private String raiz;
	private String aspectoPlanta;
	private String clima;
	
	public Plantas(String especie, String raiz, String aspectoPlanta, String clima) {
		
		this.setEspecie(especie);
		this.setRaiz(raiz);
		this.setAspectoPlanta(aspectoPlanta);
		this.setClima(clima);
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getRaiz() {
		return raiz;
	}

	public void setRaiz(String raiz) {
		this.raiz = raiz;
	}

	public String getAspectoPlanta() {
		return aspectoPlanta;
	}

	public void setAspectoPlanta(String aspectoPlanta) {
		this.aspectoPlanta = aspectoPlanta;
	}

	public String getClima() {
		return clima;
	}

	public void setClima(String clima) {
		this.clima = clima;
	}

	
}
