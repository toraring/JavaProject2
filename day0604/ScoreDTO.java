package day0604;

public class ScoreDTO {

	private String name;
	private int java;
	private int spring;
	
	//디폴트 생성자 ; 아무것도 없는 public
	public ScoreDTO() {
		
	}
	
	//3개 생성자 ; string or int로 지정한 public->후에 this. 생성할 것.
	//생성자_ 반드시 인스턴스변수 = 인자값(파라메타값)
	public ScoreDTO(String name, int java, int spring) {
		this.name = name;
		this.java = java;
		this.spring= spring;
	}

	//각각의 setter getter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getSpring() {
		return spring;
	}

	public void setSpring(int spring) {
		this.spring = spring;
	}
	
	//타이틀.. static메소드는 클래스명.메소드명으로 접근가능
	public static void title()
	{
		System.out.println("No\t학생명\t자바\t스프링\t평균\t평가");
	}
	
	//평균구하는 메소드
	public double getAvg()
	{
		double avg = (java + spring) / 2.0;
		return avg; //return값은 메소드 만들때 자료형과 일치해야함.
	}
	
	//평가메소드
	public String getPeonga()
	{
		if(getAvg() >= 90)
			return "잘했어";
		else if(getAvg() >= 80)
			return "더 노력해";
		else
			return "재수강";
	}
	
	
}
