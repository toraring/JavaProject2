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
			System.out.println("�ϱ⾲��");
			
		}
		
		@Override
		public void play() {
			System.out.println("�����ϱ�");
			
		}
	};
	
}


public class AnonymousTEst_05 {

	public static void main(String[] args) {
		// �͸���Ŭ�������� �ϼ��� �߻�޼ҵ� �ҷ�����
		/*����; InterA ina = new InterEx(). new InterA(); */
		InterEx ex = new InterEx();
		ex.ina.play();
		ex.ina.write();
		
		
	}

}
