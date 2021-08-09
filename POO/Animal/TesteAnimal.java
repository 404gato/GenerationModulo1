package POO;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro pit = new Cachorro("Fifi", 5, "Late", "Pitibull", "Médio", "Cinza");
		
		pit.status();
		pit.corra();
		
		Cavalo cav = new Cavalo("--", 4, "Relincha", "Grande", "Selvagem","Marrom");
		cav.status();
		cav.corra();
		
		Preguica preg = new Preguica("Mali", 1, "--", "Feminino", 3,"preguiça-real (Choloepus didactylus)");
		preg.status();
		preg.sobe();
				
	}

}
