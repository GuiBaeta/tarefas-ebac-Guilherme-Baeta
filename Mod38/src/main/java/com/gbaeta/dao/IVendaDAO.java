package com.gbaeta.dao;

import com.gbaeta.dao.generic.IGenericDAO;
import com.gbaeta.domain.Venda;

public interface IVendaDAO extends IGenericDAO<Venda, Long> {

	void finalizarVenda(Venda venda);

	void cancelarVenda(Venda venda);

	Venda consultarComCollection(Long id);

}
