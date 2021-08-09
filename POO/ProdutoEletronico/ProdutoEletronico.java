package POO;

public class ProdutoEletronico {
	
	
		//atributos
		private String tipo;
		private String marca;
		private String modelo;
		private double tamanho;
		private String cor;
		private boolean recarregavel;
		private int carga;
		
		//status
		
		public void status()
		{
			if(this.recarregavel==true)
			{
			System.out.println("Tipo do aparelho: "+this.tipo);
			System.out.println("Marca: "+this.marca);
			System.out.println("Modelo: "+this.modelo);
			System.out.println("Tamanho: "+this.tamanho+"cm");
			System.out.println("Cor: "+this.cor);
			System.out.println("Carga atual: "+this.carga+"%");
			}
			else
			{
				System.out.println("Tipo do aparelho: "+this.tipo);
				System.out.println("Marca: "+this.marca);
				System.out.println("Modelo: "+this.modelo);
				System.out.println("Tamanho: "+this.tamanho);
				System.out.println("Cor: "+this.cor);
			}
			
		}
		
		//métodos
		public void liga()
		{
			System.out.println("\nSeu aparelho está ligado...\n");
		}
		
		public void desliga()
		{
			System.out.println("\nSeu aparelho está desligado.\n");
		}
		
		
		public void recarregar()
		{
			if(this.recarregavel == true)
				System.out.println("\nCarregando...");
			else
				System.out.println("\nEsse aparelho não é recarregavel, conecte à uma tomada ou usb");
		}
		
		public void rec ()
		{
			this.recarregavel = true;
		}
		
		public void naoRec()
		{
			this.recarregavel = false;
		}
		
		
		//getters and setters
		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public double getTamanho() {
			return tamanho;
		}

		public void setTamanho(double tamanho) {
			this.tamanho = tamanho;
		}

		public String getCor() {
			return cor;
		}

		public void setCor(String cor) {
			this.cor = cor;
		}

		public boolean isRecarregavel() {
			return recarregavel;
		}

		public void setRecarregavel(boolean recarregavel) {
			this.recarregavel = recarregavel;
		}

		public int getCarga() {
			return carga;
		}

		public void setCarga(int c) {
			this.carga = c;
		}
		
		
		
		
		
		
	
	

}
