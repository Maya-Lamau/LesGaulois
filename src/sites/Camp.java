package sites;
import personnages.*;

public class Camp {
	private Soldat commandant;
	
	private int nbSoldat = 0;
	private int maxCamp = 3;
	private Soldat[] soldats = new Soldat[maxCamp];
	
	public Camp (Soldat commandant) {
		this.commandant = commandant;
		commandant.parler("Je suis en charge de créer un nouveau camp romain");
	}
	
	public Soldat getCommandant() {
		return commandant;
	}
	
	public void ajouterSoldat(Soldat soldat) {
		
		if(nbSoldat < maxCamp) {
			soldats[nbSoldat] = soldat;
			soldat.parler("je mets mon épée au servie de Rome dans le camp dirigé par " + commandant.getNom());
			nbSoldat++;
		}
		else {
			commandant.parler("Désolé " + soldat.getNom() + " notre camp est complet !");
		}
			
	}
	
	public void affichierCamp() {
		System.out.println("Le camp diriger par " + commandant.getNom() + " comtient les soldats : ");
		for (int i = 0 ; i < maxCamp; i ++) {
			System.out.println("- " + soldats[i].getNom());
			
		}
	}
	
	public void changerCommandant(Soldat nouveauCommandant) {
		if (nouveauCommandant.getGrade() == Grade.CENTURION) {
			nouveauCommandant.parler("Moi " + nouveauCommandant.getNom() + " je prend la direction du camp romain.");
		}
		else {
			nouveauCommandant.parler("Je ne suis pas suffisament gradé pour prendre la direction du camp romain.");
		}
		
		
	}
	
}
