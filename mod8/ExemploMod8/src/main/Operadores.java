package main;

public class Operadores {

	public static void main(String[] args) {
		operacoesAritmeticas();
		operacoesArtibuicoes();
		operacoesIncrimentoDecremento();
		operacoesRelacionais();
		operacoesLogicas();
		
	}	
	
	
	private static void operacoesLogicas() {
		System.out.println("*** OperacoesLogicas ***");
		int num1 = 6;
		int num2 = 12;
		
		boolean isAnd = num1 <= 10 && num2 <=10;
		boolean isOr = num1 <= 10 || num2 <=10;
		System.out.println("IsAnd: " + isAnd);
		System.out.println("IsOr: " + isOr);
		System.out.println("!IsAnd: " + !isAnd); //o ! inverte o valor
		System.out.println("!IsOr: " + !isOr); //o ! inverte o valor
	}


	private static void operacoesRelacionais() {
		System.out.println("*** OperacoesRelacionais ***");
		int num1 = 10;
		int num2 = 10;
		boolean isMaior = num1 > num2;
		boolean isMaiorIgual = num1 >= num2;
		boolean isMenor = num1 < num2;
		boolean isMenorIgual = num1 <= num2;
		boolean isIgual = num1 == num2;
		boolean isDiferente = num1 != num2;
		System.out.println("isMaior: " + isMaior);
		System.out.println("isMaiorIgual: " + isMaiorIgual);
		System.out.println("isMenor: " + isMenor);
		System.out.println("isMenorIgual: " + isMenorIgual);
		System.out.println("isIgual: " + isIgual);
		System.out.println("isDiferente: " + isDiferente);
		
	}


	private static void operacoesIncrimentoDecremento() {
		System.out.println("*** OperacoesIncrimentoDecremento ***");
		int num1 = 10;
		System.out.println(num1);
		num1++;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
	}


	private static void operacoesArtibuicoes() {
		System.out.println("*** OperacoesAtribuicoes ***");
		int numero1 = 10;
		int numero2 = 10;
		int numero3 = numero1 + numero2;
		System.out.println(numero3);
		numero3 += numero3;
		System.out.println(numero3);
		numero3 -= numero2;
		System.out.println(numero3);
		numero1 *= numero3;
		System.out.println(numero1);
		numero1 /= numero2;
		System.out.println(numero1);
		int numero4 = numero3 + 20;
		System.out.println(numero4);		
	}

	public static void operacoesAritmeticas() {
		System.out.println("*** OperacoesAritmeticas ***");
		int num1 = 10;
		int num2 = 20;
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 / num2;
		int num6 = num1 * num2;
		int num7 = (10 + 10)/2;
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		System.out.println(num6);
		System.out.println(num7);
	}

}
