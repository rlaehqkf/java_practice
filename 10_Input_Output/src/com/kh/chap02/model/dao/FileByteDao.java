package com.kh.chap02.model.dao;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// VO(Value Object)
// DAO(Data Access Object)
// 데이터가 보관되어있는 공간에 직접 접근해서 
// 입력 / 출력하는 메소드들을 구현해줌


public class FileByteDao {
	
	// 파일에 프로그램에서 만들어진 데이터를 출력(ByteStream사용)
	public void outputToFile() {
		// 출력 : 프로그램내의 데이털르 밖으로 내보내겠다. 프로그램 --> 외부(파일)
		
		// FileOutputStream : "파일"로 데이터를 출력할 때, 파일과 연결하는 1Byte단위의 스트림
		
		// 1. FileOutputStream 객체 생성
		FileOutputStream fos= null;
		try {
		fos = new FileOutputStream("a_byte.txt"/*, true*/);
		// 생성자 호출 시 파일명을 전달, 존재하지않는 파일명일경우 해당 파일을 생성하면서 스트림 생성
		// 생성자 호출 시 두 번째 인자값으로 true를 전달하면 이어쓰기 / 안쓰면 덮어쓰기
		
		// 2. 스트림을 통해 데이터를 출력 : wirte() 호출
		fos.write(97);
		fos.write(98);
		fos.write(99);
		
		byte[] arr = {101, 102, 103};
		fos.write(arr);
		
		fos.write('A');
		fos.write('B');
		
		fos.write('이');
		fos.write('승');
		fos.write('현'); // t� 
		
		// 1Byte의 범위 : -128 ~ 127
		// 한글은 2Byte기 때문에 깨짐
		// 바이트스트림으로는 한글 / 일본어 / 중국어 해결이 안됨
		// 문자스트림을 사용해야 해결이 가능
		
		// 3. 스트림의 사용이 끝남
		// 반드시 해줘야하는 꼭 해야하는 무조건 지켜야하는 약속이 있음
		// 코드상에서 사용이 전부 종료되었다면 반드시 자원반납을 해주어야함 <-- 약속
		
		// 자원반납 하는 방법
		// .close()
		//	fos.close(); 
		
		
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}
		try {
			if(fos != null) {
				fos.close();
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
		
	}
	
	// 프로그램 <== 외부매체(파일)
	// 입력 : 파일로부터 데이터를 가지고 오겠다.
	// FileInputStream : 파일로부터 데이터를 가져와서 입력받을건데, 1Byte 단위로 입력 받겠다.
	public void inputFromFile() {
		
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a_byte.tet"); // 1.입력 스트림 생성하기
			
			// 2. 데이터를 입력받기
			// read()호출 ==> 1Byte단위로 읽어옴
			/*
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			System.out.println(fis.read());
			// ↑ 여기까지가 데이터를 다 입력받음
			System.out.println(fis.read());
			// ↑ 파일의 마지막 데이터를 입려받고 나서 read를 호출시 -1을 반환	
			 */
			
			/*
			while(fis.read() != -1) {
				System.out.println(fis.read);
			}
			*/
			
			/*
			while(true) {
				int value = fis.read();
				
				if(value != -1) {
					System.out.println((char)value);
				} else {
					break;
				}
			}
			*/
			
			int value = 0;
			while((value = fis.read()) != -1) {
				System.out.println((char)value);
			}
			
			
			
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
			fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
