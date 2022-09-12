package Turma58;

import java.util.Scanner;

public class arrayExercicio2Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] numero = new int[6];
		int nP = 0,somaPar=0,nI,qI=0,x;
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite um número: ");
			numero[x] = leia.nextInt();
			
			if(numero[x]%2==0) {
				somaPar += numero[x];
				System.out.println("\nNúmero par digitado: "+numero[x]);
			}else {
				qI++;
				System.out.println("\nNúmero ímpar digitado: "+numero[x]);
			}
		}

		//System.out.println("\nNúmeros pares digitados: "+);
		System.out.println("\nSoma dos números pares digitados: "+somaPar);
		//System.out.println("\nNúmeros ímpares digitados: "+);
		System.out.println("\nQuantidade dos números ímpares digitados: "+qI);
	}

}
