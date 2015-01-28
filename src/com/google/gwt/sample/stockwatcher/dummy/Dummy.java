package com.google.gwt.sample.stockwatcher.dummy;

public class Dummy {
	
	private int initialValue;
	private int finalValue; 
	private boolean verbose;
	
	public Dummy(int initialValue, int finalValue, boolean verbose){
		this.initialValue = initialValue;
		this.finalValue = finalValue;
		this.verbose = verbose;
	}

	public Dummy(int initialValue, int finalValue) {
		this(initialValue, finalValue, true);
	}

	public void doubleValue() {
		initialValue = initialValue + initialValue;

		print();
	}

	public void halfValue() {
		initialValue = initialValue / 2;

		print();
	}

	private void print() {

		if (verbose) {
			System.out.println(initialValue);
		}
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
