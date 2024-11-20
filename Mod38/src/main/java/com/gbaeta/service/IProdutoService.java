package com.gbaeta.service;

import java.util.List;

import com.gbaeta.domain.Produto;
import com.gbaeta.service.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
