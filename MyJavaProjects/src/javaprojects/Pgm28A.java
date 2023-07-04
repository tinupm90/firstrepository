package javaprojects;

public class Pgm28A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pgm28A p=new Pgm28A();                                                                                                                                                 
		p.average(20,30,40);
		p.average(20.4f, 30.2f, 40.4f);

	}
	void average(int a,int b,int c) {
	
		
		int avg=(a+b+c)/3;
		System.out.println("Average of three integer numbers="+avg);
		
		
	}
	
void average(float a,float b,float c) {
	
		
		float avg=(a+b+c)/3;
		System.out.println("Average of three float numbers="+avg);
		
		
	}

}
