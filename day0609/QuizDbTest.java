package day0609;

import java.util.Scanner;

public class QuizDbTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int no, date;
		String na, gr, ti, con;
		
		System.out.println("이름은?");
		na = sc.nextLine();
		System.out.println("소속반은??");
		gr = sc.nextLine();
		System.out.println("모임 제목은?");
		ti = sc.nextLine();
		System.out.println("내용은?");
		con = sc.nextLine();
		
		QuizDb qu = new QuizDb(name, group, title, contents);
		
		System.out.println("이름\t소속\t제목\t내용");
		QuizDb.getQuizDb

	}

}
