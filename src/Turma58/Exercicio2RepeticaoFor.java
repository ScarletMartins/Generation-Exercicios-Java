package Turma58;

import java.util.Scanner;

public class Exercicio2RepeticaoFor {

	public static void main(String[] args) {
		
		//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares.
		
		float numeros, x;
		int contPar=0,contImpar=0;
		
		Scanner leia = new Scanner(System.in);
			
		for(x=1;x<=10;x++) {
			System.out.println("\nDigite um número: ");
			numeros = leia.nextFloat();
			if(numeros%2==0){
				contPar++;
			}else {
				contImpar++;
			}
		}
		System.out.println("\nForam digitados "+contPar+" números pares e "+contImpar+" números ímpares");

	}

}
