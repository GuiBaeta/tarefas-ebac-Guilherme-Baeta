package testes;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import main.Pessoa;
import main.Program;

public class PrimeiroTeste {

	//Testar a conversão de String para Lista
	@Test
	public void testConvertStringToList(){
		String coleta = "Guilherme-M, Cristina-F, Rafael-M, Cristiane-F";
		List<Pessoa> listaEsperada = Arrays.asList(
				new Pessoa("Guilherme", "M"),
				new Pessoa("Cristina", "F"),
				new Pessoa("Rafael", "M"),
				new Pessoa("Cristiane", "F")	
		);
		List<Pessoa> listaObtida = Program.convertStringToList(coleta);
		Assert.assertEquals(listaEsperada, listaObtida);
	}
	
	//Testar a filtragem de todas as mulheres
	@Test
	public void womanFilterTest() {
		List<Pessoa> listaPessoas = Arrays.asList(
				new Pessoa("Guilherme", "M"),
				new Pessoa("Cristina", "F"),
				new Pessoa("Rafael", "M"),
				new Pessoa("Cristiane", "F")
				);
		
		List<Pessoa> listaEsperada = Arrays.asList(
				new Pessoa("Cristina", "F"),
				new Pessoa("Cristiane", "F")
				);
		
		List<Pessoa> listaObtida = Program.onlyWomen(listaPessoas);
		Assert.assertEquals(listaEsperada, listaObtida);	
	}
	
	//Testar a filtragem de todos os homens
	@Test
	public void manFilterTest() {
		List<Pessoa> listaPessoas = Arrays.asList(
				new Pessoa("Guilherme", "M"),
				new Pessoa("Cristina", "F"),
				new Pessoa("Rafael", "M"),
				new Pessoa("Cristiane", "F")
				);
		
		List<Pessoa> listaEsperada = Arrays.asList(
				new Pessoa("Guilherme", "M"),
				new Pessoa("Rafael", "M")
				);
		
		List<Pessoa> listaObtida = Program.onlyMen(listaPessoas);
		Assert.assertEquals(listaEsperada, listaObtida);
		
	}
	
	
}
