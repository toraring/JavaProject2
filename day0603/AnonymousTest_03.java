package day0603;

//�̿��� �޼ҵ�
abstract class AbstEx{
	abstract public void show();
}
//////////////////////////
//��ҿ� ���� Ŭ����
class OuterEx{
	
	//������ ���ÿ� ��������� Ŭ����
	AbstEx ab = new AbstEx() {
		
		@Override
		public void show() {
			System.out.println("�͸� ���� Ŭ����");
			// TODO Auto-generated method stub
			
		}
	};
}

public class AnonymousTest_03 {

	public static void main(String[] args) {
		
		OuterEx ex = new OuterEx();
		//�ܺ����� ������. �͸� ���� Ŭ������ ���� ������. ���� ȣ��
		ex.ab.show();
		
	}
}
