package POO;

public class ObjAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao("Boeing", "Gol", "Branco e laranja", 30);
		
		a1.decola();
		a1.status();
		a1.pousa();
		
		Aviao a2 = new Aviao("Airbus", "Avianca Brasil", "Branco e vermelho", 30);
		a2.decola();
		a2.status();
		a2.pousa();

	}

}
