package com.one;

class weapon {
	protected int fire() {
		return 1;
	}
}

class cannon extends weapon {
	protected int fire() {
		return 10;
	}
}

public class Overriding {
	public static void main(String[] args) {
		//객체 생성의 차이에 의해 반환값이 달라짐.
		weapon weapon=new weapon();
		System.out.println("기본 무기의 살상 능력은 "+weapon.fire());
		
		weapon=new cannon();
		System.out.println("대포의 살상 능력은"+weapon.fire());
	}
}
