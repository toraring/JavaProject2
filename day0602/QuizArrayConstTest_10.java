package day0602;

class info{
	private String name;
	private String blood;
	private int age;
	
	//생성자
	public info(String n, String b, int a) {
		this.name = n;
		this.blood = b;
		this.age = a;
	}
	//제목출력
	public static void title() {
		System.out.println("총 4명 정보출력");
		System.out.println("이름" + "\t" + "혈액형" + "\t" + "나이");
		System.out.println("================================");	
	}
	
	//애들 출력
	public void getInfo() {
		// TODO Auto-generated method stub
		System.out.println(name + "\t" + blood + "\t" + age + "세");
		
	}
}


public class QuizArrayConstTest_10 {
	
	public static void main(String[] args) {
		info[]inf = new info[4];
		inf[0] =  new info("이수연", "B형", 17);
		inf[1] =  new info("홍길동", "AB형", 41);
		inf[2] =  new info("김수현", "O형", 25);
		inf[3] =  new info("김남일", "B형", 33);
	
		//출력
		info.title();
		for(int i = 0; i < inf.length; i++)
		{
			inf[i].getInfo();
		}
		
	}

}
