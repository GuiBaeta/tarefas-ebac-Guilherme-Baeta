package main;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
			
		System.out.println("Digite o valor da primeira prova:");
		float nota1 = scanner.nextFloat();
		System.out.println("Digite o valor da segunda prova:");
		float nota2 = scanner.nextFloat();
		System.out.println("Digite o valor da terceira prova:");
		float nota3 = scanner.nextFloat();
		System.out.println("Digite o valor da quarta prova:");
		float nota4 = scanner.nextFloat();
		
		CalculoMedia media = new CalculoMedia(nota1, nota2, nota3, nota4);
		media.calculoSoma();
		media.calculoMedia();
		
		ValidacaoNota validacao = new ValidacaoNota();
		float mediaValidacao = media.getMedia();
		
		System.out.println(validacao.validacao(mediaValidacao));
		
		scanner.close();

	}

}
