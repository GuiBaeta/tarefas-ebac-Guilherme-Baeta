package br.com.gbaeta.dao;

import br.com.gbaeta.domain.Cliente;
import br.com.gbaeta.reflections.anotacao.cadastro.dao.generic.GenericDAO;

public class ClienteDAO extends GenericDAO<Cliente> implements IClienteDAO {

	public ClienteDAO() {
		super();
	}

	@Override
	public Class<Cliente> getTipoClasse() {
		return Cliente.class;
	}

	@Override
	public void atualiarDados(Cliente entity, Cliente entityCadastrado) {
		// TODO Auto-generated method stub
		
	}

	
	/*
	 * @Override public Boolean salvar(Cliente cliente) {
	 *  return true;
	 * }
	 * 
	 * @Override public Cliente buscarPorCPF(Long cpf) { 
	 * }
	 * 
	 * @Override public void excluir(Long cpf) { 
	 * }
	 * 
	 * @Override public void alterar(Cliente cliente) {
	 * }
	 */

	
}
