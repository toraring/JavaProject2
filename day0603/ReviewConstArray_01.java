package day0603;

class Score{
	private String name;
	private String age;
	private int java;
	private int	jsp;
	
	static int no;
	
	
	//������ 4��
	public Score(String n, String a, int ja, int js) {
		this.name = n;
		this.age = a;
		this.java = ja;
		this.jsp = js;
	}
	
	public static void title(){
//		System.out.println("��ȣ" + "\t" + "�̸�"+ "\t" + "����" + "\t"+ "java" 
//	+ "\t"+ "jsp" + "\t"+ "�հ�" + "\t" + "���");
		System.out.println("��ȣ\t�̸�\t����\tjava\tjsp\t�հ�\t���");
		System.out.println("====================================================");
	} //�ڷ����� �ִ� ���� �ݵ�� ���ϰ��� �ش�.
	public int getTot() {
		int tot = java + jsp;
		return tot;
	}
	public double getAvg() {
		double avg = getTot() / 2.0 ;
		return avg;
	}
	
	
	public void getScore() {
//		����Ǭ ��
//		int tot = java + jsp;
//		double avg = tot / 2;
//		no++;
//		System.out.println(no + "\t" + name + "\t" + age + "\t" + java+"��" + "\t" + jsp+"��"
//				+ "\t" + tot+"��" + "\t" + avg+"��");
		no++;
		System.out.println(no + "\t" + name + "\t" + age + "\t" + java+"��\t" + jsp+"��\t"
				+ getTot()+"��\t" + getAvg()+"��");
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
	}
	//
	
}



public class ReviewConstArray_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭
		
		Score[]sc = new Score[5];
		sc[0] = new Score("������", "22��", 88, 99);
		sc[1] = new Score("��ȣ��", "32��", 55, 67);
		sc[2] = new Score("���缮", "34��", 98, 56);
		sc[3] = new Score("�۰���", "25��", 33, 77);
		sc[4] = new Score("������", "22��", 88, 99);
		
		Score.title();
		{
			for(int i = 0; i < sc.length; i++)
				sc[i].getScore();
		}
		
	}

}
