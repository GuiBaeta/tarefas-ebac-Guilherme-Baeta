package com.gbaeta.dao;

import java.util.List;

import com.gbaeta.dao.generic.IGenericDAO;
import com.gbaeta.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long> {

	List<Cliente> filtrarClientes(String query);

}
