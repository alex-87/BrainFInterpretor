package model;

public class Left implements Symbole {
	
	public Left(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public String getExplanation() {
		return new String("Pointer goes to the left");
	}

	public void runSymbole() {
		if( this.lecteur.pointeur > 0)
			this.lecteur.pointeur--;
	}
	
	final Lecteur lecteur;
}
