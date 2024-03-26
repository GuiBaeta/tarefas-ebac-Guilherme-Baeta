package main;

public class CalculoMedia {

	private float prova1;
	private float prova2;
	private float prova3;
	private float prova4;
	private float soma;
	private float media;
	
	public CalculoMedia(float prova1, float prova2, float prova3, float prova4) {
		this.prova1 = prova1;
		this.prova2 = prova2;
		this.prova3 = prova3;
		this.prova4 = prova4;
		
	}
	
	public float getProva1() {
		return prova1;
	}
	public void setProva1(float prova1) {
		this.prova1 = prova1;
	}
	public float getProva2() {
		return prova2;
	}
	public void setProva2(float prova2) {
		this.prova2 = prova2;
	}
	public float getProva3() {
		return prova3;
	}
	public void setProva3(float prova3) {
		this.prova3 = prova3;
	}
	public float getProva4() {
		return prova4;
	}
	public void setProva4(float prova4) {
		this.prova4 = prova4;
	}

	public float getSoma() {
		return soma;
	}

	public void setSoma(float soma) {
		this.soma = soma;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
	
	public void calculoSoma() {
		this.soma = prova1 + prova2 + prova3 + prova4;
	}
	
	public void calculoMedia() {
		this.media = soma / 4;
	}
	
	/*
	public void imprimirMedia() {
		System.out.println("A média das notas é: " + media);
	}
	*/
	
}
