package model;



public class WhileIn implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileIn(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public void runSymbole() {
		this.lecteur.wStack.push( this.lecteur.sourceCodePtr);
	}
	
	public String getExplanation() {
		return("Into a while");
	}
	
}
