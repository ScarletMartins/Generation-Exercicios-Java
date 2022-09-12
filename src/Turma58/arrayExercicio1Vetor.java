package Turma58;

import java.util.Scanner;

public class arrayExercicio1Vetor {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int A[] = {1, 0, 5, -2, -5, 7};
		int x, somaP;
		
		somaP = A[0] + A[1] + A[5];
		System.out.println("\nA soma dos valores nas posições A[0], A[1] e A[5] é: "+somaP);
		
		A[4] = 100;
		
		System.out.println("\nValores do vetor A: \n"+A[0]+" \n"+A[1]+"\n"+A[2]+"\n"+A[3]+"\n"+A[4]+"\n"+A[5]);
		
	}
}
