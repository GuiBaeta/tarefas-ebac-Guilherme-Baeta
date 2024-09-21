package iniciante;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		
		double triangulo = (double) (A*C) /2;

		double circulo = (double) 3.14159 * (C * C);
		
		double trapezio = (double) ((A+B) * C) / 2;
		
		double quadrado = (double) B * B;
		
		double retangulo = (double) A * B;

		System.out.println("TRIANGULO: " + String.format("%.3f", triangulo));
		System.out.println("CIRCULO: " + String.format("%.3f", circulo));
		System.out.println("TRAPEZIO: " + String.format("%.3f", trapezio));
		System.out.println("QUADRADO: " + String.format("%.3f", quadrado));
		System.out.println("RETANGULO: " + String.format("%.3f", retangulo));


		sc.close();

	}

}
