package day0604;

import java.util.Scanner;
import java.util.Vector;import javax.xml.crypto.Data;

public class VectorScoreDTO {
	//테이블형태의 값을 담을 수 있는 꾸러미
	//꾸러미에 클래스를 담음...그럼 꺼낼때도 클래스임.
	Vector<ScoreDTO>list = new Vector<ScoreDTO>();
	
	
	/*
	 * public VectorScoreDTO(String name, int java, int spring) { // TODO
	 * Auto-generated constructor stub }
	 */
	
//1. 시험입력을 눌렀을 때 실제 이름, 성적 2개를 입력할 메소드
	public void setScore() {
		Scanner sc = new Scanner(System.in);
		String name;
		int java, spring;
		
		
		System.out.println("이름은?");
		name = sc.nextLine();
		System.out.println("자바 점수는?");
		java = sc.nextInt();
		System.out.println("스프링 점수는?");
		spring = sc.nextInt();
		
		//DTO클래스를 생성
		ScoreDTO dto = new ScoreDTO(name, java, spring);
		list.add(dto); //벡터꾸러미에 ScoreDTO를 담겠다.		
	}

//2. 시험성적을 출력ㄱㅌㅌ
	public void getScore() {		
//		System.out.println("현재 데이터 갯수 :" + list.size() + "개");
		System.out.println("[시험점수]");
		ScoreDTO.title(); //static 메소드로 제목출력.. 출력문 한 줄 더 넣어도 무관함.
		System.out.println("===================");
//		System.out.println("\t" + "이름\t" + "자바\t" + "스프링\t" + "평균\t" + "평가");

		for(int i = 0; i < list.size(); i++) {
			ScoreDTO s = list.get(i);
//			double avg = s.getJava() + s.getSpring();
			System.out.println(i+1 + "\t"+ s.getName() + "\t" +  s.getJava()  + "\t"+  + s.getSpring()
			 + "\t"+  s.getAvg()  + "\t"+ s.getPeonga());
				System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
		}
	}
	
	public static void main(String[] args) {
		//생성.. 1.시험입력 2.시험출력 메소드를 만든곳이 VectorScore이므로 생성해야된다.
		VectorScoreDTO vs = new VectorScoreDTO();
		Scanner sc = new Scanner(System.in);
		
		int n = 0 ; // 1,2,9번 입력
		
		while(true)
		{
			System.out.println("1. 성적입력 	2.출력. 	9.종료");
			n = sc.nextInt();
			if( n == 1)
				vs.setScore();
			else if (n==2)
				vs.getScore();
			else if (n == 9)
			{
				System.out.println("종료");
			}
		}
	}
	
	
}
