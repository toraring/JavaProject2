package day0603;
//������ �������� �ʴ� ������. ��� �ߺ���� �ȵ�.
//

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetTest_13 {

	public static void main(String[] args) {
		
		//(�������̽���) <��������> ��ü�̸� = new Ŭ������ <��������>();
		Set<String> set = new HashSet<String>(); //�ݵ�� ũ���� 
		
		set.add("���");
		set.add("�ٳ���");
		set.add("���");
		set.add("Ű��");
		set.add("������");
		
		System.out.println("������ ����: " + set.size());
		//������ ��Ҹ� �����ִ� int��
		
		System.out.println("���");
		Iterator<String> iter = set.iterator(); //set�� �÷��Ǹ�
		
		while (iter.hasNext())//���̻� �����Ͱ� ������ false�� ��ȯ
		{
			String s = iter.next(); //�������� �̵��԰� ���ÿ� ������ ��ȯ.\
			System.out.println(s);
			if(set.isEmpty())
			
				System.out.println("set �ȿ� �����Ͱ� ����");
			else
				System.out.println("set �ȿ� �����Ͱ� �ִ�.");
				
		}
		
	set.clear(); //��� ������ ����
	}
	
	
}
