package javaprojects;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String s1="";
		int a=s.length()-1;
		

		for(int i=a;i>=0;i--){

		s1=s1+s.charAt(i);

		}
		//System.out.println(s1);
		s1=s1.toUpperCase();
		s=s.toUpperCase();
		if (s.equals(s1)){
		System.out.print("Palindrome");
		}else {
			System.out.print("Not Palindrome");}

	}

}
