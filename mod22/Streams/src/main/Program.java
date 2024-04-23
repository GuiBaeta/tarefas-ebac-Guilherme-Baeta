package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//String pessoas = "Guilherme-M, Cristina-F, Rafael-M, Cristiane-F";
		
		System.out.println("Digite a lista de nomes separando os nomes por virgula e após cada nome coloca - e a letra M ou F para informar o genero:");
		String coleta = sc.nextLine();
		
		String[] pessoasSeparadas = coleta.split(", ");
		
		
		List<Pessoa> listaPessoas = Arrays.stream(pessoasSeparadas)
				.map(pessoaSeparada -> {
					String[] parte = pessoaSeparada.split("-");
					String nome = parte[0];
					String genero = parte[1];
					return new Pessoa(nome, genero);					
				}).collect(Collectors.toList());

		System.out.println("Nome de todas as pessoas: ");
		listaPessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
		System.out.println("");
		
		System.out.println("Nome somente das mulheres:");
		listaPessoas.stream().filter(pessoa -> pessoa.getGenero().equals("F")).forEach(pessoa -> System.out.println(pessoa.getNome()));
		System.out.println("");
		
		System.out.println("Nome somente dos homens:");
		listaPessoas.stream().filter(pessoa -> pessoa.getGenero().equals("M")).forEach(pessoa -> System.out.println(pessoa.getNome()));
		
		
		sc.close();

	}


}
