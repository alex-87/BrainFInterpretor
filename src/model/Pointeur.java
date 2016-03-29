package model;

import java.util.*;

public class Pointeur {
	
	protected HashMap<Integer, Integer> memory;
	
	protected int pRef;
	
	public Pointeur() {
		this.pRef = 0;
		this.memory = new HashMap<Integer, Integer>();
	}
	
	public void refInc() {
		this.pRef++;
	}
	
	public void refDec() {
		//if( this.pRef > -1 )
			this.pRef--;
	}
	
	protected boolean kContains(int key) {
		return( this.memory.containsKey(key) );
	}
	
	public void incValue() {
		if( !kContains(this.pRef) ) {
			this.memory.put(this.pRef, 1);
			return;
		}
		
		this.memory.put(this.pRef, this.memory.get(this.pRef) + 1);
	}
	
	public void decValue() {
		if( !kContains(this.pRef) ) {
			this.memory.put(this.pRef, -1);
			return;
		}
		this.memory.put(this.pRef, this.memory.get(this.pRef) - 1);
	}
	
	public void setValue(int value) {
		if( !kContains(this.pRef) ) {
			this.memory.put(this.pRef, value);
			return;
		}
		
		this.memory.put(this.pRef, value);
	}
	
	public int getValue() {
		if( !kContains(this.pRef) )return 0;
		return this.memory.get(this.pRef) + 0;
	}
	
	public int getRef() {
		return this.pRef;
	}
}
