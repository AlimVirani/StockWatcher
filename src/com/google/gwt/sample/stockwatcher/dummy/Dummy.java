package com.google.gwt.sample.stockwatcher.dummy;

public class Dummy {
	
	private int initialValue; 
	
	public Dummy(int initialValue){
		this.initialValue = initialValue;
	}
	
	public void Double() {
		initialValue = initialValue + initialValue;
	}

	public static void main(String[] args) {
		Dummy d = new Dummy(1);
		d.Double();
		
		System.out.println(d);

	}

}
