package day0603;

import java.util.Scanner;

public class StringTest_12 {
	
	public static void main(String[] args) {
		
		String [] names = {"김동완", "김선미", "이수연", "윤희랑", "최선희", "성선희", "박은미"};
		
		Scanner sc = new Scanner(System.in);
		String name;// = " ";
		int cnt;
		
		while(true)
		{
			System.out.println("검색할 이름을 입력 (일부만도 가능)");
			name = sc.nextLine(); 
			
			if(name.equalsIgnoreCase("q"))
			{
				System.out.println("종료합니다");
				break;
			}
			cnt = 0;
			
			for(String s : names)
			{
				if(s.startsWith(name)) //첫글자 
				{
					cnt++;
					System.out.println(s);
				}
			}
			
			System.out.println("총 " + cnt + "명이 있습니다.");
		}
		
	}

}
