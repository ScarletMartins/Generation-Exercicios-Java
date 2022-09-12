package Turma58;

import java.util.Scanner;

public class arrayExercicio4Matriz {

	public static void main(String[] args) {

		
		Scanner leia = new Scanner(System.in);
		
		float[][] valoresM1 = new float[2][2];
		float[][] valoresM2 = new float[2][2];
		float[][] valoresM3 = new float[valoresM1.length][valoresM1.length];
		
		int x, linha, coluna, op, somaM, subtM;
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite um número real para preenchimento da primeira matriz: ");
				valoresM1[linha][coluna] = leia.nextFloat();
			}
		}
		
		for(linha=0;linha<2;linha++) {
			for(coluna=0;coluna<2;coluna++) {
				System.out.println("\nDigite um número real para preenchimento da segunda matriz: ");
				valoresM2[linha][coluna] = leia.nextFloat();
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
			for(linha=0; linha < valoresM3.length; linha++) {
				for(coluna=0; coluna < valoresM3.length; coluna++) {
					valoresM3[linha][coluna] = valoresM1[linha][coluna] + valoresM2[linha][coluna];
					System.out.println("["+valoresM3[linha][coluna]+"]");
				}
			}
			break;
		
		case 2:
			for(linha=0; linha < valoresM3.length; linha++) {
				for(coluna=0; coluna < valoresM3.length; coluna++) {
					valoresM3[linha][coluna] = valoresM1[linha][coluna] - valoresM2[linha][coluna];
					System.out.println("\n["+valoresM3[linha][coluna]+"]");
				}
			}
			break;
			
		case 3:
			float c;
			System.out.println("\nDigite um número constante: ");
			c = leia.nextFloat();
			
			for(linha=0; linha < valoresM3.length; linha++) {
				for(coluna=0; coluna < valoresM3.length; coluna++) {
					System.out.println(valoresM3[linha][coluna] = valoresM1[linha][coluna] + c);
				}
			}

			for(linha=0; linha < valoresM3.length; linha++) {
				for(coluna=0; coluna <valoresM3.length; coluna++) {
					System.out.println(valoresM3[linha][coluna] = valoresM2[linha][coluna] + c);
				}
			}
			
			break;
			
		case 4:
			for(linha=0; linha < valoresM3.length; linha++) {
				for(coluna=0; coluna < valoresM3.length; coluna++) {
					System.out.println("\n["+valoresM1[linha][coluna]+"]");
					System.out.println("\n["+valoresM2[linha][coluna]+"]");
				}
			}
			break;
		}
	}
}
