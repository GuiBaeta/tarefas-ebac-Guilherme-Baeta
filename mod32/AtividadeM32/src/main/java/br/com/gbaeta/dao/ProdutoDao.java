/**
 * 
 */
package br.com.gbaeta.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.gbaeta.domain.Produto;

/**
 * @author GuilhermeBaeta
 */
public class ProdutoDao implements IProdutoDao{

	@Override
	public Produto cadastrar(Produto produto) {
		
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(produto);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return produto;
	}

	@Override
	public Produto buscarPorID(Long id) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		Produto produto = entityManager.find(Produto.class, id);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return produto;
	}
	
	@Override
	public void excluir(Produto produto) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		produto = entityManager.merge(produto);
		entityManager.remove(produto);
		entityManager.getTransaction().commit();
		
		entityManager.close();
		entityManagerFactory.close();
		
	}

	@Override
	public List<Produto> buscarTodos() {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("ExemploJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		CriteriaQuery<Produto> query = builder.createQuery(Produto.class);
		Root<Produto> root = query.from(Produto.class);
		query.select(root);
		
		TypedQuery<Produto> tpQuery = entityManager.createQuery(query);
		List<Produto> list = tpQuery.getResultList();
		
		entityManager.close();
		entityManagerFactory.close();
		
		return list;
	}

}
