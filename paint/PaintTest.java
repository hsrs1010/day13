package com.paint;
// paint 밑그림 작업

// waterpaint,oilpaint,orient 수,유채화물감 준비,채색, 완성
// 1,2,3 입력된 값에 의해 장르(orient) 구분
// 반복

import java.util.Scanner;

public class PaintTest {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		OilPaint op = new OilPaint();
		WaterPaint wp = new WaterPaint();
		OrientPaint orp = new OrientPaint();

		while (true) {
			System.out.println("장르선택 (1,2,3)");
			int typechoice = sc.nextInt();
			
			if (typechoice==-1) {
				System.out.println("선택종료");
				break;
			}
			
			switch (typechoice) {
			case 1:
				op.draw("유채화");
				op.oil();
				break;

			case 2:
				wp.draw("수채화");
				wp.water();
				break;

			case 3:
				orp.draw("오리엔트");
				orp.ori();
				break;

			default:
				System.out.println("장르 재 선택");
				break;
			}
		}
	}
}