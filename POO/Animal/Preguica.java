package POO;

public class Preguica extends Animal{
	
	private String mf;
	private int peso;
	private String especie;
	
	//construtor
	public Preguica(String nome, int idade, String som, String mf, int peso, String especie)
	{
		super(nome, idade, som);
		this.mf = mf;
		this.peso = peso;
		this.especie = especie;
	}
	
	//métodos
	public void status()
	{
		System.out.println("\n\t\tPREGUIÇA");
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade());
		System.out.println("Som: "+this.getSom());
		System.out.println("Sexo: "+mf);
		System.out.println("Peso: "+peso+"kgs");
		System.out.println("Especie: "+especie);
	}
	
	
	//getters and setters
	public String getMf() {
		return mf;
	}

	public int getPeso() {
		return peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	

}
