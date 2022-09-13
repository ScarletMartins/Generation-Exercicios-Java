package POO;

public class AutomovelTeste {

	public static void main(String[] args) {
		// instanciar a classe automovel
		
		Automovel auto1 = new Automovel("\nRoberta Ribeiro","Mini Cooper","DEV2022",2022);
		Automovel auto2 = new Automovel("\nCamilla Villares","Porsche","CAM2022",2022);

		
		auto1.imprimirInfo();
		System.out.println("\n*****************Tranferencia de proprietaria*****************");
		auto1.setNomeProprietario("\nCecília");
		auto1.imprimirInfo();
		
		auto2.setPlaca("CAM2E22");
		auto2.imprimirInfo();
	}

}
