package main;


import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> nomes = new LinkedList<>();
		
		System.out.println("Digite a lista de nomes separando os nomes por virgula:");
		String coleta = sc.nextLine();		
		
		String[] nomesSeparados = coleta.split(", ");
		for (String nome : nomesSeparados) {
			nomes.add(nome);
		}
		
		Collections.sort(nomes);
		
		System.out.println(nomes);

		sc.close();
				
	}

}
