package day0604;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileIO_05 {
	
	public static void main(String[] args) {
		
		BufferedReader br = null;
		InputStreamReader ir = null;
		
		ir = new InputStreamReader(System.in);
		br = new BufferedReader(ir);
		
		String str = "";
		
		System.out.println("���ڿ��� �Է��ϼ���");
		try {
			str = br.readLine(); //���پ� �о�´� 	
			System.out.println("�Է��� ���ڿ� ==>" + str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //Ʈ���� �ٽ��ѹ� 
			try {
				br.close();
				ir.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}

}
}
  	