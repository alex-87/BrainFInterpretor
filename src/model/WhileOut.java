package model;



public class WhileOut implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileOut(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public void runSymbole() {
		
		int iValue = this.lecteur.wStack.pop();
		
		if( iValue < 1 ) {
			this.lecteur.wStack.pop();
			return;
		}

		this.lecteur.sourceCodePtr = this.lecteur.wStack.peek();
		this.lecteur.wStack.push( iValue - 1 );
	}
	
	public String getExplanation() {
		return("while out");
	}
	
}
