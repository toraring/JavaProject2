package day0603;

import java.io.InputStream;

public class ExceptionTest_08 {

	public static void main(String[] args) {
		//InputStream: ����Ʈ ���� �Է� �ֻ��� Ŭ���� - �߻�Ŭ���� �̹Ƿ�, ��ü�� ���� ������.
		//�ڽ�Ŭ������ �޾Ƽ� ���� ����.
		//read(): �� ����Ʈ�� �д´�.
		//read(byte[] b) - ����ڰ� ������ ����Ʈ�� �̿��ؼ� �Ѳ����� ���ϴ� ��ŭ �б� ����.
		
		InputStream is = System.in;
		int a = 0; 
		System.out.println("�� ���� �Է�: ");

		try {
			a = is.read();	
		} catch (Exception e) {
			System.out.println("����: " + e.getMessage());
		}
		System.out.println("3�� �ڿ� ����մϴ�");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("�Է°�: " + (char)a);

	}

}
