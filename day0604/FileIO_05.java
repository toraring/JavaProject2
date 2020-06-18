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
		
		System.out.println("문자열을 입력하세요");
		try {
			str = br.readLine(); //한줄씩 읽어온다 	
			System.out.println("입력한 문자열 ==>" + str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally { //트라이 다시한번 
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
  	