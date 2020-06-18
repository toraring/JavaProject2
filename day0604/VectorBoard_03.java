package day0604;

//import com.sun.org.apache.xalan.internal.xsltc.compiler.sym;

import java.util.Scanner;
import java.util.Vector;

public class VectorBoard_03 {

	Vector<BoardDTO>list = new Vector<BoardDTO>();
	//클래스형 지정이므로 데이터를 꺼내고 받을 때도 클래스
	
	//꾸러미(여러개의 생성자?)로 들어올 때는 void
	//1.입력을 누를 때의 경우에 해당하는 메소드
	public void setBoard()
	{
		Scanner sc = new Scanner(System.in);
		String name, subject, content; //키보드 입력할 변수
		System.out.println("작성자는?");
		name = sc.nextLine();
		
		System.out.println("제목은?");
		subject = sc.nextLine();
		System.out.println("내용은?");
		content = sc.nextLine();
		
		//생성
		BoardDTO data = new BoardDTO(name, subject, content);
		
		//벡터에 담는다.. add를 이용
		list.add(data);
		
		System.out.println("현재 데이터 갯수: " + list.size() + "개");		
	}
	
	
	//2.출력을 누를 때의 경우에 해당하는 메소드
	//set get시 한개면 써야하나 여러개면 안써도됨,
	public void getBoard()
	{
		System.out.println("***게시판***");
		System.out.println("------------------------------");

		for(int i = 0; i < list.size(); i ++)
		{
			//리스트 내의 지정된 위치에 있는 요소값을 돌려준다.
			BoardDTO b = list.get(i);
			
			//출력
			System.out.println("No." + (i+1) + "\t작성자: " + b.getName());
			System.out.println("제목: " + b.getSubject());
			System.out.println("내용: " + b.getContent());
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//생성
		VectorBoard_03 vt = new VectorBoard_03();
		int n = 0; //1,2번 선택할 번호입력
		Scanner sc = new Scanner(System.in);
		
		
		while(true)
		{
			System.out.println("1.입력    2.출력        0.종료");
			n = sc.nextInt();
			
			if(n==1)
				vt.setBoard();
			else if(n == 2)
				vt.getBoard();
			else if(n == 0)
			{
				System.out.println("종료합니다");
				break;
			}
			
		}
		
		
	}

}








