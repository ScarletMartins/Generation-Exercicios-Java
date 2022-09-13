package POO;
//definição da classe Automovel
public class Automovel {
	
	//declaração dos atributos da classe
	
	private String nomeProprietario;
	private String modelo;
	private String placa;
	private int ano;
	
	//construtor: metodo especial que é definido para cada classe(quando n criado, é designado um padrao pelo proprio java)

	//construtor tem que ter o mesmo nome da classe
	public Automovel(String nomeProprietario, String modelo, String placa, int ano) {
		
		this.nomeProprietario = nomeProprietario;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		
	} 
	//declaracao dos demais metodos da classe
	//set - metodo modificador - modifica conteudo de atributo
	//get - metodo de acesso - pega o conteudo de um atributo

	public String getNomeProprietario() {
		return nomeProprietario;
	}

	public void setNomeProprietario(String nomeProprietario) {
		this.nomeProprietario = nomeProprietario;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void imprimirInfo() {
		System.out.println(nomeProprietario+" possui um veículo de modelo: "+modelo+" com placa: "+placa+" e ano: "+ano);
	}
}