package testes;

import service.ClienteService;

import org.junit.Assert;
import org.junit.Test;

import mocks.ClienteDaoMock;

public class ClienteServiceTest {

	@Test
	public void salvarTest() {
		ClienteDaoMock mockDao = new ClienteDaoMock();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarTest() {
		ClienteDaoMock mockDao = new ClienteDaoMock();
		ClienteService service = new ClienteService(mockDao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso", retorno);
	}
}
