package POO;

public class Aviao {
	
	//atributos
	private String fabricante;
	private String modelo;
	private String companhia;
	private String cor;
	private String tipo;
	private int assentos;
	
	//métodos
	public String checar(int ocupados)
	{
		if(ocupados >= this.assentos)
		return "ASSENTOS OCUPADOS";	
	
		else
		return (this.assentos - ocupados) + " assentos restantes";
	}
	
	
	
	//construtor
	public Aviao(String fab, String comp, String cor, int asnt)
	{
		this.fabricante = fab;
		this.companhia = comp;
		this.cor = cor;
		this.assentos = asnt;
		
	}
	
	
	//getters and setters
	public String getFabricante() {
		return fabricante;
	}
	public void setFabricante(String fab) {
		this.fabricante = fab;
	}
	public String getCompanhia() {
		return companhia;
	}
	public void setCompanhia(String comp) {
		this.companhia = comp;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTipo() {
		return tipo;
	}


	public int getAssentos() {
		return assentos;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
		
	
	

	
	//status
	public void status()
	{
		System.out.println("\tEspecificações\n");
		System.out.println("Nome do fabricante: "+this.fabricante);
		System.out.println("Nome da companhia aerea: "+this.companhia);
		System.out.println("Cor do avião: "+this.cor);
		System.out.println("Número de assentos: "+this.assentos);
		
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
