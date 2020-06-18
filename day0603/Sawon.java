package day0603;

public class Sawon {

	private String sawonName;
	private int giboSu, timeSu, familySu;
	
	//생성자 ; 항상 가장 먼저
	public Sawon(String sname, int gSu, int tSu, int fSu) {
		sawonName = sname;
		giboSu = gSu;
		timeSu = tSu;
		familySu = fSu;
	}
	//가족 수당.. 3인미만은 5만원, 이상은 7만원.
	public int getFamsu() //int는 리턴값 줄것.
	{
		if(familySu <3)
			return 50000;
		else
			return 70000;
	}
	
	//초과수당은 초과시간 * 2만원(단 5시간 이상은 무조건 10만원)
	public int getTimesu()
	{
		if(timeSu < 5)
			return timeSu * 20000;
		else
			return 100000;
	}
	//총급여
	public int getTotalPay()
	{
		return giboSu + getFamsu() + getTimesu();
	}
	
	//출력문
	public void getSawon()
	{
		System.out.println(sawonName + "\t" + giboSu + "\t" + getFamsu() + "\t" + getTimesu()
							+ "\t" + getTotalPay());
	}
	
	
}
