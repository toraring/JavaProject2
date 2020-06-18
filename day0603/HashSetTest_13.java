package day0603;
//순서를 유지하지 않는 데이터. 대신 중복허용 안됨.
//

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest_13 {

	public static void main(String[] args) {
		
		//(인터페이스명) <데이터형> 객체이름 = new 클래스명 <데이터형>();
		Set<String> set = new HashSet<String>(); //반드시 크러시 
		
		set.add("사과");
		set.add("바나나");
		set.add("사과");
		set.add("키위");
		set.add("오렌지");
		
		System.out.println("데이터 갯수: " + set.size());
		//지정된 요소를 돌려주는 int형
		
		System.out.println("출력");
		Iterator<String> iter = set.iterator(); //set은 컬렉션명
		
		while (iter.hasNext())//더이상 데이터가 없으면 false값 변환
		{
			String s = iter.next(); //다음으로 이동함과 동시에 데이터 변환.\
			System.out.println(s);
			if(set.isEmpty())
			
				System.out.println("set 안에 데이터가 없다");
			else
				System.out.println("set 안에 데이터가 있다.");
				
		}
		
	set.clear(); //모든 데이터 삭제
	}
	
	
}
