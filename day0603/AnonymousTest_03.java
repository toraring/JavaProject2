package day0603;

//미완의 메소드
abstract class AbstEx{
	abstract public void show();
}
//////////////////////////
//평소에 쓰던 클래스
class OuterEx{
	
	//생성과 동시에 만들어지는 클래스
	AbstEx ab = new AbstEx() {
		
		@Override
		public void show() {
			System.out.println("익명 내부 클래스");
			// TODO Auto-generated method stub
			
		}
	};
}

public class AnonymousTest_03 {

	public static void main(String[] args) {
		
		OuterEx ex = new OuterEx();
		//외부참조 변수명. 익명 내부 클래스의 참조 변수명. 으로 호출
		ex.ab.show();
		
	}
}
