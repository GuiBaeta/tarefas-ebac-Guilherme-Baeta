package br.com.gabaeta.dao;

import br.com.gabaeta.domain.Carro;

public interface ICarroDao {
	
	public Carro cadastrar(Carro cadastrar);
	
	public Carro buscaPorCodigoCarro(String codigoCarro);


}
