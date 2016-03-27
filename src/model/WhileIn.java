package model;



public class WhileIn implements Symbole {
	
	protected Lecteur lecteur;
	
	public WhileIn(Lecteur lecteur) {
		this.lecteur = lecteur;
	}
	
	protected void skip() {
		
		int wp = 0;
		
		for(int i=this.lecteur.sourceCodePtr; i < this.lecteur.sourceCode.length(); i++) {
			if( this.lecteur.sourceCode.charAt(i)=='[' ) wp++;
			if( this.lecteur.sourceCode.charAt(i)==']' ) wp--;
			if( wp == 0 ){
				this.lecteur.sourceCodePtr = i;
				return;
			}
		}
	}

	public void runSymbole() {
		
		if( this.lecteur.pointeur.getValue() == 0 ) {
			this.skip();
			return;
		}
		
		this.lecteur.wStack.push( this.lecteur.sourceCodePtr-1 );
	}
	
	public String getExplanation() {
		return("Into a while");
	}
	
}
