/**
 * 
 */
package br.com.gbaeta.dao.jpa;

import br.com.gbaeta.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.gbaeta.domain.jpa.ProdutoJpa;

/**
 * @author GuilhermeBaeta
 *
 */
public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
