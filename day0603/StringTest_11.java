package day0603;

public class StringTest_11 {

	public static void main(String[] args) {
		//� ������ Ÿ���̵� String ��ü�� ��ȯ�� �����ϴ�
		int a = 100;
		String aa = a + "ddd"; //���� + ���� = ����	
//		String aa = String.valueOf(a);	//���������� ��ȯ
	
		char[]b = {'a', 'p', 'p', 'l', 'e'};
		String bb = String.valueOf(b);
		
		System.out.println(aa);
		System.out.println(bb);
		
		String str = "Happy day wonderful!!";
		System.out.println(str.length()); //����	
		
		//subString
		System.out.println(str.substring(6, 9));
		System.out.println(str.substring(10));
		
		//replace(a, b); a�� b�� ��ȯ�Ѵ�.
		System.out.println(str.replace("Happy", "Nice"));
		
		
	}
}
