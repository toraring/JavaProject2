package day0603;

class OuterObj{
	class InnerClass{ //Ŭ�������� Ŭ���� = ����Ŭ����
		public void write()
		{
			System.out.println("���� Ŭ������ �޼ҵ�");
		}
	}
	
	//�ܺ�Ŭ������ �޼ҵ�
	public void disp() {
		System.out.println("�ܺ� Ŭ������ �޼ҵ�");
		System.out.println("�ܺο��� ����Ŭ���� �޼ҵ� ȣ��");
		
		//�ܺ�Ŭ�������� ����Ŭ������ ��ü����
		InnerClass inc = new InnerClass();
		inc.write();
	}
}

public class InnerClassTest_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//�ܺ�(�Ϲ���)
		OuterObj ouobj = new OuterObj();
		ouobj.disp();
		
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		//����Ŭ������ �޼ҵ�� �ܺ����ؼ��� ����
		OuterObj.InnerClass obj = new OuterObj().new InnerClass();
		obj.write();
	}

}
