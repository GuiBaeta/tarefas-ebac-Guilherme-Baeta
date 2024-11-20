package com.gbaeta.service;

import java.util.List;

import javax.inject.Inject;

import com.gbaeta.dao.IProdutoDAO;
import com.gbaeta.domain.Produto;
import com.gbaeta.service.generic.GenericService;

public class ProdutoService extends GenericService<Produto, String> implements IProdutoService {

	private IProdutoDAO produtoDao;

	@Inject
	public ProdutoService(IProdutoDAO produtoDao) {
		super(produtoDao);
		this.produtoDao = produtoDao;
	}

	@Override
	public List<Produto> filtrarProdutos(String query) {
		return produtoDao.filtrarProdutos(query);
	}

}
