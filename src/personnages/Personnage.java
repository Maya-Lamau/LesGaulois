package personnages;

public abstract class Personnage {
	private String nom;
	private int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(donnerAuteur() + getNom() + " : << " + texte + " >>.");
	}

	protected abstract String donnerAuteur();

	public void frapper(Personnage enemi) {
		System.out.println(
				donnerAuteur() + getNom() + " envoie un grand coup dans la mâchoire de " + enemi.getNom() + ".");
		enemi.recevoirCoup(force / 3);
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
