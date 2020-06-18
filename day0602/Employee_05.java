package day0602;


//부모클래스
public class Employee_05 {
	
	private String name;
	private int salary;
	
	//생성자
	public Employee_05(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//메소드
	public String getEmployee() {
		return name + "," + salary;
	}
}
