/**
 * 
 */
package br.com.gabaeta.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 * @author GuilhermeBaeta
 */

@Entity
@Table(name = "TB_ACESSORIO")
public class Acessorio {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="acessorio_seq")
	@SequenceGenerator(name="acessorio_seq", sequenceName="sq_acessorio", initialValue = 1, allocationSize = 1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "NOME", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "DESCRICAO", length = 100, nullable = false)
	private String descricao;
	
	@ManyToMany(mappedBy = "acessorios")
	private List<Carro> carros;
	
	public Acessorio() {
		this.carros = new ArrayList<Carro>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Carro> getCarros() {
		return carros;
	}

	public void setCarros(List<Carro> carros) {
		this.carros = carros;
	}
	
	public void add(Carro carro) {
		this.carros.add(carro);
	}

	@Override
	public int hashCode() {
		return Objects.hash(carros, codigo, descricao, id, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Acessorio other = (Acessorio) obj;
		return Objects.equals(carros, other.carros) && Objects.equals(codigo, other.codigo)
				&& Objects.equals(descricao, other.descricao) && Objects.equals(id, other.id)
				&& Objects.equals(nome, other.nome);
	}
	
	

}
