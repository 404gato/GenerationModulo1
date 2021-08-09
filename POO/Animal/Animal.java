package POO;

public class Animal {
	
	//atributos
	private String nome;
	private int idade;
	private String som;
	private boolean correr;

	//construtor
	public Animal(String nome, int idade, String som)
	{
		this.nome = nome;
		this.idade = idade;
		this.som = som;
	}
	
	//métodos gerais
	
	public void corra()
	{
		System.out.println("Este animal corre!");
	}
	
	public void sobe()
	{
		System.out.println("Este animal sobe em árvores");
	}
	
	
	
	//getters and setters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}
	
	public String getSom() {
		return som;
	}

	public boolean isCorrer() {
		return correr;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void setsom(String som) {
		this.som = som;
	}

	public void setCorrer(boolean correr) {
		this.correr = correr;
	}
	
	
	
	
	
}
