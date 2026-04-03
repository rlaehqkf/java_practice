package com.kh.chap01.run;

import java.io.File;
import java.io.IOException;

public class FileRun {

	public static void main(String[] args) {

		// File 클래스를 가지고 File작업을 해보자~~~
		// java.io 패키지에 존재
		
		File file1 = new File("abc.txt");
		
		// 파일만들기 
		try {
		file1.createNewFile();
		
		// 폴더만들기
		File folder = new File("folder");
		// directory
		// makeDirectory
		folder.mkdir();
		
		// 경로지정
		File file2 = new File("folder/test.txt");
		file2.createNewFile();
		
		// 파일클래스에서 제공하는 여러가지 메소드들
		System.out.println("파일인가요? : " +file2.isFile() );
		System.out.println("파일명은 뭔가요? : " + file2.getName());
		System.out.println("파일의 절대 경로는 뭔가요?? : " + file2.getAbsolutePath());
		System.out.println("파일의 크기는 얼만가요? : " + file2.length());
		
	} catch(IOException e) {
		e.printStackTrace();
	}

		/*
		 * IO => Input & Output, 입/출력
		 * 
		 * 프로그램 상의 데이터를 외부매체(모니터, 스피커, DB, 프로세스, 콘솔, "파일")로 출력하거나
		 * 입력장치(마우스, 키보드, 마이크, "파일")로 입력받는 과정
		 * 
		 * IO를 진행하고 싶다면 먼저 프로그램하고 외부매체간의 "통로"를 만들어야함
		 * => 스트림(Stream) 
		 * 
		 * 스트림의 특징
		 * 
		 * - 단방향 : 입력이면 입력 / 출력이면 출력
		 * 			입력과 출력용이 각각 따로 존재함
		 * 
		 * - 선입선출(First In First Out) => 시간지연 문제가 발생할 수 있음
		 * 
		 * 스트림의 구분
		 * 
		 * - 스트림의 사이즈
		 * 
		 * 바이트 스트림 : 1Byte짜리 데이터가 이동할 수 있는 통로
		 * 				=> 입력(XXXInPutStream) / 출력(XXXOutputStream)
		 * 
		 * 문자 스트림 : 2Byte짜리 데이터가 이동할 수 있는 통로
		 * 			  => 입력(XXXReader) / 출력(XXXWriter)
		 * 
		 *  - 외부매체와 직접적인 연결 여부
		 *  
		 *  기반 스트림 : 외부매체랑 직접적으로 연결되는 스트림
		 * 
		 *  보조 스트림 : 기반스트림의 성능을 향상시키기 위한 용도로 사용하는 스트림
		 *  		=> 단독사용불가능(반드시 기반스트림이 존재해야함)
		 *  		=> 속도 향상, 자료형에 맞춰서 반환, 객체단위로 입출력, 바이트 <==> 문자
		 *  
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
