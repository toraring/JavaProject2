package day0604;

import java.util.ArrayList;

public class ArrayListTest_02 {

	public static void main(String[] args) {
		String []str = {"장미", "프레지아", "백합", "수국", "다알리아", "프레지아"};
		
		//객체들을 삽입, 삭제, 검색할 수 잇는 컨테이너 클래스
		ArrayList<String>list = new ArrayList<String>();
		
		//데이터담기
		for(String s : str)
			list.add(s);
			
		System.out.println("갯수: " + list.size());
		
		System.out.println("1.출력");
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("2.출력");
		for(String s : list)
		{
			System.out.println(s);
		}
	}
}
