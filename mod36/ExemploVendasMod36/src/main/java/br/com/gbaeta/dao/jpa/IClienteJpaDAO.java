/**
 * 
 */
package br.com.gbaeta.dao.jpa;

import br.com.gbaeta.dao.generic.jpa.IGenericJapDAO;
import br.com.gbaeta.domain.jpa.Persistente;

/**
 * @author GuilhermeBaeta
 *
 */
public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
