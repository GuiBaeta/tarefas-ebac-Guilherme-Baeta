package br.com.gbaeta.services.generic.jpa;

import java.io.Serializable;
import java.util.Collection;

import br.com.gbaeta.dao.IPersistente;
import br.com.gbaeta.dao.generic.IGenericDAO;
import br.com.gbaeta.dao.generic.jpa.IGenericJapDAO;
import br.com.gbaeta.exception.DAOException;
import br.com.gbaeta.exception.MaisDeUmRegistroException;
import br.com.gbaeta.exception.TableException;
import br.com.gbaeta.exception.TipoChaveNaoEncontradaException;

public class GenericJpaService<T extends IPersistente, E extends Serializable> implements IGenericJpaService<T, E> {

	protected IGenericJapDAO<T, E> dao;

	public GenericJpaService(IGenericJapDAO<T, E> dao) {
		this.dao = dao;
	}

	@Override
	public T cadastrar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.cadastrar(entity);
	}

	@Override
	public void excluir(T entity) throws DAOException {
		this.dao.excluir(entity);
	}

	@Override
	public T alterar(T entity) throws TipoChaveNaoEncontradaException, DAOException {
		return this.dao.alterar(entity);
	}

	@Override
	public T consultar(E valor) throws MaisDeUmRegistroException, TableException, DAOException {
		return this.dao.consultar(valor);
	}

	@Override
	public Collection<T> buscarTodos() throws DAOException {
		return this.dao.buscarTodos();
	}

}
