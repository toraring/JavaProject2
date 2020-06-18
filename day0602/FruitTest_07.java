package day0602;

public class FruitTest_07 {

	public static void main(String[] args) {
		
		//자식 클래스로 생성
		//평상시의 보편적 생성......
		//참조변수가 너무 많아서 하나로 하고싶을 때 불편.. 다형성 필요
//		Apple_07 ap1 = new Apple_07();
//		ap1.showtitle();
//		ap1.showMessage();
//		
//		Orange_07 or1 = new Orange_07();
//		or1.showMessage();
//		
//		Banana_07 ba1 = new Banana_07();
//		ba1.showMessage();

		//다형성으로 객체생성하여 출력
			//장점은 참조변수를 하나로 묶는 것 말곤 없음..
		Fruit_07 fr1;
		fr1 = new Apple_07();
		fr1.showMessage();
		fr1.showtitle();
		
		fr1 = new Orange_07();
		fr1.showMessage();
		
		fr1 = new Banana_07();
		fr1.showMessage();
		
	}

}
