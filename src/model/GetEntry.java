package model;

import java.util.*;


public class GetEntry implements Symbole {
	
	protected Lecteur lecteur;
	
	protected Scanner reader;
	
	public GetEntry(Lecteur lecteur) {
		this.lecteur = lecteur;
		this.reader  = new Scanner(System.in);
	}

	public void runSymbole() {
		if( this.lecteur.nop ) return;
		this.lecteur.pointeur.setValue( (int) reader.next().charAt(0) );
	}
	
	public String getExplanation() {
		return("User entry: ");
	}
	
}
