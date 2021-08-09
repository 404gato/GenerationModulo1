package POO;

public class Aviao {
	
	//atributos
	private String fabricante;
	private String modelo;
	private String companhia;
	private String cor;
	private int assentos;
	
	
	//m�todos
	public void decola()
	{
		System.out.println("\nO avi�o est� decolando. Boa viagem!\n");
	}
	
	
	public void pousa()
	{
		System.out.println("\nO avi�o est� pousando na pista.");
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
	public int getNumAssento() {
		return assentos;
	}
	public void setNumAssento(int asnt) {
		this.assentos = asnt;
	}

	
	//status
	public void status()
	{
		System.out.println("\tEspecifica��es\n");
		System.out.println("Nome do fabricante: "+this.fabricante);
		System.out.println("Nome da companhia aerea: "+this.companhia);
		System.out.println("Cor do avi�o: "+this.cor);
		System.out.println("N�mero de assentos: "+this.assentos);
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
