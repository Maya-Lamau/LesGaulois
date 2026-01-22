package sites;
import personnages.*;

public class Camp {
	private Soldat commandant;
	
	private int nbSoldat = 0;
	private int maxCamp = 3;
	private Soldat[] soldats = new Soldat[maxCamp];
	
	public Camp (Soldat commandant) {
		this.commandant = commandant;
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
		for (int i = 0 ; i < maxCamp; i ++) {
			
		}
	}
}
