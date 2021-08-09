package POO;

public class ObjPatinete {
	
	public static void main(String arghs[]) {
		
		Patinete p1 = new Patinete();
		
		p1.setRodas(3);
		p1.setCor("vermelha");
		p1.setModelo("Master Frog");
		p1.setFaixaEtaria("Adulto");
		
		p1.bi();
		
		p1.status();
		
		p1.anda();
		
			Patinete p2 = new Patinete();
		
		p2.setRodas(2);
		p2.setCor("preta");
		p2.setModelo("Master Frog");
		p2.setFaixaEtaria("Profissional");
		
		p2.vrum();
		
		p2.status();
		
		p2.anda();
		
		
	}

}
