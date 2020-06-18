package day0603;

class OuterObj{
	class InnerClass{ //클래스안의 클래스 = 내부클래스
		public void write()
		{
			System.out.println("내부 클래스의 메소드");
		}
	}
	
	//외부클래스의 메소드
	public void disp() {
		System.out.println("외부 클래스의 메소드");
		System.out.println("외부에서 내부클래스 메소드 호출");
		
		//외부클래스에서 내부클래스의 객체생성
		InnerClass inc = new InnerClass();
		inc.write();
	}
}

public class InnerClassTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//외부(일반적)
		OuterObj ouobj = new OuterObj();
		ouobj.disp();
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		//내부클래스의 메소드는 외부통해서만 가능
		OuterObj.InnerClass obj = new OuterObj().new InnerClass();
		obj.write();
	}

}
