package com.three2;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		// carŬ������ �θ�Ŭ�����ο��� ���� ���볻�� �߰�
		// benz,sonata Ŭ������ carclass�� ��� �޾Ƽ� �ٵ������Ϸ�, ����
		// ������ο��� 1�� Benz, 2�� Sonata, 3�� Equus ����
		// switch���

		Scanner scan = new Scanner(System.in);
		
		SonataClass sc = new SonataClass();
		BenzClass bc = new BenzClass();
		Equus eq = new Equus();
		
		
		
		while (true) {
			System.out.println("���� ���� ���� : (1,2,3)");
			int linenum = scan.nextInt();

			if (linenum==-1) {
				System.out.println("��������");
				break;
			}
			
			
			switch (linenum) {
			case 1:
				bc.carbase("Benz");
				bc.dojoripben();
				break;

			case 2:
				sc.carbase("Sonata");
				sc.dojoripson();
				break;

			case 3:
				eq.carbase("Equus");
				eq.dojoripeq();
				break;
					
			default:
				
				break;
			}
		}

		

		
	}
}
