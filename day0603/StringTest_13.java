package day0603;

public class StringTest_13 {

	public static void main(String[] args) {
		//StringBuffer; ���ڿ� ���� �� ��������� �߰��� �ڷ���
		StringBuffer sb = new StringBuffer();
		sb.append("Happy");
		sb.append("Nice");
		sb.append(200);
		sb.append(2.34);
		sb.append('A');		
		
		//����
		sb.insert(3, "Apple");// 3�� �ε��� �տ� ������ ������ ��.
		
		//����
		sb.delete(0, 3); //0~2 ��°���� ������
		
		//��ü
		sb.replace(6, 10, "Angel"); // 6~9 ��° ���� ��ü��
		
		System.out.println(sb);
	}
}
