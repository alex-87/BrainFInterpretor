package model;



public class WhileOut implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileOut(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public void runSymbole() {
		
		this.lecteur.wPhase--;
		if( this.lecteur.wPhase == 0 ) {
			this.lecteur.nop = false;
		}

		if( this.lecteur.pointeur.getValue() != 0 ) {
			this.lecteur.sourceCodePtr = this.lecteur.wStack.peek();
		}
		
		this.lecteur.wStack.pop();
	}
	
	public String getExplanation() {
		return("while out");
	}
	
}
