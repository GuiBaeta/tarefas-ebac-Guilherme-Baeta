package iniciante;

import java.util.Scanner;

public class Lanche {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int codigo = sc.nextInt();
		int quantidade = sc.nextInt();
		double preco = 0;
		if (codigo == 1) {
			//Cachorro Quente
			preco = 4.00;
		} else if (codigo == 2) {
			//X-Salada
			preco = 4.50;
		} else if (codigo == 3) {
			//X-Bacon
			preco = 5.00;
		} else if (codigo == 4) {
			//Torradaa Simples
			preco = 2.00;
		} else if (codigo == 5) {
			//Refrigerante
			preco = 1.50;
		}
		double total = preco * quantidade;
		
		System.out.println("Total: R$ " + String.format("%.2f", total));
		
		sc.close();

	}

}
