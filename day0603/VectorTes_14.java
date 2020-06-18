package day0603;

import java.util.Iterator;
import java.util.Vector;

public class VectorTes_14 {

	
	public static void main(String[] args) {
		//배열과 달리 자동으로 배열 길이가 늘어난다.
//		List<String>list = new Vector<String>();
		Vector<String>list = new Vector<String>(); //가변적인 것을 쓸때 list, vector를 쓴다.
		
		System.out.println("초기할당 크기 : " + list.capacity());
		System.out.println("초기 데이터 갯수: " + list.size());
		
		
		//추가 ; 만약 숫자넣으면 오류뜸. 위에 string있어서
		list.add("사과");
		list.add("사과");
		list.add("오렌지");
		list.add("수박");
		list.add("키위");
		
		System.out.println("갯수: " + list.size());
		System.out.println("1.출력");
		for(int i = 0; i < list.size(); i++)
		{
			String s = list.get(i);
			System.out.println(s);
		}
		System.out.println("2.출력");
		for(String s : list)
			System.out.println(s);
		
		System.out.println("3.출력");
		Iterator<String>iter = list.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
	
}
