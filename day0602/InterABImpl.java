package day0602;

//다중구현이 가능하다. 오버라이딩도 할 것.
public class InterABImpl implements Inter_A, Inter_B{
	@Override	
	public void draw() {
		System.out.println("나는 일기를 씁니다.");
		
	}@Override
		public void play() {
		System.out.println("그림을 그린다");
		
	}@Override
		public void write() {
		System.out.println("축구를 합니다");
			
	}
	
}
