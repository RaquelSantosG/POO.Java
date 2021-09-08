package Poo_java;
/*
 * 2) Crie uma classe avião e apresente os atributos e métodos referentes 
 * esta classe, em seguida crie um objeto avião, defina as instancias deste objeto
 *  e apresente as informações deste objeto no console. 
 */
public class Aviao {
	
	private String nome,modelo,cor,anofab;
	private double qntdeassentos,velomax,pesomax;
	
	public Aviao(String nome,String modelo,String cor,String anofab, double qntdeassentos, double velomax, double pesomax) {
		this.nome = nome;
		this.modelo = modelo;
		this.cor = cor;
		this.anofab = anofab;
		this.qntdeassentos = qntdeassentos;
		this.velomax = velomax;
		this.pesomax = pesomax;
		
		
	}
     public void exibirAviao() {
    	 System.out.println("\nnome: "+this.nome+ "\nmodelo: "+this.modelo+ "cor: "
     +this.cor+ "anofab: "+this.anofab+ "qntdeassentos: "+this.qntdeassentos+ "velomax: "
    			 +this.velomax+ "pesomax: "+this.pesomax);
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
	public String getAnofab() {
		return anofab;
	}
	public void setAnofab(String anofab) {
		this.anofab = anofab;
	}
	public double getQntdeassentos() {
		return qntdeassentos;
	}
	public void setQntdeassentos(double qntdeassentos) {
		this.qntdeassentos = qntdeassentos;
	}
	public double getVelomax() {
		return velomax;
	}
	public void setVelomax(double velomax) {
		this.velomax = velomax;
	}
	public double getPesomax() {
		return pesomax;
	}
	public void setPesomax(double pesomax) {
		this.pesomax = pesomax;
	}
     
     
}
