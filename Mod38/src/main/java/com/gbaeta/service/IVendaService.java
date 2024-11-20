package com.gbaeta.service;

import com.gbaeta.dao.generic.IGenericDAO;
import com.gbaeta.domain.Venda;

public interface IVendaService extends IGenericDAO<Venda, Long> {

	public void finalizarVenda(Venda venda);

	public void cancelarVenda(Venda venda);

	public Venda consultarComCollection(Long id);

}
