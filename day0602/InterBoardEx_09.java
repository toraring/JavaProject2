package day0602;

import java.util.Scanner;

interface Command{
	public void write();
	
}
////////////////////////////////////
class Insert implements Command	{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 추가합니다.");
	}
	
}
////////////////////////////////
class Modify implements Command	{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 수정합니다.");
	}
	
}
////////////////////////////////////
class Delete implements Command	{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판의 게시물을 삭제합니다.");
	}
	
}
//////////////////////////////////
class List implements Command{

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("게시판에 게시물을 조회합니다.");
	}
	
	
}
////////////////////////////////////



public class InterBoardEx_09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Command comm = null;
		int n;
		
		while(true) {
			
			System.out.println("1.추가. 2.수정. 3.삭제. 4.조회. 5.종료.");
			n = sc.nextInt();
			
			switch (n) {
			case 1:
				comm = new Insert();
				break;
			case 2:
				comm = new Modify();
				break;
			case 3:
				comm = new Delete();
				break;
			case 4:
				comm = new List();
				break;
			default:
				System.out.println("종료합니다");
				break;
			}
		
			if(n <= 4) 
				comm.write(); //1,2,3,4 출력
			else 
				break;
				
			
					
		
		}
		
	}
}
