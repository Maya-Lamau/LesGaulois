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
	
	public void affichierVillageois() {
		System.out.println("Le village de " + chef.getNom() + " est habité par : ");
		for (int i = 0 ; i < maxVillage; i ++) {
			System.out.println("- " + villageois[i].getNom());
			
		}
	}
	
	public void changerChef(Gaulois nouveauChef) {
		chef.parler("Je laisse mon grand bouclier au grand " + nouveauChef.getNom());
		chef = nouveauChef;
		chef.parler("Merci !");
	}
	
}
