package javaprojects;

public class Pgm29A {
	 Pgm29A(int a,int b,int c) {
		// TODO Auto-generated constructor stub
		int avg=(a+b+c)/3;
		System.out.println("Average of three integer numbers="+avg);
		
	}
	 Pgm29A(Float a,Float b,Float c) {
			// TODO Auto-generated constructor stub
			Float avg=(a+b+c)/3;
			System.out.println("Average of three integer numbers="+avg);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pgm29A p=new Pgm29A(2,3,4);
		Pgm29A p2=new Pgm29A(2.5f,3.5f,4f);

	}

}
