package main;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Conversor conversor = new Conversor();
		
		System.out.println("Digite um valor do tipo Short:");
		conversor.setNumShort(scanner.nextShort());
		
		System.out.println("Digite um valor do tipo Float:");
		conversor.setNumFloat(scanner.nextFloat());
		
		System.out.println("Digite um valor do tipo Integer Wrapper");
		conversor.setNumIntegerWrapper(scanner.nextInt());
	
		System.out.println("Digite um valor do tipo Double Wrapper");
		conversor.setNumDoubleWrapper(scanner.nextDouble());
		
		conversor.CastExplicitoWrapper(conversor.getNumIntegerWrapper());
		conversor.CastImplicito(conversor.getNumShort());
		conversor.boxing(conversor.getNumFloat());
		conversor.Unboxing(conversor.getNumDoubleWrapper());
		conversor.Print();
		
		scanner.close();

	}

}
