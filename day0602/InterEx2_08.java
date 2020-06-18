package day0602;

interface InterAA{
	
	public void draw();
	public void play();

}

////////////////////////////////////
interface InterBB extends InterAA{
	
	public void write();
}
///////////////////////////////////
class InterImpl implements InterBB{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("그림그리기-");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		System.out.println("게임하기");
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("숙제하기");
		
	}
	
	
}

/////////////////////////////////////
public class InterEx2_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterABImpl int1 = new InterABImpl();
		int1.draw();
		int1.play();
		int1.write();

	}

}
