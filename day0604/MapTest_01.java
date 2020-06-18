package day0604;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_01 {

	//key값, value값을 찾는다.
	//순서는 유지되지 않는다.
	//키는 중복허용하지 않고, 값은 중복허용함.
	public static void main(String[] args) {
		
		Map<String, String>map = new HashMap<String, String>();
		map.put("name", "강호동");
		map.put("age", "23"); //숫자라도 맵에서는 문자형태로 넣을것
		map.put("addr", "서울시 구로구"); 
		
		//같은 키값으로 담으면 먼저 넣은 데이터는 없어짐
		map.put("name", "수지");
		
		System.out.println("갯수: " + map.size());
		System.out.println("이름: " + map.get("name"));
		System.out.println("나이: " + map.get("age"));
		System.out.println("주소: " + map.get("addr"));
	
		//맵에는 없는 키값이라서 null로 나옴
		System.out.println("혈액형: " + map.get("blood"));  
		
		//키값을 먼저 한꺼번에 얻은 후 값을 얻는 방법
		Set<String>keyset = map.keySet();
		
		System.out.println("1.방법");
		Iterator<String>keyiter = keyset.iterator();
		while(keyiter.hasNext())
		{
			String key = keyiter.next();
			System.out.println(key + "===>" + map.get(key));
		}
		
		System.out.println("2.방법");
		for(String key : keyset) //컬렉션에서 많이 쓰임
		{
			System.out.println(key + "==>" + map.get(key));
		}
		
	}
}
