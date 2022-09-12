package Turma58;

import java.util.Scanner;

public class arrayExercicio3Matriz {

	public static void main(String[] args) {
		
		//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
		
		Scanner leia = new Scanner(System.in);
		
		int[][] numero = new int[3][3];
		int contNum=0, linha, coluna;
		
		for(linha=0;linha<3;linha++) {
			for(coluna=0;coluna<3;coluna++) {
				
				System.out.println("\nEntre com um número: ");
				numero[linha][coluna] = leia.nextInt();
				
				if(numero[linha][coluna]>10) {
					contNum++;
				}
				
			}
		}
		System.out.println("\nQuantidade de valores maiores que 10: "+contNum);
	}

}
