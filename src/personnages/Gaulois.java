package personnages;

public class Gaulois extends Personnage {

	private double forcePotion;

	public Gaulois(String nom, int force) {
		super(nom, force);
	}

	@Override
	protected String donnerAuteur() {
		return " gaulois ";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix.getNom());

	}

	@Override
	protected int calculerForceDeFrappe() {
		int forceDeFrappe = (int) (force * forcePotion / 3);
		forcePotion = forcePotion - 0.5;
		return forceDeFrappe;
	}

	public void boirePotion(int forcePotion) {
		calculerForceDeFrappe();
		this.forcePotion = forcePotion;
	}

}
