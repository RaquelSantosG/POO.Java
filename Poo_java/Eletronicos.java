package Poo_java;

/*
 * 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.
 */
public class Eletronicos {
	
	private String nome,modelo,cor;
	
	public Eletronicos (String nome,String modelo,String cor) {
	
	
	this.nome = nome;
	this.modelo = modelo;
	this.cor = cor;
	
	}
	public void exibirEletronicos() {
		System.out.println("\nnome: "+this.nome+ "modelo: "+this.modelo+ "cor: "+this.cor);
		
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}

	

}
