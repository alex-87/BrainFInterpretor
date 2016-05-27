package model;



public class WhileOut implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileOut(Lecteur lecteur) {
		this.lecteur = lecteur;
	}

	public void runSymbole() {
		
		if( this.lecteur.nop ) {
			this.lecteur.wPhase--;
		}
		
		if( this.lecteur.wPhase == 0 ) {
			this.lecteur.nop = false;
		}
		
		if( this.lecteur.nop ) return;
		
		if( this.lecteur.pointeur.getValue() != 0 && !this.lecteur.wStack.isEmpty() ) {
			this.lecteur.sourceCodePtr = this.lecteur.wStack.pop();
			return;
		} 

		if( !this.lecteur.wStack.isEmpty() )this.lecteur.wStack.pop();
	}
	
	public String getExplanation() {
		return("While out");
	}
	
}