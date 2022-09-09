package Turma58;

import java.util.Scanner;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		float n1,n2,n3,media,somaMedia=0,mediaGeral;
		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1;x<=3;x++) {
			
			System.out.println("\nDigite a primeira nota: ");
			n1 = leia.nextFloat();
			System.out.println("\nDigite a segunda nota: ");
			n2 = leia.nextFloat();
			System.out.println("\nDigite a terceira nota: ");
			n3 = leia.nextFloat();
			
			media=(n1+n2+n3) / 3;
			System.out.printf("\nMédia aritmética: %.2f",media);
			somaMedia += media;
			
		}
		mediaGeral = somaMedia / 3;
		System.out.printf("\nMédia geral: %.2f", mediaGeral);
		
	}

}
