package model;



public class WhileIn implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileIn(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	protected void skip() {
		this.lecteur.wPhase = 1;
		this.lecteur.nop = true;
	}

	public void runSymbole() {
		
		if( this.lecteur.nop ) {
			this.lecteur.wPhase++;
			return;
		}

		if( this.lecteur.pointeur.getValue() == 0 ) {
			this.skip();
		}
		
		this.lecteur.wStack.push( this.lecteur.sourceCodePtr - 1 );
	}
	
	public String getExplanation() {
		return("While in");
	}
	
}