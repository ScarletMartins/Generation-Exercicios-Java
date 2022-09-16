package POO;

import java.util.ArrayList;
import java.util.Scanner;

public class Colecoes2 {

	public static void main(String[] args) {
	
		int op;
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList(); //criando objeto do tipo ArrayList
		
		do {
			System.out.println("\n\t- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - \n");
			//System.out.println("\n\t\tMenu de opções do estoque: ");
			System.out.println("\n\t\tMenu de opções do estoque:  \n\n(1) Deseja adicionar produtos no estoque? \n(2) Deseja remover produtos do estoque? \n(3) Deseja atualizar produtos do estoque?"
					+ "\n(4) Deseja mostrar todos os produtos do estoque? \n(0) Deseja encerrar o programa? \n\nPor favor, digite sua opção: ");
			op = leia.nextInt();
			
			
			switch(op) {
			case 1:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja adicionar ao estoque: ");
				String produto =leia.nextLine(); //nextLine le valor do tipo String
				estoque.add(produto);
				System.out.println("\nProdutos disponíveis em estoque: "+estoque);
				break;
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto que deseja remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1)) { //valida se o produto1 está contido no estoque
					estoque.remove(produto1);
				} else {
					System.out.println("\nProduto indisponível no estoque!!");
				}
				System.out.println("\nProdutos disponíveis em estoque: "+estoque);
				break;
			case 3:
				leia.nextLine();
				System.out.println("\nDigite o produto que quer atualizar");
				String verifica = leia.nextLine();
				System.out.println("\nDigite o novo produto que substituirá o produto "+verifica+":");
				String novo = leia.nextLine();
				if(estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else {
					System.out.println("\nProduto indisponível no estoque!!");
				}
				System.out.println("\nProdutos disponíveis em estoque: "+estoque);
				break;
			case 4:
				leia.nextLine();
				System.out.println("\nProdutos disponíveis em estoque: "+estoque);
				break;
			case 0: 
				System.out.println("\nMuito obrigado pelo uso de nosso sistema de controle de estoque! :)");
				break;
				default:
					System.out.println("\nOpção inválida. Digite uma das opções abaixo:");
			}
			
		}
		while(op!=0);
	}

}
