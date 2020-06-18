package day0602;

class Shop{
	private String sangpum;
	private int price;
	private String color;
	
	//생성자
	public Shop(String s, int p, String c) { //퍼블릭보이드로 하면 안됨. 그럼 null나옴
		this.sangpum = s;
		this.price = p;
		this.color = c;
	}	
	
	//제목 가로로 나열
	public static void showTitle () //static은 밑에도 공통으로 적용되니 
	{
		System.out.println("상품명\t단가\t색상");
		System.out.println("===========================");
	}
	//상품출력문
	public void getSangpum() { //프라이빗 값으로 가져올 것
//		System.out.println(s + "\t" + p + "\t" + c);
		System.out.println(sangpum + "\t" + price + "\t" + color);
	}
	
	
	
}

public class ArrayConst_02 {

	public static void main(String[] args) {
		Shop []sh = new Shop [5]; //5개를 생성할 것이라는 주소만 할당(초기값 null)
		sh[0] = new Shop("블라우스", 15000, "빨강");
		sh[1] = new Shop("원피스", 10000, "노랑");
		sh[2] = new Shop("레깅스", 5000, "검정");
		sh[3] = new Shop("청바지", 15000, "파랑");
		sh[4] = new Shop("셔츠", 20000, "분홍");
		
		//출력
		Shop.showTitle(); //클래스명.메서드로 클래스 메서드 호출가능
		for(int i = 0; i < sh.length; i++)
		{
			sh[i].getSangpum();
		}

	}

}
