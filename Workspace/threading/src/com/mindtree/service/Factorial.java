package com.mindtree.service;

public class Factorial implements Runnable {
	int x =10;

	public Factorial(int x) {
		this.x = x;
	}

	public Factorial() {

	}

	public void run() {

		int fact = 1;
		for (int i = 1; i <= x; i++) {
			System.out.println("Factorial " + i);
			fact = fact * i;
		}
		System.out.println(fact);

	}
}
