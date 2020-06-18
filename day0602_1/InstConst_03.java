package day0602_1;

import java.util.Calendar;

import day0602.InstTest;

public class InstConst_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		InstTest t1 = new InstTest(); //오류... private이라서 패키지가 다를 경우 생성이 안됨.
		
		InstTest t1 = InstTest.getInstance();
		t1.writeMessage();
		
//		Calendar cal = new Calendar();
	}

}
