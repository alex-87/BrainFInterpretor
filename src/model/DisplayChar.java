package model;

public class DisplayChar implements Symbole {
	
	protected Lecteur lecteur;
	
	public DisplayChar(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public void	runSymbole() {
		if( this.lecteur.nop )return;
		System.out.print( (char) (this.lecteur.pointeur.getValue()) );
	}
	
	public String getExplanation() {
		return "";
	}
}
