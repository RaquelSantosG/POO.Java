package Poo_java;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente lista = new Cliente("Alexandre dos Santos","Endereço");
		
		lista.imprimirInfo();
		System.out.println("\n*****Transferência de dados****");
		lista.setNome("Sara Reis Guedes");
		
		Cliente lista2 = new Cliente("Lucas Robert","rua da Saudade 20");
		lista2.imprimirInfo();
		
		System.out.println("\n***mudaça de endereço***");
		
		lista2.setEndereço("rua japao 225");
		lista2.imprimirInfo();

		
		
		}
		
	}



 