package day0604;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIOReader_05 {

	public static void main(String[] args) {
		//경로 \\ or /
		String filePath = "C:\\java_0526\\JavaProject\\JavaProject\\src\\day0601\\CardTest_01";
				
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr=new FileReader(filePath);
			System.out.println("파일을 찾았어요!!!!");
			
			//br생성
			br=new BufferedReader(fr);
			
			while(true)
			{
				//파일에서 한줄씩 읽는다
				String line=br.readLine();
				
				//문서의 끝으로가면 null값반환
				if(line==null)
					break;
				//파일에서읽은 한줄 출력
				System.out.println("★"+line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("파일을 찾을수 없네요~~"+e.getMessage());
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
