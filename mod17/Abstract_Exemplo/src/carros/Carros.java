package carros;

public abstract class Carros {
	
	private String marca;
	
	private String cor;
	
	private String tipo;
	
	private String modelo;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Carros [marca=" + marca + ", cor=" + cor + ", tipo=" + tipo + ", modelo=" + modelo + "]";
	}

}
