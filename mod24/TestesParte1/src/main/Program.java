package main;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Informação para escrever no consoler: Guilherme-M, Cristina-F, Rafael-M, Cristiane-F
		
		//Solicitar as informações ao usuario
		System.out.println("Digite a lista de nomes separando os nomes por virgula e após cada nome coloca - e a letra M ou F para informar o genero:");
		String coleta = sc.nextLine();
		
		//Chamando o metodo de conversão String para Lista
		List<Pessoa> listaPessoas = convertStringToList(coleta);

		//Mostrar na tela a lista de pessoas
		System.out.println("Nome de todas as pessoas: ");
		listaPessoas.forEach(pessoa -> System.out.println(pessoa.getNome()));
		System.out.println("");
		
		//Mostrar na tela a lista de homens
		System.out.println("Nome somente das mulheres:");
		List<Pessoa> mulheres = onlyWomen(listaPessoas);
		mulheres.forEach(pessoa -> System.out.println(pessoa.getNome()));
		System.out.println("");
		
		//Mostrar na tela a lista de homens
		System.out.println("Nome somente dos homens:");
		List<Pessoa> homens = onlyMen(listaPessoas);
		homens.forEach(pessoa -> System.out.println(pessoa.getNome()));
		System.out.println("");
		
		sc.close();

	}

	//Método para transformar a String em uma lista de pessoas
	public static List<Pessoa> convertStringToList(String coleta) {
		String[] pessoasSeparadas = coleta.split(", ");
		return Arrays.stream(pessoasSeparadas)
		.map(pessoaSeparada -> {
			String[] parte = pessoaSeparada.split("-");
			String nome = parte[0];
			String genero = parte[1];
			return new Pessoa(nome, genero);					
		}).collect(Collectors.toList());
	}
	
	//Método para criar uma lista nova apenas com as Mulheres
	public static List<Pessoa> onlyWomen(List<Pessoa> listaPessoas){
		return listaPessoas.stream()
				.filter(pessoa -> pessoa
						.getGenero().equals("F"))
				.collect(Collectors.toList());
	}
	
	//Método para criar uma lista nova apenas com os Homens
	public static List<Pessoa> onlyMen(List<Pessoa> listaPessoas){
		return listaPessoas.stream()
				.filter(pessoa -> pessoa
						.getGenero().equals("M"))
				.collect(Collectors.toList());
	}

}
