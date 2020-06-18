package day0603;

import java.util.Scanner;

public class ExceptionThrows_09 {

	public static void main(String[] args) {
		// 사용자정의 예외처리
		//예외가 발생할 경우가 아니여도 조건에 해당하면 강제로 예외처리됨
		//throws - 호출한 영역으로 예외처리를 던짐
		//throw - 강제로 예외를 발생시킬 때
		try {
			scoreInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("오류메세지: " + e.getMessage());
		}
		System.out.println("정상종료");
			
	}

	public static void scoreInput() throws Exception
	{
		//점수가 0~100점이 아니면 강제로 익셉션 발생하게
		Scanner sc = new Scanner(System.in);
		int score = 0;
		
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		
		if(score < 0 || score > 100)
		{
			throw new Exception("점수가 잘못 입력되었습니다.");
		} else
		{
			System.out.println("나의 점수는 " + score + "입니다.");
		}
	}

}
