package java_programming;

import java.util.Scanner;

public class For_Practice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Character");
		String a=sc.nextLine();
		String rev="";
		int len=a.length();
		
		for(int i=len-1;i>=0;i-- ) {
			rev=rev+a.charAt(i);
		}
		System.out.println("String Reverse : "+rev);
		sc.close();
	}
}
