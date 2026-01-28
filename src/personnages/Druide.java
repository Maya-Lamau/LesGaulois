package personnages;
import java.security.SecureRandom;
import java.util.Random;

public class Druide extends Gaulois {
	
	 private int quantite;
	 private int puissance;
	 private Random random;
	 
		public Druide(String nom, int force) {
			super(nom,force);
			try {
				random = SecureRandom.getInstanceStrong();
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		public void frabriquerPotion(int quantite) {
			this.quantite = quantite;
			puissance = random.nextInt(5)+2;
			parler("J'ai concocté " + quantite + " doses de potion magique. Elle a une force de " + puissance);
		}
		
		public void donnerPotion(Gaulois gaulois) {
			if (quantite <= 0) {
				parler("Désolé " + gaulois.getNom() + " il n'y a plus une seule goutte de potion");
			}
			else if(gaulois.getNom().equals("Obélix")) {
					parler("Non, Obélix Non !... Et tu le sais très bien !");
			}
			else {
				parler("Tiens " + gaulois.getNom() + " un peu de potion magique" );
				quantite--;
			}
			gaulois.boirePotion(puissance);
		}

		
}
