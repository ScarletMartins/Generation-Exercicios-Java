package Turma58;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		
		
		int numeros,contPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite o número: ");
		numeros = leia.nextInt();
		
		while(numeros != -99) {
			if(numeros%2==0) {
				contPar++;
			}else {
				contImpar++;
			}
			System.out.println("\nDigite o número: ");
			numeros = leia.nextInt();
		}
		
		System.out.println("\nNós temos: "+contPar+" números pares");
		System.out.println("\nNós temos: "+contImpar+" números ímpares");

	}
}
