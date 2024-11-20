package com.gbaeta.service;

import java.util.List;

import javax.inject.Inject;

import com.gbaeta.dao.IClienteDAO;
import com.gbaeta.domain.Cliente;
import com.gbaeta.exceptions.DAOException;
import com.gbaeta.exceptions.MaisDeUmRegistroException;
import com.gbaeta.exceptions.TableException;
import com.gbaeta.service.generic.GenericService;

public class ClienteService extends GenericService<Cliente, Long> implements IClienteService {

	private IClienteDAO clienteDAO;

	@Inject
	public ClienteService(IClienteDAO clienteDAO) {
		super(clienteDAO);
		this.clienteDAO = clienteDAO;
	}

	@Override
	public Cliente buscarPorCPF(Long cpf) throws DAOException {
		try {
			return this.dao.consultar(cpf);
		} catch (MaisDeUmRegistroException | TableException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Cliente> filtrarClientes(String query) {
		return clienteDAO.filtrarClientes(query);
	}

}
