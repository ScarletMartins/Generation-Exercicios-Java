package Turma58;

import java.util.Scanner;

public class arrayMatriz {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] numero = new int[2][3];
		int somaNum=0, linha, coluna, somaDiagonal=0;
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leia.nextInt();
				
				if(numero[linha][coluna]>0) {
					somaNum += numero[linha][coluna];
				}
				if(linha == coluna) {
					somaDiagonal += numero[linha][coluna];
				}
			}
		}
		
		System.out.println("\nSomatório dos números maiores que zero: " + somaNum);
		System.out.println("\nSomatório dos números diagonais: " + somaDiagonal);
	}

}
