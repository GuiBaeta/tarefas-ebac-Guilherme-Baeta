package iniciante;

import java.util.Scanner;

public class TempoDeJogo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int tempo;
		
		if (fim <= inicio) {
			tempo = 24 - inicio;
			tempo = tempo + fim;
			System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		} else {
			tempo = fim - inicio;
			System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
		}
		
		sc.close();
	}

}
