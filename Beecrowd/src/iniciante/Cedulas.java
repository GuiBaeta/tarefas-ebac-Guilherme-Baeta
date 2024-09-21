package iniciante;

import java.util.Scanner;

public class Cedulas {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		
		int notas100 = valor / 100;
		int resto100 = valor % 100;
		
		int notas50 = resto100 / 50;
		int resto50 = resto100 % 50;
		
		int notas20 = resto50 / 20;
		int resto20 = resto50 % 20;
		
		int notas10 = resto20 / 10;
		int resto10 = resto20 % 10;
		
		int notas5 = resto10 / 5;
		int resto5 = resto10 % 5;
		
		int notas2 = resto5 / 2;
		int resto2 = resto5 % 2;
		
		int notas1 = resto2 / 1;
		
		System.out.println(valor);
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		System.out.println(notas1 + " nota(s) de R$ 1,00");
				
		sc.close();		

	}

}
