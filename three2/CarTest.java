package com.three2;

import java.util.Scanner;

public class CarTest {
	public static void main(String[] args) {
		// car클래스는 부모클래스로엔진 장착 공통내용 추가
		// benz,sonata 클래스는 carclass를 상속 받아서 바디장착완료, 생산
		// 생산라인에서 1번 Benz, 2번 Sonata, 3번 Equus 생산
		// switch사용

		Scanner scan = new Scanner(System.in);
		
		SonataClass sc = new SonataClass();
		BenzClass bc = new BenzClass();
		Equus eq = new Equus();
		
		
		
		while (true) {
			System.out.println("생산 라인 선택 : (1,2,3)");
			int linenum = scan.nextInt();

			if (linenum==-1) {
				System.out.println("생산종료");
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
