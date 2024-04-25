package service;

import dao.ClienteDao;
import dao.IClienteDao;

public class ClienteService {
	
	private IClienteDao clienteDao;
	
	public ClienteService(IClienteDao clienteDao) {
		//clienteDao = new ClienteDao();
		//clienteDao = new ClienteDaock();
		this.clienteDao = clienteDao;
	}
	
	public String salvar() {
		clienteDao.salvar();
		return "Sucesso";
	}

}
