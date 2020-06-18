package day0604;

public class ThreadTest_04 implements Runnable{

	String name;
	int num;
	
	//������
	public ThreadTest_04(String name, int num) {
		this.name = name;
		this.num = num;
	}
	
	public void run()
	{
		for(int i = 0; i <= num; i++)
		{
			System.out.println(name + "===>" + i);
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Runnable �������̽��� ������ Ŭ���� ����
		ThreadTest_04 th1 = new ThreadTest_04("one", 300);
		ThreadTest_04 th2 = new ThreadTest_04("two", 300);
		ThreadTest_04 th3 = new ThreadTest_04("three", 300);
		
		//Thread�� ����
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		Thread t3 = new Thread(th3);
		
		//start()�� Runnable���¿��� �����췯�� ���ؼ� �ϳ��� Running���°� �ȴ�.
		//������ �߱�������.
//		th1.run();
//		th2.run();
//		th3.run();
//		th1.start();
//		th2.start();
//		th3.start();
		t1.start();
		t2.start();
		t3.start();
		

	}

}
