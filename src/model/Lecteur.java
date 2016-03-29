package model;

import java.util.*;
import java.io.*;


public class Lecteur {
	
	public final Pointeur pointeur;
		
	public HashMap<Character, Symbole> mapSymbole;
	
	public String sourceCode;
	
	public int sourceCodePtr;
	
	public Stack<Integer> wStack;
	
	public int wPhase;
	
	public boolean nop;
	
	public boolean explanation;
	
	public Lecteur(InputStream input, boolean explanation) {
		
		this.explanation = explanation;
		
		this.pointeur   = new Pointeur();
		
		this.wStack     = new Stack<Integer>();
		
		this.mapSymbole = new HashMap<Character, Symbole>();
		this.mapSymbole.put('<', SymboleFactory.LEFT.factory(this)     );
		this.mapSymbole.put('>', SymboleFactory.RIGHT.factory(this)    );
		this.mapSymbole.put('+', SymboleFactory.INC.factory(this)      );
		this.mapSymbole.put('-', SymboleFactory.DEC.factory(this)      );
		this.mapSymbole.put('[', SymboleFactory.WHILEIN.factory(this)  );
		this.mapSymbole.put(']', SymboleFactory.WHILEOUT.factory(this) );
		this.mapSymbole.put('.', SymboleFactory.PRINT.factory(this)    );
		this.mapSymbole.put(',', SymboleFactory.INPUT.factory(this)    );
		
		this.nop    = false;
		this.wPhase = 0;
		
		this.sourceCode = new String();
		
		Scanner u = new Scanner(input);
		while( u.hasNext() )this.sourceCode+=u.next();
		u.close();
	}
	
	public void Process() {
		while( this.sourceCodePtr < this.sourceCode.length() ) {
			interpretor( this.sourceCode.charAt(this.sourceCodePtr) );
			this.sourceCodePtr++;
		}
	}
	
	public void interpretor(char entry) {
		try {

			if( this.explanation ) System.out.println( this.mapSymbole.get(entry).getExplanation() );
			this.mapSymbole.get(entry).runSymbole();
			
		} catch( NullPointerException ne ) {
			
		}
	}

}
