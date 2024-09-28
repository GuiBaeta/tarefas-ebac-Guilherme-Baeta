/**
 * 
 */
package br.com.gabaeta.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.gabaeta.domain.Carro;

/**
 * @author GuilhermeBaeta
 */
public class CarroDao implements ICarroDao {

	@Override
	public Carro cadastrar(Carro carro) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(carro);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		
		
		return carro;
	}

	@Override
	public Carro buscaPorCodigoCarro(String codigoCarro) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		StringBuilder sb = new StringBuilder();
		sb.append("SELECT c FROM Carro c ");
		sb.append("WHERE c.codigo = :codigoCarro");

		entityManager.getTransaction().begin();
		TypedQuery<Carro> query = entityManager.createQuery(sb.toString(), Carro.class);
		query.setParameter("codigoCarro", codigoCarro);
		Carro carro = query.getSingleResult();

		entityManager.close();
		entityManagerFactory.close();

		return carro;
	}

}
