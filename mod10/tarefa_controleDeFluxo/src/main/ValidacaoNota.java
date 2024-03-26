package main;

public class ValidacaoNota {
	
	public ValidacaoNota() {
		
	}
		
		
	
	public static String validacao(float media) {	
		if (media >= 7) {
			return "Sua nota é " + media + ". Parabéns, você foi aprovado!";
		} else if (media >= 5 && media < 7) {
			return"Sua nota é " + media + ". Quase lá, você está de recuperação!";
		} else {
			return"Sua nota é " + media + ". Você foi reprovado!";
		}
	}
	
}
