package day0602;

class Food{
	private String menu;
	private int price;
	
	static int menuno;
	
//	static final String TITLE = "�Ĵ�";
//
//	public String getMenu() {
//		return menu;
//	}
//
//	public void setMenu(String menu) {
//		this.menu = menu;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
	
	//������ 2��¥�� ����� ���
	//set �޼ҵ�
	public void setMenu(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	//get �޼ҵ�
	public void getMenu() {
		menuno++;
		System.out.println("[�޴� : " + menuno + "]");
		System.out.println("�޴���: " + menu);
		System.out.println("����: " + price);
	}
	
	//get�޼ҵ带 Ȱ���� ��¹�.
	
}


public class FoodTest {

	public static void main(String[] args) {
		// ����
		Food spa = new Food();
		spa.setMenu("���İ�Ƽ", 15000);
		spa.getMenu();
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		Food pi = new Food();
		spa.setMenu("����	", 18000);
		spa.getMenu();
		System.out.println("�ѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤѤ�");
		
		Food sal = new Food();
		spa.setMenu("������", 12000);
		spa.getMenu();
		
		
//		Food spa = new Food();
//		spa.setMenu("���İ�Ƽ");
//		spa.setPrice(18000);
//		
//		Food pa = new Food();
//		pa.setMenu("�Ľ�Ÿ");
//		pa.setPrice(15000);
//		
//		Food sal = new Food();
//		sal.setMenu("������");
//		sal.setPrice(12000);
//		
//		
//		
//		System.out.println("[�޴�_]" + menuno);
//		System.out.println("�޴���: " + spa.getMenu());
//		System.out.println("����: " + spa.getPrice());
//		System.out.println("--------------------------------");
//		System.out.println(Food.menuno);
//		System.out.println("�޴���: " + pa.getMenu());
//		System.out.println("����: " + pa.getPrice());
//		System.out.println("--------------------------------");
//		System.out.println(Food.menuno);
//		System.out.println("�޴���: " +sal.getMenu());
//		System.out.println("����: " + sal.getPrice());
		
		
		
		
	}

}
