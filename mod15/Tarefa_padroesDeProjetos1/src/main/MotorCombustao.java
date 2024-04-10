package main;

import Interfaces.FabricaDeCarro;
import Interfaces.Picape;
import Interfaces.Suv;

public class MotorCombustao implements FabricaDeCarro{

	@Override
	public Picape criarPicape() {
		return new Maverick();
	}

	@Override
	public Suv criarSuv() {
		return new BroncoSport();
	}

}
