package com.kh.network.run;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerProgram {

	public static void main(String[] args) {
		/*
		 * 통신을 하기 위해서는 서버와 클라이언트 연결이 필요함
		 * 
		 * ServerSocket
		 * - 포트번호와 연결(Bind)해서 외부의 연결요청을 기다리다가 요청이 들어오면 수락해줄 용도
		 * - 수락하는 순간 서버의 Socket객체 생성
		 * 
		 * Socket
		 * - Process간의 통신을 담당
		 * - Socket객체를 이용해서 통신을 위한 기반스트림 InputStream / OutputStream을 제공받음
		 * - 기반스트림만으로 한글 전송에 제약이 있어서 보조스트림을 사용
		 * 
		 * 소켓 통신용 서버측 프로그램 작성 절차
		 * 
		 * 1) 포트 번호 지정(서버에서 몇 번 포트를 열것인지)
		 * 2) ServerSocket 객체 생성 => 매개변수 생성자 호출 시 포트번호 인자로 전달(포트결합)
		 * 3) 대기상태
		 * 4) 클라이언트가 연결 요청을 하면 수락 후 통신가능한 Socket 객체를 반환받음
		 * 5) Socket객체를 이용해서 입/출력용 스트림 열어주기
		 * 6) 보조스트림을 사용해서 성능 개선
		 * 7) 데이터를 주고받는 코드
		 * 8) 자원반납 
		 * 
		 */
		// 서버측 프로그램
		
		// 0) 필요한 변수 선언!!
		Scanner sc = new Scanner(System.in);
		
		// 자원반납을 위해 미리 참조변수 선언하고 null값으로 초기화
		ServerSocket server = null;
		PrintWriter pw = null;
		BufferedReader br = null;
		
		// 1) 포트번호 지정
		int portNumber = 1234;
		
		
		try {
			// 2) ServerSocket객체 생성 및 포트결합(bind)
			server = new ServerSocket(portNumber);
			
			// 3) 대기상태
			System.out.println("클라이언트의 요청을 기다리는 중...");
			
			// 4) 연결 요청이 오면 수락 후 해당 클라이언트와 통신 할 수 있는 서버 측 Socket 객체 생성
			Socket socket = server.accept();
			System.out.println("클라이언트와 연결 성공!");
			
			// 5) 클라이언트와 통신 할 수 있는 입/출력용 스트림 생성
			// 6) 보조스트림을 추가해서 성능 개선
			
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			// socket객체가 제공해주는 입력용 기반스트림 => InputStream => 1Byte
			// 바이트스트림과 문자스트림을 호환해줄 수 있는 보조스트림 => InPutStreamReader
			// 속도향상, 한글전달을 위한 입력용 보조스트림 => BufferedReader => 2Byte
			
			// 출력용 스트림
			pw = new PrintWriter(socket.getOutputStream());
			// PrintWriter는 2Byte짜리 문자용이지만 1Byte짜리도 호환이 가능
			
			// 7) 데이터 주고 받기
			while(true) {
				// 7_1) 입력받기
				String message = br.readLine();
				if(message.equals("null")) {
					break;
				}
				
				System.out.println("클라이언트로부터 받은 메세지 : " + message);
				
				// 7_2) 출력하기
				System.out.println("클라이언트에게 전송할 메세지 > ");
				String sendMessage = sc.nextLine();
				pw.println(sendMessage);
				
				// 스트림에 있는 데이터를 강제로 내보내기위해서
				pw.flush();
				
			}
			
			
			
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pw.close();
			
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			sc.close();
			
			try {
				server.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
