package iniciante;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String vertebrado = sc.nextLine();

		String grupo = sc.nextLine();

		String dieta = sc.nextLine();
		
		if (vertebrado.equals("vertebrado") && grupo.equals("ave")) {
			if (dieta.equals("carnivoro")) {
				System.out.println("aguia");
			} else if (dieta.equals("onivoro")) {
				System.out.println("pomba");
			}
		} else if (vertebrado.equals("vertebrado") && grupo.equals("mamifero")) {
			if (dieta.equals("herbivoro")) {
				System.out.println("vaca");
			} else if (dieta.equals("onivoro")) {
				System.out.println("homem");
			}
		} else if (vertebrado.equals("invertebrado") && grupo.equals("inseto")) {
			if (dieta.equals("hematofago")) {
				System.out.println("pulga");
			} else if (dieta.equals("herbivoro")) {
				System.out.println("lagarta");
			}
		} else if (vertebrado.equals("invertebrado") && grupo.equals("anelideo")) {
			if (dieta.equals("hematofago")) {
				System.out.println("sanguessuga");
			} else if (dieta.equals("onivoro")) {
				System.out.println("minhoca");
			}
		}
		
		sc.close();

	}

}
