package com.three;

public class CarTest  {
	public static void main(String[] args) {
		//car클래스는 부모클래스로엔진 장착 공통내용 추가
		//benz,sonata 클래스는 carclass를 상속 받아서 바디장착완료, 생산
		SonataClass sc=new SonataClass();
		BenzClass bc= new BenzClass();
		Equus eq= new Equus();
		
		bc.carbase("Benz");// 엔진
		bc.dojoripben();
		
		sc.carbase("Sonata");
		sc.dojoripson();
		
		eq.carbase("Equus");
		eq.dojoripeq();
	}
}
