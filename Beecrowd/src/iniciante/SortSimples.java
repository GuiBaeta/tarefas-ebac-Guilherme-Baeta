package iniciante;

import java.util.Scanner;

public class SortSimples {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N1 = sc.nextInt();
		int N2 = sc.nextInt();
		int N3 = sc.nextInt();

		int menor = 0;
		int maior = 0;
		int meio = 0;
		
		if (N1 > N2 & N1 < N3) {
			menor = N2;
			maior = N3;
			meio = N1;
		} else if (N1 > N2 & N1 > N3) {
			if (N2 < N3) {
				menor = N2;
				maior = N1;
				meio = N3;
			} else {
				menor = N3;
				maior = N1;
				meio = N2;
			}
		} else if (N1 < N2 & N1 > N3) {
			menor = N3;
			maior = N2;
			meio = N1;
		} else if (N1 < N2 & N1 < N3) {
			if (N2 < N3) {
				menor = N1;
				maior = N3;
				meio = N2;
			} else {
				menor = N1;
				maior = N2;
				meio = N3;
			}
			
		}
		
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);

		System.out.println();
		System.out.println(N1);
		System.out.println(N2);
		System.out.println(N3);
		sc.close();
	}

}
