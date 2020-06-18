package day0603;

public class ExceptionTest_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("프로그램 시작");
		try { //예외가 발생할 수 있는 코드를 넣는 곳.
			int num = 3/0; //정수를 0으로 나눌때 에러발생
		} catch (Exception e) {
			// 해결방안
			//자세한 에러메세지
//			e.printStackTrace();  //try부분은 자연스럽게
		}
		System.out.println("프로그램 종료");
	}

}
