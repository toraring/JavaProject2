package day0602;

class Student_01{
	private String stuName;
	private String hp;
	private int score;
	
	//������ 3��¥��
	public Student_01(String stuName, String hp, int socre) {	
		this.stuName = stuName;
		this.hp = hp;
		this.score = score;
	}

//	public void Student_01(String name, String hp, int score) {
//	}
	
	//�Ѳ����� ��°����� get �޼ҵ�
	public void getData() {
		System.out.println("�л���: " + stuName);
		System.out.println("�ڵ���: " + hp);
		System.out.println("����: " + score);
	}
	
}


public class ArrayConst_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�迭�� ����
		Student_01 []stu = new Student_01[4];
		stu[0] = new Student_01("������", "010-5555-5555", 66);
		stu[1] = new Student_01("�����", "010-455-444", 100);
		stu[2] = new Student_01("���", "010-556-555", 58);
		stu[3] = new Student_01("����", "010-996-555", 68);
		
		//���
		for(int i = 0; i<stu.length; i++)
		{
			stu[i].getData();
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
		}
		
//		for(Student_01 s:stu)
//		{
//			s.getData();
//			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
//		}

	}

}
