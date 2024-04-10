package main;

import Interfaces.FabricaDeCarro;
import Interfaces.Picape;
import Interfaces.Suv;

public class Programa {

	public static void main(String[] args) {
		System.out.println("**** Carro com fonte Eletrica ****");
		FabricaDeCarro fabrica = new MotorEletrico();
		Picape picape = fabrica.criarPicape();
		Suv suv = fabrica.criarSuv();
		picape.exibirInfoPicape();
		System.out.println();
		suv.exibirInfoSuv();
		System.out.println();
		
		System.out.println("**** Carro com fonte Combustão ****");
		fabrica = new MotorCombustao();
		picape = fabrica.criarPicape();
		suv = fabrica.criarSuv();
		picape.exibirInfoPicape();
		System.out.println();
		suv.exibirInfoSuv();
		System.out.println();

	}

}
