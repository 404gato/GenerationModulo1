package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro rot = new Cachorro("Luna", 1, "Rotweiller", "Grande", "Preto e castanho");
		
		rot.status();
		rot.som();
		rot.alimentacao();
		rot.locomover();
		
		Cavalo alasao = new Cavalo("Prince", 5, "Grande", "Doméstico", "Branco");
		
		alasao.status();
		alasao.som();
		alasao.alimentacao();
		alasao.locomover();
		
		Preguica din = new Preguica("Blue", 2, "Macho", 5.4, "Bradypus pygmaeus");
		
		din.status();
		din.som();
		din.alimentacao();
		din.locomover();
		
	
	}

}
