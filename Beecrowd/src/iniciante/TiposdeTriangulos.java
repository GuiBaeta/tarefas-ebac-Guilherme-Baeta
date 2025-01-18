package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class TiposdeTriangulos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		float A = sc.nextFloat();
		float B = sc.nextFloat();
		float C = sc.nextFloat();
		
		float maior;
		//Verificar qual é maior
		if (C > A) {
			if (C > B) {
				maior = C;
				C = A;
				A = maior;
			} else {
				maior =  B;
				B = A;
				A = maior;
			}
		} else if (B > A) {
			maior = B;
			B =  A;
			A = maior;
		}
		
		if (A >= (B+C)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			
			float A2 = A * A;
			float B2C2 = ((B * B) + (C * C));
			
			if (A2 == B2C2) {
			
				System.out.println("TRIANGULO RETANGULO");
				
			} else if (A2 > B2C2) {
			
				System.out.println("TRIANGULO OBTUSANGULO");
			
			} else if (A2 < B2C2) {
			
				System.out.println("TRIANGULO ACUTANGULO");
			
			}
		}
			
		if (A == B && B == C) {
			System.out.println("TRIANGULO EQUILATERO");
		
		} else if (A == B || B == C || A == C) {
		
			System.out.println("TRIANGULO ISOSCELES");
		}
				
		sc.close();

	}
}