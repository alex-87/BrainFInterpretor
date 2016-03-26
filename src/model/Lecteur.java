package model;

import java.util.*;
import java.io.*;

public class Lecteur {
	
	public final Pointeur pointeur;
		
	public HashMap<Character, Symbole> mapSymbole;
	
	public Lecteur() {
		this.pointeur   = new Pointeur();
		
		this.mapSymbole = new HashMap<Character, Symbole>();
		this.mapSymbole.put('<', new Left(this)  );
		this.mapSymbole.put('>', new Right(this) );
		this.mapSymbole.put('+', new Incr(this)  );
		this.mapSymbole.put('-', new Decr(this)  );
		
		InputStreamReader u = new InputStreamReader(System.in);
		
		try {
			char c = (char)u.read();
			while( (int)c > -1 ) {
				
				try {
					
					this.mapSymbole.get(c).runSymbole();
					System.out.println( this.mapSymbole.get(c).getExplanation() );
					
				} catch( NullPointerException ne ) {
					
				}
				
				c = (char)u.read();
			}
		}
		catch(IOException e) {
			System.out.println( e.getMessage() );
		}
	}

}
