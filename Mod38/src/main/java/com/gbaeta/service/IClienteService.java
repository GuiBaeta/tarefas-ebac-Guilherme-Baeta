package com.gbaeta.service;

import java.util.List;

import com.gbaeta.domain.Cliente;
import com.gbaeta.exceptions.DAOException;
import com.gbaeta.service.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
