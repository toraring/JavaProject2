package day0602;

//자식클래스
public class Manager_05 extends Employee_05	{
	
	String depart;
	public Manager_05(String name, int salary, String dept) {
		super(name, salary);
		depart = dept;	
	}
	
	//부모의 메서드를 물려받아 자식클래스에서 완성.. 오버라이딩
	@Override
	public String getEmployee() {
		// TODO Auto-generated method stub
		return super.getEmployee() + "," + depart;
	}

}
