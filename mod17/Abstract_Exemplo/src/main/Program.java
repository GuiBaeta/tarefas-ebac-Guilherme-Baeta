package main;

import java.util.ArrayList;

import carros.Carros;
import carros.Fiat;
import carros.Ford;
import carros.Honda;

public class Program {
	public static void main(String[] args) {
	ArrayList<Carros> listCarros = new ArrayList<>();
	
	listCarros.add(new Ford("Ford", "Preto", "Picape", "Maverick"));
	listCarros.add(new Ford("Ford", "Verde", "Picape", "Maverick Hybrid"));
	listCarros.add(new Ford("Ford", "Vermelho", "Suv", "Mustang Mach-E"));
	listCarros.add(new Ford("Ford", "Vermelho", "Suv", "Bronco"));
	listCarros.add(new Honda("Honda", "Vermelho", "Picape", "Ridgeline"));
	listCarros.add(new Honda("Honda", "Branco", "Suv", "Honda HR-V"));
	listCarros.add(new Fiat("Fiat", "Vermelho", "Picape", "TORO ENDURANCE"));
	listCarros.add(new Fiat("Fiat", "Prata Bari", "Suv", "Pulse"));
	
	
	System.out.println(listCarros);
	
	
	}
	
}
