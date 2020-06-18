package day0603;

public class StringTest_11 {

	public static void main(String[] args) {
		//어떤 데이터 타입이든 String 객체로 전환이 가능하다
		int a = 100;
		String aa = a + "ddd"; //숫자 + 문자 = 문자	
//		String aa = String.valueOf(a);	//문자형으로 전환
	
		char[]b = {'a', 'p', 'p', 'l', 'e'};
		String bb = String.valueOf(b);
		
		System.out.println(aa);
		System.out.println(bb);
		
		String str = "Happy day wonderful!!";
		System.out.println(str.length()); //길이	
		
		//subString
		System.out.println(str.substring(6, 9));
		System.out.println(str.substring(10));
		
		//replace(a, b); a를 b로 전환한다.
		System.out.println(str.replace("Happy", "Nice"));
		
		
	}
}
