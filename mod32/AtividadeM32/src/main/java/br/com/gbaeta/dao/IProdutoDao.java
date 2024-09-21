/**
 * 
 */
package br.com.gbaeta.dao;

import java.util.List;

import br.com.gbaeta.domain.Produto;


/**
 * @author GuilhermeBaeta
 */
public interface IProdutoDao {
	
	public Produto cadastrar (Produto produto);
	
	public Produto buscarPorID(Long id);
	
	public void excluir(Produto produto);
	
	public List<Produto> buscarTodos();

}
