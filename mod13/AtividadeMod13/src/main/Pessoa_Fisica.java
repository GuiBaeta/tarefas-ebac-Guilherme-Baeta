package main;

import java.util.Date;

public class Pessoa_Fisica extends Pessoa{
	
	private Long CPF;
	private Date dataNascimento;
	private Character genero;
	private String naturalidade;
	private Integer Celular;
	
	
	public Long getCPF() {
		return CPF;
	}
	public void setCPF(Long cPF) {
		CPF = cPF;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public Character getGenero() {
		return genero;
	}
	public void setGenero(Character genero) {
		this.genero = genero;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public Integer getCelular() {
		return Celular;
	}
	public void setCelular(Integer celular) {
		Celular = celular;
	}
	@Override
	public String toString() {
		return "Pessoa Fisica: CPF:" + CPF + ", Data Nascimento:" + dataNascimento + ", Genero:" + genero
				+ ", Naturalidade:" + naturalidade + ", Celular:" + Celular + "]";
	}

}
