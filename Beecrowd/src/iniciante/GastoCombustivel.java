package iniciante;

import java.util.Scanner;

public class GastoCombustivel {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int velocidade = sc.nextInt();
		
		double litros = (double) velocidade * tempo / 12;
		
		System.out.println(String.format("%.3f", litros));
		
		
		sc.close();

	}

}
