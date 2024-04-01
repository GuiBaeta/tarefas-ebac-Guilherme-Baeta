package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Programa1 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> pessoas = new ArrayList<>();
	ArrayList<Pessoas> pessoasMasculinas = new ArrayList<>();
	ArrayList<Pessoas> pessoasFemininas = new ArrayList<>();
	

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


	sc.close();
			

	}
}
