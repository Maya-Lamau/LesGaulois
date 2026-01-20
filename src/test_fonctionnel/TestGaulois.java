package test_fonctionnel;

import personnages.*;

public class TestGaulois {
	
		
		public static void main(String[] args) {
			
			Gaulois asterix = new Gaulois("Astérix", 8);
			System.out.println(asterix.getNom());
			asterix.parler("Bonjour à tous");
			
			Romain minus = new Romain("Minus", 6);
			minus.parler(" UN GAU… UN GAUGAU…");
			
			
			asterix.frapper(minus);
			minus.frapper(asterix);
			asterix.frapper(minus);
			minus.frapper(asterix);
			asterix.frapper(minus);
			
		}

	

}
