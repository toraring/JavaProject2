package day0602;

class Food{
	private String menu;
	private int price;
	
	static int menuno;
	
//	static final String TITLE = "식당";
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
	
	//생성자 2개짜리 만드는 경우
	//set 메소드
	public void setMenu(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	//get 메소드
	public void getMenu() {
		menuno++;
		System.out.println("[메뉴 : " + menuno + "]");
		System.out.println("메뉴명: " + menu);
		System.out.println("가격: " + price);
	}
	
	//get메소드를 활용한 출력문.
	
}


public class FoodTest {

	public static void main(String[] args) {
		// 생성
		Food spa = new Food();
		spa.setMenu("스파게티", 15000);
		spa.getMenu();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Food pi = new Food();
		spa.setMenu("피자	", 18000);
		spa.getMenu();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		Food sal = new Food();
		spa.setMenu("샐러드", 12000);
		spa.getMenu();
		
		
//		Food spa = new Food();
//		spa.setMenu("스파게티");
//		spa.setPrice(18000);
//		
//		Food pa = new Food();
//		pa.setMenu("파스타");
//		pa.setPrice(15000);
//		
//		Food sal = new Food();
//		sal.setMenu("샐러드");
//		sal.setPrice(12000);
//		
//		
//		
//		System.out.println("[메뉴_]" + menuno);
//		System.out.println("메뉴명: " + spa.getMenu());
//		System.out.println("가격: " + spa.getPrice());
//		System.out.println("--------------------------------");
//		System.out.println(Food.menuno);
//		System.out.println("메뉴명: " + pa.getMenu());
//		System.out.println("가격: " + pa.getPrice());
//		System.out.println("--------------------------------");
//		System.out.println(Food.menuno);
//		System.out.println("메뉴명: " +sal.getMenu());
//		System.out.println("가격: " + sal.getPrice());
		
		
		
		
	}

}
