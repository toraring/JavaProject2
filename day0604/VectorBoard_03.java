package day0604;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_03 {

	Vector<BoardDTO>list = new Vector<BoardDTO>();
	//Ŭ������ �����̹Ƿ� �����͸� ������ ���� ���� Ŭ����
	
	//�ٷ���(�������� ������?)�� ���� ���� void
	//1.�Է��� ���� ���� ��쿡 �ش��ϴ� �޼ҵ�
	public void setBoard()
	{
		Scanner sc = new Scanner(System.in);
		String name, subject, content; //Ű���� �Է��� ����
		System.out.println("�ۼ��ڴ�?");
		name = sc.nextLine();
		
		System.out.println("������?");
		subject = sc.nextLine();
		System.out.println("������?");
		content = sc.nextLine();
		
		//����
		BoardDTO data = new BoardDTO(name, subject, content);
		
		//���Ϳ� ��´�.. add�� �̿�
		list.add(data);
		
		System.out.println("���� ������ ����: " + list.size() + "��");		
	}
	
	
	//2.����� ���� ���� ��쿡 �ش��ϴ� �޼ҵ�
	//set get�� �Ѱ��� ����ϳ� �������� �Ƚᵵ��,
	public void getBoard()
	{
		System.out.println("***�Խ���***");
		System.out.println("------------------------------");

		for(int i = 0; i < list.size(); i ++)
		{
			//����Ʈ ���� ������ ��ġ�� �ִ� ��Ұ��� �����ش�.
			BoardDTO b = list.get(i);
			
			//���
			System.out.println("No." + (i+1) + "\t�ۼ���: " + b.getName());
			System.out.println("����: " + b.getSubject());
			System.out.println("����: " + b.getContent());
			System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//����
		VectorBoard_03 vt = new VectorBoard_03();
		int n = 0; //1,2�� ������ ��ȣ�Է�
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("1.�Է�    2.���        0.����");
			n = sc.nextInt();
			
			if(n==1)
				vt.setBoard();
			else if(n == 2)
				vt.getBoard();
			else if(n == 0)
			{
				System.out.println("�����մϴ�");
				break;
			}
			
		}
		
		
	}

}








