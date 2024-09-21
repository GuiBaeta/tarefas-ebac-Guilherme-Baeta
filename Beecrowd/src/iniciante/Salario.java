package iniciante;

import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Integer NFuncionario = sc.nextInt();
		Integer HTrabalhadas = sc.nextInt();
		Float VRecebido = sc.nextFloat();
	
		Float Salary = (Float) (HTrabalhadas * VRecebido);

		System.out.println("NUMBER = " + NFuncionario);
		System.out.printf("SALARY = U$ %.2f\n", Salary);

		sc.close();
	}
	

}
