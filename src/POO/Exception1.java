package POO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	
	public static int quociente(int numerador, int denominador) throws ArithmeticException{//throws - verifica se é possível uma exceção ArithmeicException
		
		return numerador / denominador; //possibilita a divisão por zero	
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		boolean continueLoop = true; //tipo de dados booleanos: true or false
		
		do {
			
			//bloco que verifica as possibilidades de exceção que pode surgir no código
			//try tenta executar o bloco de códigos
			try {
				System.out.println("\nEntre com o numerador: ");
				int numerador = sc.nextInt();
				System.out.println("\nEntre com o denominador: ");
				int denominador = sc.nextInt();
				
				int resultado = quociente(numerador, denominador);
				
				System.out.printf("\nResultado: %d/%d = %d ",numerador,denominador,resultado);
				//%d dentro de printf referencia um número inteiro
				continueLoop = false;
				
				
				//caso tenha erro, o catch irá tratar
				}catch(InputMismatchException inputMismatchException) { //mostra a exception
					System.err.printf("\nException: %s\n",inputMismatchException);
					System.out.println("\nVoce deve entrar com um valor do tipo inteiro. Por favor, tente novamente!");
				}
				catch(ArithmeticException arithmeticException) {
					System.err.printf("\nException: %s\n", arithmeticException);
					System.out.println("\nZero é um denominador inválido. Por favor, tente novamente!");
				}
			
			
		}while(continueLoop);

	}

}
