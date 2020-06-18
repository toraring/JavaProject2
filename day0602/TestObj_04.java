package day0602;

import day0602_1.SuperObj_04;

class SubObj_04 extends SuperObj_04 {
	private String addr;
	
	public SubObj_04() {
		super();
		
		// super()가 생략된 것
		// 디폴트 생성자 만들때 super()가 자동으로 
		//먼저나오므로 슈퍼에서 디폴트 생성자를 새로 만들어 에러방지
	}

	public SubObj_04(String name, int age, String addr) {
		super(name, age); //반드시 첫줄... 부모의 생성자 호출
		this.addr = addr;
		
	}
	//출력 메소드
	public void writeData() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("주소: " + addr);
	}
	
}



public class TestObj_04 {

	public static void main(String[] args) {
		
		//생성
		SubObj_04 sub1 = new SubObj_04("이효리", 33, "제주");
		sub1.writeData();
		
		

	}

}
