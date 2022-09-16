package POO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
//import java.util.*; importa toda a biblioteca do JAVA - sem necessidade se nao for usar tudo, sobrecarrega/pesa o sistema

public class Colecoes {

	public static void main(String[] args) {
		
		List<Integer> minhaLista = new ArrayList<Integer>(); //criação do objeto instanciado ao tipo de clasee 
		
		System.out.println("\nLista de elementos\n");
		
		minhaLista.add(2);
		minhaLista.add(1);
		minhaLista.add(3);
		minhaLista.add(2);
		minhaLista.add(3);
		minhaLista.add(7);
		
		for(Integer listaElementos:minhaLista) {
			
			System.out.println(listaElementos);		
		}
		
		System.out.println("\nRemovendo elementos da lista");
		System.out.println(); //syso vazio limpa a memoria e continua a execução
		
		minhaLista.remove(0); //remove elemento da lista a partir do índice || os demais elementos se reposicionam
		
		for(Integer listaElementos:minhaLista) {
					
			System.out.println(listaElementos);		
		}
		
		int primeiroElemento = minhaLista.get(0); //o get(x) puxa um elemento a partir do seu índice
		
		System.out.println("\nO primeiro elemento da lista é: "+primeiroElemento);
		System.out.println();
		
		for(int i=0;i<minhaLista.size();i++) {
			System.out.println("\nElemento: "+minhaLista.get(i));
		}
		
		Collections.sort(minhaLista); //metódo sort ordena a lista em ordem crescente/alfabetica
		System.out.println("\nLista ordenada: "+minhaLista);
		System.out.println();
		
		Set<Integer> meuSet = new HashSet<Integer>();
		
		meuSet.add(5);
		meuSet.add(1);
		meuSet.add(3);
		meuSet.add(4);
		meuSet.add(2);
		meuSet.add(5);
		

		//Iterator - API que permite percorrer uma coleção de dados derivada de uma collection para gerenciar os elementos
		Iterator<Integer> iMeuSet = meuSet.iterator();
		
		while(iMeuSet.hasNext()) { //percorre o iMeuSet e verifica cada elemento para validar o fim da collection
			System.out.println(iMeuSet.next());
		}
		
	}

}
