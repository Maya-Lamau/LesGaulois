package test_fonctionnel;

import personnages.*;
import sites.*;

public class TestGaulois {

	public static void main(String[] args) {

		Gaulois asterix = new Gaulois("Astérix", 5);
		System.out.println(asterix.getNom());

		Romain minus = new Romain("Minus", 6);

		Gaulois obelix = new Gaulois("Obélix", 15);
		Gaulois assurancetourix = new Gaulois("Assurancetourix", 2);
		Gaulois abraracourcix = new Gaulois("Abraracourcix", 5);
		Gaulois agecanonix = new Gaulois("Agecanonix", 1);

		Druide panoramix = new Druide("Panoramix", 2);
		panoramix.frabriquerPotion(3);
		panoramix.donnerPotion(asterix);
		panoramix.donnerPotion(obelix);
		panoramix.donnerPotion(assurancetourix);
		panoramix.donnerPotion(abraracourcix);
		panoramix.donnerPotion(agecanonix);

		asterix.parler("Bonjour à tous");
		minus.parler(" UN GAU… UN GAUGAU…");
		
		asterix.frapper(minus);
		minus.frapper(asterix);
		asterix.frapper(minus);
		

	}

}
