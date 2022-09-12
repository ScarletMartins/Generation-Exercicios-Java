package Turma58;

import java.util.Scanner;

public class arrayExercicio4Matriz {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		float[][] M1 = new float[2][2];
		float[][] M2 = new float[2][2];
		float[][] M3 = new float[2][2];
		
		int linha, coluna, op;
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite os valores da Matriz 1: ");
				M1[linha][coluna] = leia.nextFloat();
			}
		}
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite os valores da Matriz 2: ");
				M2[linha][coluna] = leia.nextFloat();
			}
		}
		
		System.out.println("\n\t\tMenu de opções: ");
		System.out.println("\n1- Somar as duas matrizes");
		System.out.println("\n2- Subtrair a primeira matriz da segunda");
		System.out.println("\n3- Adicionar uma constante as duas matrizes");
		System.out.println("\n4- Imprimir as matrizes");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			for(linha=0; linha < 2; linha++) {
				for(coluna=0; coluna < 2; coluna++) {
					M3[linha][coluna] = M1[linha][coluna] + M2[linha][coluna];
					System.out.println("\nSoma: ["+M3[linha][coluna]+"]");
				}
			}
			break;
		
		case 2:
			for(linha=0; linha < 2; linha++) {
				for(coluna=0; coluna < 2; coluna++) {
					M3[linha][coluna] = M2[linha][coluna] - M1[linha][coluna];
					System.out.println("\nDiferença: ["+M3[linha][coluna]+"]");
				}
			}
			break;
			
		case 3:
			float c;
			System.out.println("\nDigite um número constante: ");
			c = leia.nextFloat();
			
			for(linha=0; linha < 2; linha++) {
				for(coluna=0; coluna < 2; coluna++) {
					System.out.println(M3[linha][coluna] = M1[linha][coluna] + c);
				}
			}

			for(linha=0; linha < 2; linha++) {
				for(coluna=0; coluna < 2; coluna++) {
					System.out.println(M3[linha][coluna] = M2[linha][coluna] + c);
				}
			}
			
			break;
			
		case 4:
			for(linha=0; linha < 2; linha++) {
				for(coluna=0; coluna < 2; coluna++) {
					System.out.println("\n["+M1[linha][coluna]+"]");
					System.out.println("\n["+M2[linha][coluna]+"]");
				}
			}
			break;
			default:
				System.out.println("\nOpção inválida. Tente novamente!!");
		}
	}
}
