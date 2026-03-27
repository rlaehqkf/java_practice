package com.kh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CheckedException {
	/*
	 * CheckedException
	 * 
	 * 예외처리를 해야한다는 사실을 체크를 해주는 예외들!!
	 * 문법적으로 반드시 예외처리를 해야함
	 */
	public void readString() {
		// 사용자에게 문자열을 하나만 입력받아서 
		// 입력받은 문자열의 길이를 출력
		// 임시저장공간
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		
		// CheckException에 대한 예외처리 방법
		// 방법 1. try catch 문을 작성한다.
		
		try {
		String str= br.readLine(); // IOException
		System.out.println(str.length());
		method();
		} catch(IOException e) { // 주로 외부매체 입 / 출력 시
			e.printStackTrace();
		}
		sc.nextLine();
		
	}
	
	
	private void method() throws IOException {
		System.out.println("아주아주아주아주아주아주아주위험한코드");
		throw new RuntimeException("예외발생!!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
