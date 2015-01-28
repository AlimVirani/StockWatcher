package com.google.gwt.sample.stockwatcher.dummy;

public class Dummy {
	
	private int initialValue;
	private int finalValue; 
	
	public Dummy(int initialValue){
		this.initialValue = initialValue;
		this.finalValue = finalValue;
		
	}
	
	public void Double() {
		initialValue = initialValue + initialValue;
	}
	
	public int getInitValue(){
	    return this.initialValue;
	}

	public static void main(String[] args) {
		Dummy d = new Dummy(1);
		d.Double();
		
		System.out.println(d);

	}

}
