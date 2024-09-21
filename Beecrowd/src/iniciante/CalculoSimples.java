package iniciante;

import java.util.Scanner;

public class CalculoSimples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int cod1 = sc.nextInt();
		int numeroPeças1 = sc.nextInt();
		double preçoPeça1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int numeroPeças2 = sc.nextInt();
		double preçoPeça2 = sc.nextDouble();
		
		double valorTotal = (numeroPeças1 * preçoPeça1) + (numeroPeças2 * preçoPeça2);
		
		System.out.println("VALOR A PAGAR: R$ " + String.format("%.2f", valorTotal));
		
		sc.close();

	}

}
