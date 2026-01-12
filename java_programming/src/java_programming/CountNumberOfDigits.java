package java_programming;

import java.util.Scanner;

public class CountNumberOfDigits {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();
		int count=0;
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number od Digidts : "+count);
		sc.close();
	}
}
