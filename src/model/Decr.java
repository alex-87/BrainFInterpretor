package model;

public class Decr implements Symbole {

	public Decr(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public String getExplanation() {
		return new String("Pointer value - 1");
	}

	public void runSymbole() {
		if( this.lecteur.nop )return;
		this.lecteur.pointeur.decValue();
	}
	
	final Lecteur lecteur;
}
