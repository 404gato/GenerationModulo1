package POO;

public class ObjAviao {

	public static void main(String[] args) {
		
		Aviao a1 = new Aviao("Boeing", "Gol", "Branco e laranja", 30);
		
		
		a1.status();
		System.out.println(a1.checar(7));
		
		Aviao a2 = new Aviao("Airbus", "Avianca Brasil", "Branco e vermelho", 30);

		a2.status();
		System.out.println(a2.checar(15));

	}

}
