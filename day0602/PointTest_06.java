package day0602;

//슈퍼
class Point{
	//디폴트 값으로
	int x;
	int y;
	
	public Point() {
		System.out.println("슈퍼 - 디폴트 생성자 호출");
	}
	public Point(int x, int y) {
		System.out.println("슈퍼 - 인자있는 생성자");
		this.x = x;
		this.y = y;
		
	}
	
	public void write() {
		System.out.println("x 좌표 = " + x + ", y 좌표 =" + y);
		
	}
	
}


//서브
class SubPoint extends Point{
	
	String msg;
	
	public SubPoint() {
		super();//생략되어 있음
		System.out.println("서브 - 디폴트 생성자 호출");
	}
	
	public SubPoint(int x, int y, String msg) {
		super(x,y);
		this.msg = msg;
		System.out.println("서브 인자있는 생성자 호출");
	}
	//오버라이딩
	//부모가 가진 메소드를 재구현
	@Override
	public void write() {
		// TODO Auto-generated method stub
		super.write();
	}
}


public class PointTest_06 {

	public static void main(String[] args) {
		SubPoint sp1 = new SubPoint();
		sp1.write();
		
		SubPoint sp2 = new SubPoint(100, 500, "해피합니다");
		sp2.write();
	}

}
