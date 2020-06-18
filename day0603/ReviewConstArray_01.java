package day0603;

class Score{
	private String name;
	private String age;
	private int java;
	private int	jsp;
	
	static int no;
	
	
	//생성자 4개
	public Score(String n, String a, int ja, int js) {
		this.name = n;
		this.age = a;
		this.java = ja;
		this.jsp = js;
	}
	
	public static void title(){
//		System.out.println("번호" + "\t" + "이름"+ "\t" + "나이" + "\t"+ "java" 
//	+ "\t"+ "jsp" + "\t"+ "합계" + "\t" + "평균");
		System.out.println("번호\t이름\t나이\tjava\tjsp\t합계\t평균");
		System.out.println("====================================================");
	} //자료형이 있는 것은 반드시 리턴값을 준다.
	public int getTot() {
		int tot = java + jsp;
		return tot;
	}
	public double getAvg() {
		double avg = getTot() / 2.0 ;
		return avg;
	}
	
	
	public void getScore() {
//		내가푼 답
//		int tot = java + jsp;
//		double avg = tot / 2;
//		no++;
//		System.out.println(no + "\t" + name + "\t" + age + "\t" + java+"점" + "\t" + jsp+"점"
//				+ "\t" + tot+"점" + "\t" + avg+"점");
		no++;
		System.out.println(no + "\t" + name + "\t" + age + "\t" + java+"점\t" + jsp+"점\t"
				+ getTot()+"점\t" + getAvg()+"점");
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
	}
	//
	
}



public class ReviewConstArray_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열
		
		Score[]sc = new Score[5];
		sc[0] = new Score("이지선", "22세", 88, 99);
		sc[1] = new Score("강호동", "32세", 55, 67);
		sc[2] = new Score("유재석", "34세", 98, 56);
		sc[3] = new Score("송가인", "25세", 33, 77);
		sc[4] = new Score("이지선", "22세", 88, 99);
		
		Score.title();
		{
			for(int i = 0; i < sc.length; i++)
				sc[i].getScore();
		}
		
	}

}
