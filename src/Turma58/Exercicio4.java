package Turma58;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		double numero, raiz, elevado;
		
		System.out.println("\nDigite um número qualquer: ");
		numero = leia.nextFloat();
		
		if(numero % 2 == 0) {
			System.out.printf("\nEste número é par ");
			numero = Math.sqrt(2);
			System.out.println("\nE sua raíz quadrada é: "+numero);
		}else {
			System.out.printf("\nEste número é ímpar ");
			numero = Math.pow(numero, 2);
			System.out.println("\nE sua elevação ao quadrado é: "+numero);
		}
		
	}

}
