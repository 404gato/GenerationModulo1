package POO;

public class Cavalo extends Animal {
	
	//atributos
	private String porte;
	private String tipo;
	private String cor;
	
	//construtor
		public Cavalo(String nome, int idade, String porte, String tipo,String cor)
		{
			super(nome, idade);
			this.porte = porte;
			this.tipo = tipo;
			this.cor = cor;
		}
		
	//métodos
		
		public void status()
		{
			System.out.println("\n\t\tCAVALO");
			System.out.println("\nNome: "+this.getNome());
			System.out.println("Idade: "+this.getIdade()+" ano(s)");
			System.out.println("Porte: "+porte);
			System.out.println("Tipo: "+tipo);
			System.out.println("Cor: "+cor);
		}

		//getters and setters
		public String getPorte() {
			return porte;
		}

		public String getTipo() {
			return tipo;
		}

		public String getCor() {
			return cor;
		}

		public void setPorte(String porte) {
			this.porte = porte;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}
		
		//sobreposição
		@Override
		public void som() 
		{
			System.out.println("Som: Relinchado");	
		}
		
		@Override
		public void locomover()
		{
			System.out.println("Corre");
		}

		@Override
		public void alimentacao() 
		{
			System.out.println("Alimentação: Grama e feno");
		}
		
		
}
