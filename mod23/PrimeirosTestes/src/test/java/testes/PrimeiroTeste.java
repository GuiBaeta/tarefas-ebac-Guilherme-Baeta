package testes;

import org.junit.Assert;
import org.junit.Test;

public class PrimeiroTeste {

	@Test
	public void test() {
		String nome = "Guilherme";
		Assert.assertEquals("Guilherme", nome);
	}
	
	@Test
	public void testNoEquals() {
		String nome = "Guilherme";
		Assert.assertNotEquals("Guilherme1", nome);
	}
}
