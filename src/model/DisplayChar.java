package model;

public class DisplayChar implements Symbole {
	
	protected Lecteur lecteur;
	
	public DisplayChar(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	public void	runSymbole() {
		//System.out.print( (char) (this.lecteur.pointeur.getValue()) );
		System.out.println( (this.lecteur.pointeur.getValue()) );
	}
	
	public String getExplanation() {
		return "";
	}
}
