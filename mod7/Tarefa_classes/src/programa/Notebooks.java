package programa;

public class Notebooks {
	
	private int codigo;
	private String processador;
	private int memoria;
	private String tipoArmazenamento;
	private int armazenamento;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getTipoArmazenamento() {
		return tipoArmazenamento;
	}
	public void setTipoArmazenamento(String tipoArmazenamento) {
		this.tipoArmazenamento = tipoArmazenamento;
	}
	public int getArmazenamento() {
		return armazenamento;
	}
	public void setArmazenamento(int armazenamento) {
		this.armazenamento = armazenamento;
	}
	
	/**
	 * Esse metodo imprime as informacoes do notebook em uma unica linha.
	 * 
	 * @author Guilherme Baeta
	 * @since version 1.0
	 * @version 1.0
	 * 
	 * @deprecated
	 * @see void programa.Notebooks.imprimirEspecificacoes()
	 */
	
	public void imprimir() {
		System.out.println(codigo + " " + processador + " " + memoria + " " + armazenamento + " " + tipoArmazenamento);
	}
	
	/**
	 * Esse metodo imprime as informacoes do notebook em 4 linhas, e informa a variavel antes de mostrar seu valor.
	 * 
	 * @author Guilherme Baeta
	 * @since version 2.0
	 * @version 1.2
	 *
	 */
	public void imprimirEspecificacoes() {
		System.out.println("ID: " + codigo);
		System.out.println("Processador: " + processador);
		System.out.println("Memoria: " + memoria + "GB");
		System.out.println("Armazenamento: " + tipoArmazenamento + " " + armazenamento + "GB");
	}
	
	
	
	

}
