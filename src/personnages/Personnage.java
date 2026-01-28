package personnages;

public abstract class Personnage {
	private String nom;
	protected int force;
	public boolean mort;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println("Le" + donnerAuteur() + getNom() + " : << " + texte + " >>.");
	}

	protected abstract String donnerAuteur();

	public void frapper(Personnage enemi) {
		System.out.println(
				"Le" + donnerAuteur() + getNom() + " envoie un grand coup de force "+ enemi.force + " au" + donnerAuteur() + enemi.getNom() + ".");
		enemi.recevoirCoup(calculerForceDeFrappe());
	}

	protected int calculerForceDeFrappe() {
		return force / 3;
	}

	public void recevoirCoup(int forceCoup) {

		force = force - forceCoup;
		if (force < 1) {
			force = 0;
			parler("J'abandonne...");
		} else {
			parler("Aïe !");
		}

	}
	
}
