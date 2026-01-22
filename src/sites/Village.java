package sites;

import personnages.*;

public class Village {
	private Gaulois chef;
	
	private int nbVillageois = 0;
	private int maxVillage = 4;
	private Gaulois[] villageois = new Gaulois[maxVillage];
	
	public Village (Gaulois chef) {
		this.chef = chef;
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public void ajouterVillageois(Gaulois gaulois) {
		
		if(nbVillageois < maxVillage) {
			villageois[nbVillageois] = gaulois;
			chef.parler("Bienvenue " + gaulois.getNom());
			nbVillageois ++ ;
		}
		else {
			chef.parler("Désolé " + gaulois.getNom() + " mon village est déjà bien rempli");
		}
		
		
	}

}
