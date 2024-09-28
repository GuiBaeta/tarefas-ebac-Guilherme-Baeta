/**
 * 
 */
package br.com.gbaeta;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import br.com.gabaeta.dao.AcessorioDao;
import br.com.gabaeta.dao.CarroDao;
import br.com.gabaeta.dao.IAcessorioDao;
import br.com.gabaeta.dao.ICarroDao;
import br.com.gabaeta.dao.IMarcaDao;
import br.com.gabaeta.dao.MarcaDao;
import br.com.gabaeta.domain.Acessorio;
import br.com.gabaeta.domain.Carro;
import br.com.gabaeta.domain.Marca;

/**
 * @author GuilhermeBaeta
 */

public class CarroTest {

	private ICarroDao carroDao;

	private IAcessorioDao acessorioDao;

	private IMarcaDao marcaDao;

	public CarroTest() {
		carroDao = new CarroDao();
		acessorioDao = new AcessorioDao();
		marcaDao = new MarcaDao();
	}

	@Test
	public void cadastrar() {
		Acessorio acessorio1 = criarAcessorio("A1", "Estribos", "Alta durabilidade e de cor preta");
		Acessorio acessorio2 = criarAcessorio("A2", "Capotas Rígidas", "Alumínio de alta resistência");
		Marca marca = criarMarca("M1", "Ford");

		assertNotNull(marca.getId());

		Carro carro1 = new Carro();
		carro1.setCodigo("C1");
		carro1.setNome("Maverick");
		carro1.setCategoria("Picape");
		carro1.setMotor("EcoBoost 2.0L");
		carro1.setPotencia(253);
		
		carro1.setMarca(marca); //Associando a marca
		
		carro1.add(acessorio1); // Associando acessórios ao carro
		carro1.add(acessorio2);

		carro1 = carroDao.cadastrar(carro1); // Cadastrar o carro

		assertNotNull(carro1.getId());
		assertTrue(carro1.getAcessorios().contains(acessorio1)); // Verificando associação Many-to-Many
		assertTrue(carro1.getAcessorios().contains(acessorio2));

		/*
		Carro carro2 = new Carro();
		carro2.setCodigo("C2");
		carro2.setNome("Ranger");
		carro2.setCategoria("Picape");
		carro2.setMotor("3.0 V6 Bi-turbo");
		carro2.setPotencia(397);
		carro2.setMarca(marca); //Associando a marca

		carro2.add(acessorio1); // Associando os mesmos acessórios ao carro2
		carro2.add(acessorio2);
		
		carro2 = carroDao.cadastrar(carro2); // Cadastrar o carro

		assertNotNull(carro2.getId());
		System.out.println(carro2.getAcessorios());
		assertTrue(carro2.getAcessorios().contains(acessorio1));
		assertTrue(carro2.getAcessorios().contains(acessorio2));
		*/

	}

	private Marca criarMarca(String codigo, String nome) {
		Marca marca = new Marca();
		marca.setCodigo(codigo);
		marca.setNome(nome);
		return marcaDao.cadastrar(marca);
	}

	private Acessorio criarAcessorio(String codigo, String nome, String descricao) {
		Acessorio acessorio = new Acessorio();
		acessorio.setCodigo(codigo);
		acessorio.setNome(nome);
		acessorio.setDescricao(descricao);

		return acessorio;
	}

}
