package com.mindtree.service;

public class Fibonacci extends Thread {
	int n = 10;
	int a = 0;
	int b = 1;

	public Fibonacci(int n) {
		this.n = n;
	}

	public Fibonacci() {

	}

	public void run() {
		for (int j = 0; j <= n; j++) {
			System.out.println("Fibonacci " + a);
			int sum = a + b;
			a = b;
			b = sum;

		}

	}

}
