package model;

public class Decr implements Symbole {

	public Decr(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public String getExplanation() {
		return new String("Pointer value - 1");
	}

	public void runSymbole() {

		this.lecteur.memoire.set(
				this.lecteur.pointeur,
				this.lecteur.memoire.get(this.lecteur.pointeur) - 1
			);

	}
	
	final Lecteur lecteur;
}
