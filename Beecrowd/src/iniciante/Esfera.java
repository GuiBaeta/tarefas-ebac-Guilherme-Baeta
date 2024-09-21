package iniciante;

import java.util.Scanner;

public class Esfera {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double r = sc.nextDouble();
		
		double volume = (double) (4/3.0) * 3.14159 * (r*r*r);
		
		System.out.println("VOLUME = " + String.format("%.3f", volume));
		
		
		sc.close();

	}

}
