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
		//��ü ������ ���̿� ���� ��ȯ���� �޶���.
		weapon weapon=new weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� "+weapon.fire());
		
		weapon=new cannon();
		System.out.println("������ ��� �ɷ���"+weapon.fire());
	}
}
