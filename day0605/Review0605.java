package day0605;

public class Review0605 {

	public static void test1()
		{	
		int sum =0;
		for(int i = 0; i < 50; i++)
			{	
				sum += i;
			}
		System.out.println("1~50���� ���� "  + sum);
		}
	//////////////////////////////
	
	public static void test2()
	{
		int sum = 0;
		for(int i = 0; i <= 10; i+=2)
		{
			sum += i ;
			System.out.println(i + ":" + sum);
		}
		System.out.println("1~10���� 2�� ��� ���� " + sum);
	}

////////////////////////////////////////

	public static void test3()
	{
		int sum = 0;
		float average = 0f;
		int []score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++)
		{
			sum += score[i];		
			for(int f = 0; f < score.length; f++) 
			{	
				average = sum / 5f;
			}
		}
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + average);
	}
//////////////////////////////////////////////
	
	public static void test4()
	{
		int []score = {55, 66, 77, 54, 100, 85, 95};
		int max = score[0];
		int min = score[0];
		
		for(int i = score.length-1; i>0; i--) {			
			for(int j = 0; j<i; j++) 
			{
				if(score[i]<score[j]) {
					int temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			System.out.println(score[i]);//�������� 
		}
		
		for(int i = 0; i<score.length; i++)
		{
			if(max < score[i])
				max = score[i];
			if(min > score[i])
				min = score[i];
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
//		System.out.println("�ִ밪 : " + score[j]);
//		System.out.println("�ּҰ� : " + score[i]);
		
	

	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		test4();
	}
}
