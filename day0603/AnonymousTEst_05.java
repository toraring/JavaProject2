package day0603;

interface InterA{
	public void write();
	public void play();
	
}
///////////////////////////////////////////////
class InterEx{
	
	InterA ina = new InterA() {
		
		@Override
		public void write() {
			System.out.println("일기쓰기");
			
		}
		
		@Override
		public void play() {
			System.out.println("게임하기");
			
		}
	};
	
}


public class AnonymousTEst_05 {

	public static void main(String[] args) {
		// 익명내부클래스에서 완성된 추상메소드 불러오기
		/*오답; InterA ina = new InterEx(). new InterA(); */
		InterEx ex = new InterEx();
		ex.ina.play();
		ex.ina.write();
		
		
	}

}
