package main;

import java.util.Date;

public class Pessoa_Juridica extends Pessoa{

	private Long CNPJ;
	private String NomeFantasia;
	private Date DataFundacao;
	private String DestricaoDeAtividades;
	private String Endereco;
	
	public Long getCNPJ() {
		return CNPJ;
	}
	public void setCNPJ(Long cNPJ) {
		CNPJ = cNPJ;
	}
	public String getNomeFantasia() {
		return NomeFantasia;
	}
	public void setNomeFantasia(String nomeFantasia) {
		NomeFantasia = nomeFantasia;
	}
	public Date getDataFundacao() {
		return DataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		DataFundacao = dataFundacao;
	}
	public String getDestricaoDeAtividades() {
		return DestricaoDeAtividades;
	}
	public void setDestricaoDeAtividades(String destricaoDeAtividades) {
		DestricaoDeAtividades = destricaoDeAtividades;
	}
	public String getEndereco() {
		return Endereco;
	}
	public void setEndereco(String endereco) {
		Endereco = endereco;
	}
	@Override
	public String toString() {
		return "Pessoa Juridica CNPJ:" + CNPJ + ", Nome Fantasia:" + NomeFantasia + ", Data Fundação:" + DataFundacao
				+ ", Destricao De Atividades:" + DestricaoDeAtividades + ", Endereço:" + Endereco + "]";
	}
	
}
