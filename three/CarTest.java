package com.three;

public class CarTest  {
	public static void main(String[] args) {
		//carŬ������ �θ�Ŭ�����ο��� ���� ���볻�� �߰�
		//benz,sonata Ŭ������ carclass�� ��� �޾Ƽ� �ٵ������Ϸ�, ����
		SonataClass sc=new SonataClass();
		BenzClass bc= new BenzClass();
		Equus eq= new Equus();
		
		bc.carbase("Benz");// ����
		bc.dojoripben();
		
		sc.carbase("Sonata");
		sc.dojoripson();
		
		eq.carbase("Equus");
		eq.dojoripeq();
	}
}
