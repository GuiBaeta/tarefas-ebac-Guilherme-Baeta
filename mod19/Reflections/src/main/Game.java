package main;

@Itabela("Tabela de jogos")
public class Game {

	@Itabela()
	String nome;
	int dataLancamento;
	float preco;
	
	public Game(String nome, int dataLancamento, float preco) {
		this.nome = nome;
		this.dataLancamento = dataLancamento;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(int dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	public void preco() {
		System.out.println(preco);
	}
		
	@Override
	public String toString() {
		return "Game [nome=" + nome + ", preco=" + preco + "]";
	}
	
	
}
