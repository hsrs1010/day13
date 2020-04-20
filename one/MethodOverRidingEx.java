package com.one;

class Shape { //슈퍼클래스
	public Shape next;

	public Shape() {next=null;}

	public void draw() {
		System.out.println("shape");
	}
}

class Line extends Shape {
	public void draw() {//메소드 오버라이딩
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {//메소드 오버라이딩
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {//메소드 오버라이딩
		System.out.println("Circle");
	}
}

public class MethodOverRidingEx {
	static void paint(Shape P) {//메소드 오버라이딩
		P.draw();//p가 가리키는 객체 내에 오버라이딩된  draw()호출. 동적 바인딩
		
		
	}

	public static void main(String[] args) {
		Line line = new Line();
		//다음 호출들은 모두 paint() 메소드 내에서 shape에 대한 레퍼런스 p로 업캐스팅됨
		paint(line);//line에 오버라이딩한 draw()실행, "Line" 출력
		paint(new Shape());//Shape의 Draw() 실행. "Shape" 출력
		paint(new Line());//Line에 오버라이딩한 draw() 실행, "Line" 출력
		paint(new Rect());//Rect에 오버라이딩한 draw() 실행, "Rect" 출력
		paint(new Circle());//Circle에 오버라이딩한 drew()실행, "Circle" 출력
		
	}
}
