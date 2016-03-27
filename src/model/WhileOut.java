package model;



public class WhileOut implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileOut(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public void runSymbole() {
		
		if( this.lecteur.pointeur.getValue() < 1 ) {
			this.lecteur.wStack.pop();
			return;
		}
		
		this.lecteur.sourceCodePtr = this.lecteur.wStack.peek();
	}
	
	public String getExplanation() {
		return("while out");
	}
	
}
