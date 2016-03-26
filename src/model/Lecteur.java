package model;

import java.util.*;
import java.io.*;

public class Lecteur {
	
	public int pointeur;
	
	public ArrayList<Integer> memoire;
	
	public HashMap<Character, Symbole> mapSymbole;
	
	public Lecteur() {
		this.pointeur   = 0;
		this.memoire    = new ArrayList<Integer>();
		
		this.mapSymbole = new HashMap<Character, Symbole>();
		this.mapSymbole.put('<', new Left(this)  );
		this.mapSymbole.put('>', new Right(this) );
		this.mapSymbole.put('+', new Incr(this)  );
		this.mapSymbole.put('-', new Decr(this)  );
		
		InputStreamReader u = new InputStreamReader(System.in);
		
		try {
			char c = (char)u.read();
			while( (int)c > -1 ) {
				this.mapSymbole.get(c).runSymbole();
				System.out.println( this.mapSymbole.get(c).getExplanation() );
				c = (char)u.read();
			}
		}
		catch(IOException e) {
			System.out.println( e.getMessage() );
		}
	}

}
