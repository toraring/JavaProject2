package day0602;


//�θ�Ŭ����
public class Employee_05 {
	
	private String name;
	private int salary;
	
	//������
	public Employee_05(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	//�޼ҵ�
	public String getEmployee() {
		return name + "," + salary;
	}
}
