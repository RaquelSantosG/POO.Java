package Poo_java;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente lista = new Cliente("Alexandre dos Santos","Endere�o");
		
		lista.imprimirInfo();
		System.out.println("\n*****Transfer�ncia de dados****");
		lista.setNome("Sara Reis Guedes");
		
		Cliente lista2 = new Cliente("Lucas Robert","rua da Saudade 20");
		lista2.imprimirInfo();
		
		System.out.println("\n***muda�a de endere�o***");
		
		lista2.setEndere�o("rua japao 225");
		lista2.imprimirInfo();

		
		
		}
		
	}



 