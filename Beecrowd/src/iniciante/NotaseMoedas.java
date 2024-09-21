package iniciante;

import java.util.Scanner;

public class NotaseMoedas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double valor = sc.nextDouble();
		
		int notas100 = (int) valor / 100;
	
		int notas50 = (int) (valor % 100) / 50;
		
		int notas20 = (int) (valor % 100) % 50 / 20;		
		
		int notas10 = (int) (valor % 100) % 50 % 20 / 10;
		
		int notas5 = (int) (valor % 100) % 50 % 20 % 10 / 5;
		
		int resto5 = (int) (valor % 100) % 50 % 20 % 10 % 5;
		
		int notas2 = (int) (valor % 100) % 50 % 20 % 10 % 5 / 2;
		
		int moeda1 = (int) (valor % 100) % 50 % 20 % 10 % 5 % 2;
		
		int auxilio = (int) valor;
		
		double moedas = (valor - auxilio);
		
		int moedas100 = (int) (moedas * 100);
				
		int moedas50 = moedas100 / 50;
		
		int moedas25 = (moedas100 % 50) / 25;
		
		int moedas10 = (moedas100 % 50) % 25 / 10;
		
		int moedas05 = (moedas100 % 50) % 25 % 10 / 5;
		
		int moedas01 = (moedas100 % 50) % 25 % 10 % 5;
		
		System.out.println("NOTAS:");
		System.out.println(notas100 + " nota(s) de R$ 100.00");
		System.out.println(notas50 + " nota(s) de R$ 50.00");
		System.out.println(notas20 + " nota(s) de R$ 20.00");
		System.out.println(notas10 + " nota(s) de R$ 10.00");
		System.out.println(notas5 + " nota(s) de R$ 5.00");
		System.out.println(notas2 + " nota(s) de R$ 2.00");
		
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moedas50 + " moeda(s) de R$ 0.50");
		System.out.println(moedas25 + " moeda(s) de R$ 0.25");
		System.out.println(moedas10 + " moeda(s) de R$ 0.10");
		System.out.println(moedas05 + " moeda(s) de R$ 0.05");
		System.out.println(moedas01 + " moeda(s) de R$ 0.01");
		
	
		sc.close();

	}

}
