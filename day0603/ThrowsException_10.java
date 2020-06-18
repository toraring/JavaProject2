package day0603;

import java.util.Scanner;

class UserException extends Exception
{
	public UserException(String msg) {
		super(msg); //오류메세지를 부모에게 보냄.
	}
}
////////////////////////////////////////////////

public class ThrowsException_10 {
	
	public static void nameInput() throws Exception
	{
		Scanner sc = new Scanner(System.in);
		
		//금지이름
		String [] str = {"김태희", "고소용", "이민", "김혜자"};
		String name = "";
		
		System.out.println("이름을 입력하세요");
		name = sc.nextLine();
		
		for(String n : str) //foreach문
		{
			if(n.equals(name))
			{
				throw new UserException("금지된 단어입니다");
			}
		}
		System.out.println("나의 이름은 " + name + "입니다.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			nameInput();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("오류: " + e.getMessage());
		}
	}

}
