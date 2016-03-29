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
	
	public Lecteur(InputStream input) {
		
		this.pointeur   = new Pointeur();
		
		this.wStack     = new Stack<Integer>();
		
		this.mapSymbole = new HashMap<Character, Symbole>();
		this.mapSymbole.put('<', new Left(this)       );
		this.mapSymbole.put('>', new Right(this)      );
		this.mapSymbole.put('+', new Incr(this)       );
		this.mapSymbole.put('-', new Decr(this)       );
		this.mapSymbole.put('[', new WhileIn(this)    );
		this.mapSymbole.put(']', new WhileOut(this)   );
		this.mapSymbole.put('.', new DisplayChar(this));
		
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
			//System.out.println( this.mapSymbole.get(entry).getExplanation() );
			//System.out.println( this.wPhase );
			this.mapSymbole.get(entry).runSymbole();
			
		} catch( NullPointerException ne ) {
			
		}
	}

}
