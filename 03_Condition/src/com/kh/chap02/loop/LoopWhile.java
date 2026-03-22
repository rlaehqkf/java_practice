package com.kh.chap02.loop;

public class LoopWhile {
	/*
	 * while문
	 * 
	 * [ 표현법 ]
	 * 
	 * 초기식;		// 필수는 아님
	 * 
	 * while(조건식) {
	 * 		반복적으로 실행하고자 하는 코드;
	 * 		증감식; 	// 필수는 아님
	 * }
	 * 
	 * while문의 조건식의 결과값이 ture일 경우 반복적으로 실행하고자 하는 코드를 실행;
	 * 
	 * for	 => 개발자가 반복을 몇 번 해야할지 명확하게 알고 있다.
	 * while => 개발자가 반복을 몇 번 해야할지 가늠할 수가 없다.
	 * 
	 * 무한반복하는 용도로 사용할 예정
	 */

	
	public void method1() {
		// 초기식 조건식 증감식
		int i = 0; // 초기식
		while(i < 3) { // 조건식
			i++; // 증감식
			System.out.println(i);
		}
		
	}
	
	public void method2() {
		// 1 ~ 10까지의 합계를 구해서 출력
		// System.out.println(1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10);
		
		int i = 1;
		int sum = 0;
		while(i <= 10) {
			sum += i;		//sum이라는 변수공간에 i를 더해
			i++; 
		}
		System.out.println(sum);
	}
	
	public void method3() {
		
		// 1부터 시작해서
		// 1~10 사이의 임의의 정수까지를 모두 더한 합계를 출력
		// random : 무작위
		// Random이라는 클래스가 존재하지만 ~
		// Math라는 클래스가 가지고있는 random()를 호출해서 만들어 볼 예정 Math. <-직접참조연산자로 가능
		
		double number = Math.random();
		//System.out.println(number);
		
		// random()의 결과값은 : 0.0 ~~~ 0.999999999999999
		//					-> 1 ~ 10 ??
		
		// number에다가 10을 곱하면??
		//			0.0 ~~~ 9.99999999999999
		System.out.println(number * 10);
		// 10을 곱한결과를 int형으로 강제형변환
		//			0 ~~~ 9
		System.out.println((int)(number * 10));
		// 10을 곱한결과를 int형으로 강제형변환을 해준 뒤 정수값 1을 더해줌
		// 			1 ~~~ 10
		System.out.println((int)(number * 10) + 1);
		
		int randomNum = (int)(Math.random()* 10) +100;
		System.out.println(randomNum);
		// +100 이 시작값 * 10 이 값의 범위
		
		int i = 1;
		int sum = 0;
		
		while(i <= randomNum) {
			sum += i;
			i++;
		}
		System.out.println("1부터 " + randomNum + "까지 더한 결과 : " + sum);
	}
	
	// 로또 번호 생성기
	public void lotto() {
		int num1 = (int)(Math.random() * 45) + 1; 
		int num2 = (int)(Math.random() * 45) + 2;
		int num3 = (int)(Math.random() * 45) + 3;
		int num4 = (int)(Math.random() * 45) + 4;
		int num5 = (int)(Math.random() * 45) + 5;
		int num6 = (int)(Math.random() * 45) + 6;
		
		System.out.printf("오늘의 운세 %d, %d, %d, %d, %d, %d",
							num1, num2, num3, num4, num5, num6);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
