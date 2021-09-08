package Poo_java;
/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Cliente {
	
	private String Nome;
	private String Endereço;
	
	public Cliente(String n,String e)
	{
		this.Nome = n;
		this.Endereço = e; 
		
	}
	public void imprimirInfo()
	{
		System.out.println("\n"+this.Nome+" possui um "+this.Endereço);
		
    
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getEndereço() {
		return Endereço;
	}
	public void setEndereço(String endereço) {
		Endereço = endereço;
	}
	
}

