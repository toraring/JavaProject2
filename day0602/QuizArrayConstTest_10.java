package day0602;

class info{
	private String name;
	private String blood;
	private int age;
	
	//������
	public info(String n, String b, int a) {
		this.name = n;
		this.blood = b;
		this.age = a;
	}
	//�������
	public static void title() {
		System.out.println("�� 4�� �������");
		System.out.println("�̸�" + "\t" + "������" + "\t" + "����");
		System.out.println("================================");	
	}
	
	//�ֵ� ���
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(name + "\t" + blood + "\t" + age + "��");
		
	}
}


public class QuizArrayConstTest_10 {
	
	public static void main(String[] args) {
		info[]inf = new info[4];
		inf[0] =  new info("�̼���", "B��", 17);
		inf[1] =  new info("ȫ�浿", "AB��", 41);
		inf[2] =  new info("�����", "O��", 25);
		inf[3] =  new info("�賲��", "B��", 33);
	
		//���
		info.title();
		for(int i = 0; i < inf.length; i++)
		{
			inf[i].getInfo();
		}
		
	}

}
