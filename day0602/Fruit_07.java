package day0602;

//�߻�Ŭ������ �߻�޼��带 �ϳ��� ������ �־ �߻�Ŭ�����̴�.
abstract public class Fruit_07 {

	public static final String MESSAGE = "������ ������"; 
	//���� ������ ���� final�� ����.
	//�Ϲݸ޼ҵ� () {}�׻� ����
	public void showtitle() {
		System.out.println("�츮�� �߻�Ŭ������ �����մϴ�.");
	}
	
	abstract public void showMessage(); //<--�߻�޼ҵ�. ����θ� ���� +abstract
		//���߿� ������ ���� �̸� ���� ������.. �������̵��� ����

}


