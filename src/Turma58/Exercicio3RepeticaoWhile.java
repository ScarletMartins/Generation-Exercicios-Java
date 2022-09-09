package Turma58;

import java.util.Scanner;

public class Exercicio3RepeticaoWhile {
	
	/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.*/

	public static void main(String[] args) {
		
		int idades,totalMenor=0,totalMaior=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite sua idade: ");
		idades = leia.nextInt();
		
		while(idades != -99) {
			if(idades < 21) {
				totalMenor++;
			}else if(idades > 50) {
				totalMaior++;
			}
			System.out.println("\nDigite sua idade: ");
			idades = leia.nextInt();
		}
		
		System.out.println("\nTotal de pessoas com menos de 21 anos: "+totalMenor+ ". \nTotal de pessoas com mais de 50 anos: "+totalMaior+".");

	}

}
