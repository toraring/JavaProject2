package day0603;

class Outer{
	int a = 10;
	static int b = 20;
	
	class Inner{
		int c = 30;
//		static int d = 100; static변수는 내부에서는 못씀.
		
		//출력메소드
		public void write()
		{
			System.out.println("외부변수 a = " + a);
			System.out.println("외부정적변수 b = " + b);
			System.out.println("내부변수 c = " + c);
			System.out.println("내부정적변수는 불가능");
		}
	}
	
}
public class InnerClassVar_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner in = new Outer().new Inner();
		in.write();
	}

}
