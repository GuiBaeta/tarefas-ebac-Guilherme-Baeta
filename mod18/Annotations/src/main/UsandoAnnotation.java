package main;

@Tabela("Tabela Exercicio")
public class UsandoAnnotation {

	public static void main(String[] args) {
	
	@Tabela("Usando na variavel")
	String nome = "Exercicio de Annotation";

	System.out.println(nome);
	}

}
