/**
 * 
 */
package br.com.gabaeta.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author GuilhermeBaeta
 */
@Entity
@Table(name = "TB_CARRO")
public class Carro {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "carro_seq")
	@SequenceGenerator(name = "carro_seq", sequenceName = "sq_carro", initialValue = 1, allocationSize = 1)
	private Long id;

	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;

	@Column(name = "NOME", length = 10, nullable = false)
	private String nome;

	@Column(name = "CATEGORIA", length = 1000, nullable = false)
	private String categoria;

	@Column(name = "MOTOR", length = 1000, nullable = false)
	private String motor;

	@Column(name = "POTENCIA", length = 1000, nullable = false)
	private Integer potencia;

	@ManyToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "TB_CARRO_ACESSORIO", joinColumns = { @JoinColumn(name = "id_carro_fk") }, inverseJoinColumns = {
			@JoinColumn(name = "id_acessorio_fk") })
	private List<Acessorio> acessorios;

	@ManyToOne
	@JoinColumn(name = "id_marca_fk", foreignKey = @ForeignKey(name = "fk_marca_carro"), referencedColumnName = "id", nullable = false)
	private Marca marca;

	public Carro() {
		this.acessorios = new ArrayList<Acessorio>();
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

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public Integer getPotencia() {
		return potencia;
	}

	public void setPotencia(Integer potencia) {
		this.potencia = potencia;
	}

	public List<Acessorio> getAcessorios() {
		return acessorios;
	}

	public void setAcessorios(List<Acessorio> acessorios) {
		this.acessorios = acessorios;
	}

	public void add(Acessorio acessorio) {
		this.acessorios.add(acessorio);
		acessorio.getCarros().add(this);
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	@Override
	public int hashCode() {
		return Objects.hash(acessorios, categoria, codigo, id, marca, motor, nome, potencia);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Carro other = (Carro) obj;
		return Objects.equals(acessorios, other.acessorios) && Objects.equals(categoria, other.categoria)
				&& Objects.equals(codigo, other.codigo) && Objects.equals(id, other.id)
				&& Objects.equals(marca, other.marca) && Objects.equals(motor, other.motor)
				&& Objects.equals(nome, other.nome) && Objects.equals(potencia, other.potencia);
	}

}
