package day0603;

public class Sawon {

	private String sawonName;
	private int giboSu, timeSu, familySu;
	
	//������ ; �׻� ���� ����
	public Sawon(String sname, int gSu, int tSu, int fSu) {
		sawonName = sname;
		giboSu = gSu;
		timeSu = tSu;
		familySu = fSu;
	}
	//���� ����.. 3�ι̸��� 5����, �̻��� 7����.
	public int getFamsu() //int�� ���ϰ� �ٰ�.
	{
		if(familySu <3)
			return 50000;
		else
			return 70000;
	}
	
	//�ʰ������� �ʰ��ð� * 2����(�� 5�ð� �̻��� ������ 10����)
	public int getTimesu()
	{
		if(timeSu < 5)
			return timeSu * 20000;
		else
			return 100000;
	}
	//�ѱ޿�
	public int getTotalPay()
	{
		return giboSu + getFamsu() + getTimesu();
	}
	
	//��¹�
	public void getSawon()
	{
		System.out.println(sawonName + "\t" + giboSu + "\t" + getFamsu() + "\t" + getTimesu()
							+ "\t" + getTotalPay());
	}
	
	
}
