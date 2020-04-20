package com.one;

class Shape2 {
	protected String naem;

	public void paint() {
		draw();

	}

	public void draw() {
		System.out.println("Shape");

	}
}

public class CircleTest extends Shape2 {
	public void draw() {
		System.out.println("Circle");
	}

	public static void main(String[] args) {
		Shape2 b = new CircleTest();
		b.paint();
	}
}
