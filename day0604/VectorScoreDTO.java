package day0604;

import java.util.Scanner;
import java.util.Vector;import javax.xml.crypto.Data;

public class VectorScoreDTO {
	//���̺������� ���� ���� �� �ִ� �ٷ���
	//�ٷ��̿� Ŭ������ ����...�׷� �������� Ŭ������.
	Vector<ScoreDTO>list = new Vector<ScoreDTO>();
	
	
	/*
	 * public VectorScoreDTO(String name, int java, int spring) { // TODO
	 * Auto-generated constructor stub }
	 */
	
//1. �����Է��� ������ �� ���� �̸�, ���� 2���� �Է��� �޼ҵ�
	public void setScore() {
		Scanner sc = new Scanner(System.in);
		String name;
		int java, spring;
		
		
		System.out.println("�̸���?");
		name = sc.nextLine();
		System.out.println("�ڹ� ������?");
		java = sc.nextInt();
		System.out.println("������ ������?");
		spring = sc.nextInt();
		
		//DTOŬ������ ����
		ScoreDTO dto = new ScoreDTO(name, java, spring);
		list.add(dto); //���Ͳٷ��̿� ScoreDTO�� ��ڴ�.		
	}

//2. ���輺���� ��¤�����
	public void getScore() {		
//		System.out.println("���� ������ ���� :" + list.size() + "��");
		System.out.println("[��������]");
		ScoreDTO.title(); //static �޼ҵ�� �������.. ��¹� �� �� �� �־ ������.
		System.out.println("===================");
//		System.out.println("\t" + "�̸�\t" + "�ڹ�\t" + "������\t" + "���\t" + "��");

		for(int i = 0; i < list.size(); i++) {
			ScoreDTO s = list.get(i);
//			double avg = s.getJava() + s.getSpring();
			System.out.println(i+1 + "\t"+ s.getName() + "\t" +  s.getJava()  + "\t"+  + s.getSpring()
			 + "\t"+  s.getAvg()  + "\t"+ s.getPeonga());
				System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
			
		}
	}
	
	public static void main(String[] args) {
		//����.. 1.�����Է� 2.������� �޼ҵ带 ������� VectorScore�̹Ƿ� �����ؾߵȴ�.
		VectorScoreDTO vs = new VectorScoreDTO();
		Scanner sc = new Scanner(System.in);
		
		int n = 0 ; // 1,2,9�� �Է�
		
		while(true)
		{
			System.out.println("1. �����Է� 	2.���. 	9.����");
			n = sc.nextInt();
			if( n == 1)
				vs.setScore();
			else if (n==2)
				vs.getScore();
			else if (n == 9)
			{
				System.out.println("����");
			}
		}
	}
	
	
}
