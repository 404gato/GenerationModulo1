package POO;

public class Preguica extends Animal{
	
	private String mf;
	private double peso;
	private String especie;
	
	//construtor
	public Preguica(String nome, int idade, String mf, double peso, String especie)
	{
		super(nome, idade);
		this.mf = mf;
		this.peso = peso;
		this.especie = especie;
	}
	
	//m�todos
	public void status()
	{
		System.out.println("\n\t\tPREGUI�A");
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade()+" ano(s)");
		System.out.println("Sexo: "+mf);
		System.out.println("Peso: "+peso+"kgs");
		System.out.println("Especie: "+especie);
	}
	
	
	//getters and setters
	public String getMf() {
		return mf;
	}

	public double getPeso() {
		return peso;
	}

	public String getEspecie() {
		return especie;
	}

	public void setMf(String mf) {
		this.mf = mf;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	//sobreposi��o
	@Override
	public void som() 
	{
		System.out.println("Som: Emite alta frequ�ncia quando amea�ado");	
	}
	
	@Override
	public void locomover()
	{
		System.out.println("Sobe em �rvore");
	}

	@Override
	public void alimentacao() 
	{
		System.out.println("Alimenta��o: Folhas");
	}
	
	

}
