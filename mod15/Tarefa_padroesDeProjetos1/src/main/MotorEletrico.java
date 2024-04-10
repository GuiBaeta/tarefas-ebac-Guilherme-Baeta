package main;

import Interfaces.FabricaDeCarro;
import Interfaces.Picape;
import Interfaces.Suv;

public class MotorEletrico implements FabricaDeCarro{

	@Override
	public Picape criarPicape() {
		return new MaverickHybrid();
	}

	@Override
	public Suv criarSuv() {
		return new MustangMachE();
	}


}
