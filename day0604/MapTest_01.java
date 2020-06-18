package day0604;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest_01 {

	//key��, value���� ã�´�.
	//������ �������� �ʴ´�.
	//Ű�� �ߺ�������� �ʰ�, ���� �ߺ������.
	public static void main(String[] args) {
		
		Map<String, String>map = new HashMap<String, String>();
		map.put("name", "��ȣ��");
		map.put("age", "23"); //���ڶ� �ʿ����� �������·� ������
		map.put("addr", "����� ���α�"); 
		
		//���� Ű������ ������ ���� ���� �����ʹ� ������
		map.put("name", "����");
		
		System.out.println("����: " + map.size());
		System.out.println("�̸�: " + map.get("name"));
		System.out.println("����: " + map.get("age"));
		System.out.println("�ּ�: " + map.get("addr"));
	
		//�ʿ��� ���� Ű���̶� null�� ����
		System.out.println("������: " + map.get("blood"));  
		
		//Ű���� ���� �Ѳ����� ���� �� ���� ��� ���
		Set<String>keyset = map.keySet();
		
		System.out.println("1.���");
		Iterator<String>keyiter = keyset.iterator();
		while(keyiter.hasNext())
		{
			String key = keyiter.next();
			System.out.println(key + "===>" + map.get(key));
		}
		
		System.out.println("2.���");
		for(String key : keyset) //�÷��ǿ��� ���� ����
		{
			System.out.println(key + "==>" + map.get(key));
		}
		
	}
}
