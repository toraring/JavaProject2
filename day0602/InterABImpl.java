package day0602;

//���߱����� �����ϴ�. �������̵��� �� ��.
public class InterABImpl implements Inter_A, Inter_B{
	@Override	
	public void draw() {
		System.out.println("���� �ϱ⸦ ���ϴ�.");
		
	}@Override
		public void play() {
		System.out.println("�׸��� �׸���");
		
	}@Override
		public void write() {
		System.out.println("�౸�� �մϴ�");
			
	}
	
}
