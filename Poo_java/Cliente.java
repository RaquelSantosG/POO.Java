package Poo_java;
/*1) Crie uma classe cliente e apresente os atributos e m�todos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informa��es deste objeto no console.
 */
public class Cliente {
	
	private String Nome;
	private String Endere�o;
	
	public Cliente(String n,String e)
	{
		this.Nome = n;
		this.Endere�o = e; 
		
	}
	public void imprimirInfo()
	{
		System.out.println("\n"+this.Nome+" possui um "+this.Endere�o);
		
    
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndere�o() {
		return Endere�o;
	}
	public void setEndere�o(String endere�o) {
		Endere�o = endere�o;
	}
	
}

