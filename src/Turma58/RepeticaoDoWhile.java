package Turma58;

import java.util.Scanner;

public class RepeticaoDoWhile {

	public static void main(String[] args) {
		
		float numeros,somaNumero=0,media;
		int contNumero=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numeros = leia.nextFloat();
		
		do {
			
			if(numeros==0) {
				System.out.println("\nSair do loop!");
			}else {
				if(numeros>0) {
					somaNumero += numeros;
					contNumero++;
				}
				System.out.println("\nEntre com um número: ");
				numeros = leia.nextFloat();
			}
			

		}while(numeros!=0);
		
		if(contNumero == 0) {
			System.out.println("\nNão é possível fazer divisão por zero!");
		}else {
			media = somaNumero/contNumero;
			System.out.printf("\nMédia dos números maiores que zero: %.2f ",media);
		}
	}
}
