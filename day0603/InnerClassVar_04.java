package day0603;

class Outer{
	int a = 10;
	static int b = 20;
	
	class Inner{
		int c = 30;
//		static int d = 100; static������ ���ο����� ����.
		
		//��¸޼ҵ�
		public void write()
		{
			System.out.println("�ܺκ��� a = " + a);
			System.out.println("�ܺ��������� b = " + b);
			System.out.println("���κ��� c = " + c);
			System.out.println("�������������� �Ұ���");
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
