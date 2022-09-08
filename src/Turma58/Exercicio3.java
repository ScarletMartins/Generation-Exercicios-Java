package Turma58;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
		 categoria ela se encontra:
			 10-14 infantil
			 15-17 juvenil
			 18-25 adulto */
		
		Scanner leia = new Scanner(System.in);
		
		int idade;
		
		System.out.println("\n\t\tClassificação de categorias");
		System.out.println("\nDigite a idade da pessoa: ");
		idade = leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("\nEsta pessoa pertence a categoria infantil");
		}else if(idade>=15 && idade<=17) {
			System.out.println("\nEsta pessoa pertence a categoria juvenil");
		}else if(idade>=18 && idade <=25){
			System.out.println("\nEsta pessoa pertence a categoria adulto");
		}else {
			System.out.println("\nEsta pessoa não pertence a nenhuma categoria");
		}
	}

}
