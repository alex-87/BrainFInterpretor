package model;

public class Incr implements Symbole {

	public Incr(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public String getExplanation() {
		return new String("Pointer value + 1");
	}

	public void runSymbole() {
		if( this.lecteur.nop )return;
		this.lecteur.pointeur.incValue();

	}
	
	final Lecteur lecteur;
}
