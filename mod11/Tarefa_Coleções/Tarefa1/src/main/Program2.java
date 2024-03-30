package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		LinkedList<String> pessoas = new LinkedList<>();
		LinkedList<Pessoas> pessoasMasculinas = new LinkedList<>();
		LinkedList<Pessoas> pessoasFemininas = new LinkedList<>();
		
		System.out.println("Digite a lista de nomes separando os nomes por virgula e após cada nome coloca - e a letra M ou F para informar o genero:");
		String coleta = sc.nextLine();		
		
		String[] pessoasSeparados = coleta.split(", ");
		
		//Separando as pessoas 
		for (String pessoa : pessoasSeparados) {
			pessoas.add(pessoa);
		}
		
		//Separando por genero
		for (String pessoa : pessoas) {
			String[] partes = pessoa.split(" - ");
			String nome = partes[0];
			String genero = partes[1];
			
			Pessoas p = new Pessoas(nome, genero);
			if (genero.equals("M")) {
				pessoasMasculinas.add(p);
			} else if (genero.equals("F")) {
				pessoasFemininas.add(p);
			}
			
		}
		
		System.out.println("Pessoas do Genero Masculino:");	
		System.out.println(pessoasMasculinas);
		
		System.out.println("Pessoas do Genero Feminino:");
		System.out.println(pessoasFemininas);
		
		//Collections.sort(pessoasMasculinas);
		
	/*
		
		for (Pessoas pessoa : pessoasMasculinas) {
		System.out.println(pessoa.getNome());
		}

		
		System.out.println("Pessoas do Genero Feminino:");
		for (Pessoas pessoa : pessoasFemininas) {
			System.out.println(pessoa.getNome());
		}
	*/
		sc.close();
				
	}


}
