package Turma58;

import java.util.Scanner;

public class IntroJava {

	public static void main(String[] args) {
		
		double n1,n2,n3,media;
		int op;
		
		//Scanner - funciona como o Leia - é classe de uma biblioteca
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEntre com a primeira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nEntre com a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nEntre com a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		System.out.println("\nMedia aritmetica: " + media);
		System.out.printf("\nMedia aritmetica: %.2f", media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAluna aprovada!!");
		}else if(media>=5 && media<7) {
			System.out.println("\nAluna em exame!!");
		}else {
			System.out.println("\nAluna reprovada!!");
		}
		
		System.out.println("\n\t\tMenu de incentivos");
		System.out.println("\n1- Voce vai aprender!!");
		System.out.println("\n2- Já deu certo!!");
		System.out.println("\n3- Vai dar bom!!");
		System.out.println("\n4- Com dedicação voce vai além!!");
		System.out.println("\nDigite sua opção: ");
		op = leia.nextInt();
		
		switch(op) {
		case 1:
			System.out.println("\nVoce vai aprender!!");
			break;
		case 2:
			System.out.println("\nJá deu certo!!");
			break;
		case 3:
			System.out.println("\nVai dar bom!!");
			break;
		case 4:
			System.out.println("\nCom dedicação voce vai além!!");
			break;
		default:
			System.out.println("\nOpção Inválida");
		}
		
		// n1 = Math.sqrt(n2); - sqrt calcula raiz quadrada
		// n2 = Math.pow(n3, 4); - pow calcula potencia (numero q quero, potencia)
		
	}

}
