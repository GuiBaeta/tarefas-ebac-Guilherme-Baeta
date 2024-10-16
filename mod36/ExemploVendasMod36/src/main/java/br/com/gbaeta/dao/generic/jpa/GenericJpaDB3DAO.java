/**
 * 
 */
package br.com.gbaeta.dao.generic.jpa;

import java.io.Serializable;

import br.com.gbaeta.domain.jpa.Persistente;

/**
 * @author GuilhermeBaeta
 *
 */
public abstract class GenericJpaDB3DAO <T extends Persistente, E extends Serializable>
	extends GenericJpaDAO<T,E> {

	public GenericJpaDB3DAO(Class<T> persistenteClass) {
		super(persistenteClass, "Mysql1");
	}

}
