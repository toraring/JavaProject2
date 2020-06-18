package day0602;

//추상클래스는 추상메서드를 하나만 가지고 있어도 추상클래스이다.
abstract public class Fruit_07 {

	public static final String MESSAGE = "오늘은 좋은날"; 
	//절대 고정을 위해 final을 붙임.
	//일반메소드 () {}항상 공존
	public void showtitle() {
		System.out.println("우리는 추상클래스를 공부합니다.");
	}
	
	abstract public void showMessage(); //<--추상메소드. 선언부만 존재 +abstract
		//나중에 구현을 위해 미리 제목만 만들어둠.. 오버라이딩이 목적

}


