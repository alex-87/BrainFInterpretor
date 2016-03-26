package model;

public class Right implements Symbole {

	public Right(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public String getExplanation() {
		return new String("Pointer goes to the right");
	}

	public void runSymbole() {

		if( this.lecteur.memoire.size() <= this.lecteur.pointeur )
			this.lecteur.memoire.add( 0 );

		this.lecteur.pointeur++;

	}
	
	final Lecteur lecteur;
}
