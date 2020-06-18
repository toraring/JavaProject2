package day0602_1;

class SuperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c = new Child();
		c.method;
	}

}

class Parent {
	int x =10;
	
}

class child extends Parent{
	void method() {
		System.out.println("x =" + x);
		System.out.println("this.x =" + this.x);
		System.out.println("super.x = " + super.x);
	}
}
