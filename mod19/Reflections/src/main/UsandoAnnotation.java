package main;

/*import java.lang.reflect.Field;
import java.lang.reflect.Method;*/


@Itabela("Tabela Exercicio")
public class UsandoAnnotation {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
	
	System.out.println("Usando Reflections");
	
	Class<Game> classe = Game.class;
	// Game meuGame = new Game("Red Dead Redemption 2", 2018, 249.99f);
	
	/*
	 * for (Field field : meuGame.getClass().getDeclaredFields()) {
	 * 
	 * if (field.isAnnotationPresent(Itabela.class)) { Object objectValue =
	 * field.get(meuGame);
	 * 
	 * if (objectValue instanceof String stringValue) {
	 * System.out.println(stringValue.toUpperCase());
	 * System.out.println(objectValue.getClass()); } } }
	 */
	
	if (classe.isAnnotationPresent(Itabela.class)) {
		Itabela itabelaAnnotation = classe.getAnnotation(Itabela.class);
		
		String valor = itabelaAnnotation.value();
		
		System.out.println("Valor da anotação: " + valor);
	} else {
		System.out.println("A classe não possui a anotação @Itabela.");
	}
	
	
	
	}
}
