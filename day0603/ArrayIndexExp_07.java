package day0603;

public class ArrayIndexExp_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String []str = {"apple", "bananan", "Oragne", "kiwi"};
		
		System.out.println("���ʴ�� ���");
		
		for(int i = 0; i <= str.length; i++)
		{
			try {
				System.out.println(str[i]);				
			} catch (ArrayIndexOutOfBoundsException e) {
				// exception �߻��� �����ڵ�
				System.out.println("�迭�䱸: " + e.getMessage());
			}
		}
		
		//�ݺ�������..
		System.out.println("�Ųٷ� ���");
		for(int i = str.length; i >= 0; i--) {
			try {				
				System.out.println(str[i]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("�Ųٷ� ��� �� ���� : " + e.getMessage());
			}
		}
	}

}
