package iniciante;

import java.util.Scanner;

public class Consumo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		float Y = sc.nextFloat();
		
		float consumo = X/Y ;
		
		System.out.println(String.format("%.3f", consumo) + " km/l");
		
		sc.close();

	}

}
