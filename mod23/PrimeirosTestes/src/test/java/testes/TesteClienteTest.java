package testes;

import org.junit.Assert;
import org.junit.Test;


import main.TesteCliente;

public class TesteClienteTest {
	
	@Test
	public void testeClasseCliente() {
		TesteCliente cli = new TesteCliente();
		cli.adicionarNome("Guilherme");
			
		Assert.assertEquals("Guilherme", cli.getNome());
		
	}

}

