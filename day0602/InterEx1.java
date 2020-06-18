package day0602;

public class InterEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//가장 큰것으로 생성(서브)		
		InterABImpl int1 = new InterABImpl();
		int1.draw();
		int1.write();
		int1.play();
		
		//다형성으로 생성하여 출력
		Inter_A inA = new InterABImpl();
		inA.play();
		inA.draw();
		
		Inter_B inB= new InterABImpl();
		inB.write();
		

	}

}
