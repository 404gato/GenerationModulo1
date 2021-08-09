package POO;

public class Patinete {
	
	//atributos
	private int rodas;
	private String cor;
	private String modelo;
	private String faixaEtaria;
	private boolean manobra;
	private boolean motor;
	
	//métodos
	public void vrum()
	{
		this.motor = true;
	}
	public void bi()
	{
		this.motor = false;
	}
	
	public void status()
	{
		if(this.motor = true)
		{ 
			System.out.println("\nVocê adquiriu um patinete com "+this.rodas+" rodas, na cor "+this.cor+" e modelo "+this.modelo);
			System.out.println("Faixa escolhida foi "+this.faixaEtaria+"\nProduto motorizado");
		}
		else
		{
			System.out.println("Você adquiriu um patinete com "+this.rodas+" rodas, na cor "+this.cor+" e modelo "+this.modelo);
			System.out.println("Faixa escolhida: "+this.faixaEtaria+"\nProduto não motorizado");
		}
		  
	}
	

	public void anda()
		{
		System.out.println("\nwee!");
		}
	
	public boolean manobra()
	{
		if (this.faixaEtaria.equals("Profissional"))
			this.manobra = true;
		
		else if (this.faixaEtaria.equals("Infantil"))
			this.manobra = false;
		
		return manobra;

	}
	
	//setters and getters
	public int getRodas() {
		return rodas;
	}
	public void setRodas(int rodas) {
		this.rodas = rodas;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getFaixaEtaria() {
		return faixaEtaria;
	}
	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}
	public boolean isManobra() {
		return manobra;
	}
	public void setManobra(boolean manobra) {
		this.manobra = manobra;
	}

	public boolean isMotor() {
		return motor;
	}
	public void setMotor(boolean motor) {
		this.motor = motor;
	}
	
	

}
