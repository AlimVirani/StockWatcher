package com.google.gwt.sample.stockwatcher.dummy;

public class Dummy {

	private int initialValue;
	private boolean verbose;

	public Dummy(int initialValue, boolean verbose) {
		this.initialValue = initialValue;
		this.verbose = verbose;
	}

	public Dummy(int initialValue) {
		this(initialValue, true);
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

	public static void main(String[] args) {
		Dummy d = new Dummy(1);
		d.Double();

		System.out.println(d);

	}

}
