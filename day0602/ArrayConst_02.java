package day0602;

class Shop{
	private String sangpum;
	private int price;
	private String color;
	
	//������
	public Shop(String s, int p, String c) { //�ۺ����̵�� �ϸ� �ȵ�. �׷� null����
		this.sangpum = s;
		this.price = p;
		this.color = c;
	}	
	
	//���� ���η� ����
	public static void showTitle () //static�� �ؿ��� �������� ����Ǵ� 
	{
		System.out.println("��ǰ��\t�ܰ�\t����");
		System.out.println("===========================");
	}
	//��ǰ��¹�
	public void getSangpum() { //�����̺� ������ ������ ��
//		System.out.println(s + "\t" + p + "\t" + c);
		System.out.println(sangpum + "\t" + price + "\t" + color);
	}
	
	
	
}

public class ArrayConst_02 {

	public static void main(String[] args) {
		Shop []sh = new Shop [5]; //5���� ������ ���̶�� �ּҸ� �Ҵ�(�ʱⰪ null)
		sh[0] = new Shop("���콺", 15000, "����");
		sh[1] = new Shop("���ǽ�", 10000, "���");
		sh[2] = new Shop("���뽺", 5000, "����");
		sh[3] = new Shop("û����", 15000, "�Ķ�");
		sh[4] = new Shop("����", 20000, "��ȫ");
		
		//���
		Shop.showTitle(); //Ŭ������.�޼���� Ŭ���� �޼��� ȣ�Ⱑ��
		for(int i = 0; i < sh.length; i++)
		{
			sh[i].getSangpum();
		}

	}

}
