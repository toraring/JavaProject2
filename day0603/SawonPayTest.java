package day0603;

import java.util.Scanner;

public class SawonPayTest {

	public static void main(String[] args) {
		// 스캐너
		Scanner sc = new Scanner(System.in);
		Sawon sawon;
		String name;
		int gibon, famsu, tsu;
		
		System.out.println("사원명은?");
		name = sc.nextLine();
		System.out.println("기본급은?");
		gibon = sc.nextInt();
		System.out.println("총 가족수는?");
		famsu = sc.nextInt();
		System.out.println("총 시간 외 근무시간은?");
		tsu = sc.nextInt();
		
		//생성
		sawon = new Sawon(name, gibon, famsu, tsu);
		
		//제목출력
		System.out.println("사원명 \t기본급 \t가족수당 \t시간 외 수당   총급여");
		
		//생성한 참조변수를 통해 메소드 호출
		sawon.getSawon();
		
		/*
		 * Sawon.getSawon gs = new Sawon.getSawon()
		 */		
	}

}
