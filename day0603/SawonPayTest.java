package day0603;

import java.util.Scanner;

public class SawonPayTest {

	public static void main(String[] args) {
		// ��ĳ��
		Scanner sc = new Scanner(System.in);
		Sawon sawon;
		String name;
		int gibon, famsu, tsu;
		
		System.out.println("�������?");
		name = sc.nextLine();
		System.out.println("�⺻����?");
		gibon = sc.nextInt();
		System.out.println("�� ��������?");
		famsu = sc.nextInt();
		System.out.println("�� �ð� �� �ٹ��ð���?");
		tsu = sc.nextInt();
		
		//����
		sawon = new Sawon(name, gibon, famsu, tsu);
		
		//�������
		System.out.println("����� \t�⺻�� \t�������� \t�ð� �� ����   �ѱ޿�");
		
		//������ ���������� ���� �޼ҵ� ȣ��
		sawon.getSawon();
		
		/*
		 * Sawon.getSawon gs = new Sawon.getSawon()
		 */		
	}

}
