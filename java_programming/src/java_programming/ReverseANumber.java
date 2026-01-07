package java_programming;

import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int num=sc.nextInt();
		
		//Logic 1:Using Algorithm
		int rev=0;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		
		//Logic 2:Using StringBuffer Class
//		StringBuffer sb= new StringBuffer(String.valueOf(num));
//		StringBuffer rev=sb.reverse();
		
		//Logic 3:Using StringBuilder Class
//		StringBuilder stB=new StringBuilder();
//		stB.append(num);
//		StringBuilder rev=stB.reverse();
		
		System.out.println("Reverse numbers is : "+rev);
		sc.close();	
		}
}
