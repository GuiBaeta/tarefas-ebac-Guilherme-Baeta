package br.com.gbaeta;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import br.com.gbaeta.dao.IProdutoDao;
import br.com.gbaeta.dao.ProdutoDao;
import br.com.gbaeta.domain.Produto;

/**
 * @author GuilhermeBaeta
 */
public class ProdutoTest {

	private IProdutoDao produtoDao;
	
	public ProdutoTest() {
		produtoDao = new ProdutoDao();
	}

	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setNome("Xbox Serie S");
		produto.setDescricao("Xbox branco com 800gb");
		produto.setValor(2000.00);
		produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
		
		produtoDao.excluir(produto);
	}
	
	@Test
	public void excluir() {
        Produto produto = new Produto();
        produto.setNome("Xbox Serie S");
        produto.setDescricao("Xbox branco com 800gb");
        produto.setValor(2000.00);
        produtoDao.cadastrar(produto);  // Cadastra o produto para excluir
        Assert.assertNotNull(produto);
        
        produtoDao.excluir(produto);  // Exclui o produto
        
        Produto produtoExcluido = produtoDao.buscarPorID(produto.getId());
        assertNull(produtoExcluido);
	}
	
	@Test
	public void buscarTodos() {
	    // Cadastra dois produtos para verificar se eles aparecem na lista
	    Produto produto1 = new Produto();
	    produto1.setNome("Xbox Serie S");
        produto1.setDescricao("Xbox branco com 800gb");
        produto1.setValor(2000.00);
        produtoDao.cadastrar(produto1); 
	    
	    Produto produto2 = new Produto();
	    produto2.setNome("PlayStation 5");
	    produto2.setDescricao("Console Sony");
	    produto2.setValor(4500.00);
	    produtoDao.cadastrar(produto2);
	    
	    // Busca todos os produtos no banco de dados
	    List<Produto> produtos = produtoDao.buscarTodos();
	    
	    // Verifica se a lista contém pelo menos os dois produtos cadastrados
	    assertFalse(produtos.isEmpty());
	    Assert.assertTrue(produtos.size() >= 2);
	    Assert.assertTrue(produtos.contains(produto1));
	    Assert.assertTrue(produtos.contains(produto2));
	    
	    produtoDao.excluir(produto1);
	    produtoDao.excluir(produto2);
	    
	}


}
