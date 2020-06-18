package day0603;

import java.io.InputStream;

public class ExceptionTest_08 {

	public static void main(String[] args) {
		//InputStream: 바이트 단위 입력 최상위 클래스 - 추상클래스 이므로, 객체를 직접 못만듦.
		//자식클래스가 받아서 직접 구현.
		//read(): 한 바이트만 읽는다.
		//read(byte[] b) - 사용자가 지정한 바이트를 이용해서 한꺼번에 원하는 만큼 읽기 가능.
		
		InputStream is = System.in;
		int a = 0; 
		System.out.println("한 글자 입력: ");

		try {
			a = is.read();	
		} catch (Exception e) {
			System.out.println("오류: " + e.getMessage());
		}
		System.out.println("3초 뒤에 출력합니당");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("입력값: " + (char)a);

	}

}
