package model;



public class WhileIn implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileIn(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	protected void skip() {
		this.lecteur.nop = true;
	}

	public void runSymbole() {
		
		this.lecteur.wPhase++;
		if( this.lecteur.nop )return;
		

		if( this.lecteur.pointeur.getValue() == 0 ) {
			this.skip();
		}
		
		this.lecteur.wStack.push( this.lecteur.sourceCodePtr-1 );
	}
	
	public String getExplanation() {
		return("Into a while");
	}
	
}
