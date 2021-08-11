package POO;

public abstract class Animal {
	
	//atributos
	private String nome;
	private int idade;

	//construtor
	public Animal(String nome, int idade)
	{
		this.nome = nome;
		this.idade = idade;
	}
	
	//métodos gerais
	
	public abstract void locomover();
	public abstract void alimentacao();
	public abstract void som();
	
	
	
	
	
	
	
	//getters and setters
	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	
	
	
	
	
}
