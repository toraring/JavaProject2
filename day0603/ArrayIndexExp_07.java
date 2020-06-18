package day0603;

public class ArrayIndexExp_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []str = {"apple", "bananan", "Oragne", "kiwi"};
		
		System.out.println("차례대로 출력");
		
		for(int i = 0; i <= str.length; i++)
		{
			try {
				System.out.println(str[i]);				
			} catch (ArrayIndexOutOfBoundsException e) {
				// exception 발생시 실행코드
				System.out.println("배열요구: " + e.getMessage());
			}
		}
		
		//반복문으로..
		System.out.println("거꾸로 출력");
		for(int i = str.length; i >= 0; i--) {
			try {				
				System.out.println(str[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("거꾸로 출력 중 오류 : " + e.getMessage());
			}
		}
	}

}
