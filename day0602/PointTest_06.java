package day0602;

//����
class Point{
	//����Ʈ ������
	int x;
	int y;
	
	public Point() {
		System.out.println("���� - ����Ʈ ������ ȣ��");
	}
	public Point(int x, int y) {
		System.out.println("���� - �����ִ� ������");
		this.x = x;
		this.y = y;
		
	}
	
	public void write() {
		System.out.println("x ��ǥ = " + x + ", y ��ǥ =" + y);
		
	}
	
}


//����
class SubPoint extends Point{
	
	String msg;
	
	public SubPoint() {
		super();//�����Ǿ� ����
		System.out.println("���� - ����Ʈ ������ ȣ��");
	}
	
	public SubPoint(int x, int y, String msg) {
		super(x,y);
		this.msg = msg;
		System.out.println("���� �����ִ� ������ ȣ��");
	}
	//�������̵�
	//�θ� ���� �޼ҵ带 �籸��
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
	}
}


public class PointTest_06 {

	public static void main(String[] args) {
		SubPoint sp1 = new SubPoint();
		sp1.write();
		
		SubPoint sp2 = new SubPoint(100, 500, "�����մϴ�");
		sp2.write();
	}

}
