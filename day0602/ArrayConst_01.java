package day0602;

class Student_01{
	private String stuName;
	private String hp;
	private int score;
	
	//생성자 3개짜리
	public Student_01(String stuName, String hp, int socre) {	
		this.stuName = stuName;
		this.hp = hp;
		this.score = score;
	}

//	public void Student_01(String name, String hp, int score) {
//	}
	
	//한꺼번에 출력가능한 get 메소드
	public void getData() {
		System.out.println("학생명: " + stuName);
		System.out.println("핸드폰: " + hp);
		System.out.println("점수: " + score);
	}
	
}


public class ArrayConst_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열로 생성
		Student_01 []stu = new Student_01[4];
		stu[0] = new Student_01("송혜교", "010-5555-5555", 66);
		stu[1] = new Student_01("김민혁", "010-455-444", 100);
		stu[2] = new Student_01("김용", "010-556-555", 58);
		stu[3] = new Student_01("나나", "010-996-555", 68);
		
		//출력
		for(int i = 0; i<stu.length; i++)
		{
			stu[i].getData();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
		}
		
//		for(Student_01 s:stu)
//		{
//			s.getData();
//			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
//		}

	}

}
