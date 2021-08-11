package POO;

import java.util.Scanner;

public class Cachorro extends Animal 
{
	Scanner read = new Scanner(System.in);
	
	//atributos
	private String raca;
	private String porte;
	private String cor;
	
	//construtor
	public Cachorro(String nome, int idade, String raca, String porte, String cor)
	{
		super(nome, idade);
		this.raca = raca;
		this.porte = porte;
		this.cor = cor;
	}
	


	//métodos
	public void status()
	{
		System.out.println("\n\t\tCACHORRO");
		System.out.println("\nNome: "+this.getNome());
		System.out.println("Idade: "+this.getIdade()+" ano(s)");
		System.out.println("Raça: "+raca);
		System.out.println("Porte: "+porte);
		System.out.println("Cor: "+cor);
	}
	
		
	//getters and setters

		public String getRaca() {
			return raca;
		}

		public String getPorte() {
			return porte;
		}

		public String getCor() {
			return cor;
		}

		public void setRaca(String raca) {
			this.raca = raca;
		}

		public void setPorte(String porte) {
			this.porte = porte;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}


	

//sobreposição
		
		@Override
		public void som() 
		{
			System.out.println("Som: Latido");	
		}
		
		@Override
		public void locomover()
		{
			System.out.println("Corre");
		}

		@Override
		public void alimentacao() 
		{
			System.out.println("Alimentação: Ração");
		}
		
	/*	@Override
		public void imprimir()
		{
			System.out.println("Digite o nome do cachorro");
			this.setNome = read.nextLine();
		} */



	
	
}
