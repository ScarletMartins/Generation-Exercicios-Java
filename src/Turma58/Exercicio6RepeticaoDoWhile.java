package Turma58;

import java.util.Scanner;

public class Exercicio6RepeticaoDoWhile {

	public static void main(String[] args) {
		
		int numeros,contMult3=0,somaMult3=0;
		float media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com um número: ");
		numeros = leia.nextInt();
		
		do {
			
			if(numeros == 0) {
				System.out.println("\nSair do loop!!");
			}else {
				if(numeros%3 == 0) {
					somaMult3 += numeros;
					contMult3++;
				}
				System.out.println("\nEntre com um número: ");
				numeros = leia.nextInt();
			}
			
		}while(numeros != 0);
		
		if(contMult3 == 0) {
			System.out.println("\nNão é possível dividir um valor por zero!!");
		} else{
		media = somaMult3 / contMult3;
		System.out.printf("\nA média dos números múltiplos de 3 é: %.2f",media);
		}
	}

}
