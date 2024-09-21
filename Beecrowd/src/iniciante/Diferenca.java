package iniciante;

import java.io.IOException;
import java.util.Scanner;

public class Diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Integer A = sc.nextInt();
		Integer B = sc.nextInt();
		Integer C = sc.nextInt();
		Integer D = sc.nextInt();
	
		Integer Diferenca = (A * B - C * D);

		System.out.print("DIFERENCA = " + Diferenca);

		sc.close();
	}

}
