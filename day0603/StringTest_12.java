package day0603;

import java.util.Scanner;

public class StringTest_12 {
	
	public static void main(String[] args) {
		
		String [] names = {"�赿��", "�輱��", "�̼���", "�����", "�ּ���", "������", "������"};
		
		Scanner sc = new Scanner(System.in);
		String name;// = " ";
		int cnt;
		
		while(true)
		{
			System.out.println("�˻��� �̸��� �Է� (�Ϻθ��� ����)");
			name = sc.nextLine(); 
			
			if(name.equalsIgnoreCase("q"))
			{
				System.out.println("�����մϴ�");
				break;
			}
			cnt = 0;
			
			for(String s : names)
			{
				if(s.startsWith(name)) //ù���� 
				{
					cnt++;
					System.out.println(s);
				}
			}
			
			System.out.println("�� " + cnt + "���� �ֽ��ϴ�.");
		}
		
	}

}
