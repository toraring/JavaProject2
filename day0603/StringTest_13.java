package day0603;

public class StringTest_13 {

	public static void main(String[] args) {
		//StringBuffer; 문자열 저장 및 편집기능이 추가된 자료형
		StringBuffer sb = new StringBuffer();
		sb.append("Happy");
		sb.append("Nice");
		sb.append(200);
		sb.append(2.34);
		sb.append('A');		
		
		//삽입
		sb.insert(3, "Apple");// 3번 인덱스 앞에 애플을 삽입한 것.
		
		//삭제
		sb.delete(0, 3); //0~2 번째까지 삭제됨
		
		//대체
		sb.replace(6, 10, "Angel"); // 6~9 번째 까지 대체됨
		
		System.out.println(sb);
	}
}
