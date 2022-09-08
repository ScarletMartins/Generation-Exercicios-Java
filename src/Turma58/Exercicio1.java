package Turma58;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int n1,n2,n3;

		System.out.println("\nDigite o primeiro número: ");
		n1 = leia.nextInt();
		System.out.println("\nDigite o segundo número: ");
		n2 = leia.nextInt();
		System.out.println("\nDigite o terceiro número: ");
		n3 = leia.nextInt();
		
		
		if(n1 >= n2 && n1 >= n3) {
			System.out.println("\nO maior número dentre os números digitados é: "+n1);
		}else if(n2 >= n1 && n2 >= n3) {
			System.out.println("\nO maior número dentre os números digitados é: "+n2);
		}else {
			System.out.println("\nO maior número dentre os números digitados é: "+n3);
		}	
		
	}
}
