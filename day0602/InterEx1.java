package day0602;

public class InterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//���� ū������ ����(����)		
		InterABImpl int1 = new InterABImpl();
		int1.draw();
		int1.write();
		int1.play();
		
		//���������� �����Ͽ� ���
		Inter_A inA = new InterABImpl();
		inA.play();
		inA.draw();
		
		Inter_B inB= new InterABImpl();
		inB.write();
		

	}

}
