package com.gbaeta.dao;

import java.util.List;

import com.gbaeta.dao.generic.IGenericDAO;
import com.gbaeta.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
