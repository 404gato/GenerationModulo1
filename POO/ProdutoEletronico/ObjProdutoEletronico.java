package POO;

public class ObjProdutoEletronico {

	public static void main(String[] args) {
		
		
		ProdutoEletronico celular = new ProdutoEletronico();
		
		celular.liga();
		
		celular.setTipo("Celular");
		celular.setMarca("Samsung");
		celular.setModelo("Galaxy M21S");
		celular.setTamanho(16);
		celular.setCor("Preto");
		celular.setCarga(20);
		celular.rec();
		celular.status();
		
		celular.recarregar();
		
		celular.desliga();
		
		
		ProdutoEletronico teclado = new ProdutoEletronico();
		
		teclado.setTipo("Teclado");
		teclado.setMarca("Hyperx");
		teclado.setModelo("Alloy Core RGB");
		teclado.setTamanho(44.3);
		teclado.setCor("Preto com LED");
		teclado.naoRec();
		
		teclado.status();
		
		teclado.recarregar();
		

	}

}
