package main;

public class PrimeiraClasse {

	public static void main(String args[]) {
		System.out.println("Olá Guilherme");
		Cliente cliente = new Cliente();
		cliente.cadastrarEndereco("Rua 1");
		cliente.setCodigo(1);
		System.out.println(cliente.getCodigo());
		//cliente.imprimirEndereco();	
		String end = cliente.retornarNomeCliente();
		System.out.println(end);
		System.out.println(cliente.getValorTotal());
	}
}
