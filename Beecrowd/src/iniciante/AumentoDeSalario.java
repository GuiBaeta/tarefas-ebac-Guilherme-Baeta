package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class AumentoDeSalario {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		float salario = sc.nextFloat();
		float novoSalario;
		float ajuste;
		int porcentagem;
		
		if (salario <= 400.00) {
			novoSalario = salario * 1.15f;
			porcentagem = 15;
		} else if (salario > 400.00 && salario <= 800.0) {
			novoSalario = salario * 1.12f;
			porcentagem = 12;
		} else if (salario > 800.00 && salario <= 1200.0) {
			novoSalario = salario * 1.10f;
			porcentagem = 10;
		} else if (salario > 1200.00 && salario <= 2000.0) {
			novoSalario = salario * 1.07f;
			porcentagem = 7;
		} else {
			novoSalario = salario * 1.04f;
			porcentagem = 4;
		}
		
		ajuste = novoSalario - salario;
		
		System.out.printf("Novo salario: %.2f%n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f%n", ajuste);
		System.out.println(("Em percentual: " + porcentagem + " %"));
			
		
		sc.close();
	}

}
