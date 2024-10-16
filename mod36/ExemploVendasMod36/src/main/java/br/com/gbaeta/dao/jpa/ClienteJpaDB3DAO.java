/**
 * 
 */
package br.com.gbaeta.dao.jpa;

import br.com.gbaeta.dao.generic.jpa.GenericJpaDB3DAO;
import br.com.gbaeta.domain.jpa.ClienteJpa2;

/**
 * @author GuilhermeBaeta
 *
 */
public class ClienteJpaDB3DAO extends GenericJpaDB3DAO<ClienteJpa2, Long> implements IClienteJpaDAO<ClienteJpa2> {

	public ClienteJpaDB3DAO() {
		super(ClienteJpa2.class);
	}

}
