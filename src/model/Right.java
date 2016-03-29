package model;

public class Right implements Symbole {

	public Right(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public String getExplanation() {
		return new String("Pointer goes to the right");
	}

	public void runSymbole() {
		if( this.lecteur.nop )return;
		this.lecteur.pointeur.refInc();

	}
	
	final Lecteur lecteur;
}
