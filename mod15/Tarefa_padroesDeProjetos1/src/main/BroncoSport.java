package main;

import Interfaces.Suv;

public class BroncoSport implements Suv {

	@Override
	public void exibirInfoSuv() {
		System.out.println("Modelo: Bronco, Potência: 253cv, Torque: 380Nm, Transmissão: Automática, Combustível: Gasolina, Reservatório: 64 Litros, Capacidade de Carga: 441Kg.");

	}

}
