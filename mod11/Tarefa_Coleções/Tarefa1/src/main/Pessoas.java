package main;

import java.util.Comparator;
import java.util.List;
import java.util.Objects;

public class Pessoas {

	private String nome;
	private String genero;
	
	public Pessoas(String nome, String genero) {
		this.nome = nome;
		this.genero = genero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String toString() {
        return this.nome;
    }
	
	public int compareTo(Pessoas outraPessoa) {
		return this.nome.compareToIgnoreCase(outraPessoa.getNome());
	}
	
}
