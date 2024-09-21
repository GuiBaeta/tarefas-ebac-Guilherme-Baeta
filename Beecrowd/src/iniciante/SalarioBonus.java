package iniciante;

import java.util.Scanner;

public class SalarioBonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome = sc.nextLine();
		double salarioF = sc.nextFloat();
		double vendas = sc.nextFloat();
		double bonus = vendas * 0.15;
		double total = salarioF + bonus;
		
 
        System.out.println("TOTAL = R$ " + String.format("%.2f", total));
		sc.close();
	}
	
}
