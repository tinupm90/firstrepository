package javaprojects;

public class Pgm28B {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm28B p=new  Pgm28B();
		p.area(3);
		p.area(20, 30);
		p.area(4.0f);

	}
	
	void area(int a) {
		float pi=3.14f;
		float area=pi*a*a;
		System.out.println("Area of circle="+area);
		
		
	}
	void area(int a,int b) {
		int area=a*b;
		System.out.println("Area of Rectangle="+area);
		
		
		
	}
	
	void area(float a) {
		float area=a*a;
		System.out.println("Area of Square="+area);
		
		
		
	}

}
