package com.one;

class Shape { //����Ŭ����
	public Shape next;

	public Shape() {next=null;}

	public void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape {
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {//�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class MethodOverRidingEx {
	static void paint(Shape P) {//�޼ҵ� �������̵�
		P.draw();//p�� ����Ű�� ��ü ���� �������̵���  draw()ȣ��. ���� ���ε�
		
		
	}

	public static void main(String[] args) {
		Line line = new Line();
		//���� ȣ����� ��� paint() �޼ҵ� ������ shape�� ���� ���۷��� p�� ��ĳ���õ�
		paint(line);//line�� �������̵��� draw()����, "Line" ���
		paint(new Shape());//Shape�� Draw() ����. "Shape" ���
		paint(new Line());//Line�� �������̵��� draw() ����, "Line" ���
		paint(new Rect());//Rect�� �������̵��� draw() ����, "Rect" ���
		paint(new Circle());//Circle�� �������̵��� drew()����, "Circle" ���
		
	}
}
