package java_programming;

public class Swapping2Numbers {
	public static void main(String[] args) {
		int a=10, b=20;
		
		System.out.println("Before swapping the numbers "+a+" "+b);
		//Logic 1:- With third variable
		int t=a;
			a=b;
			b=t;
		//Logic 2:- Without third variable and here use '+' & '-'
			a=a+b;
			b=a-b;
			a=a-b;
		//Logic3:-  Without third variable and here use '*' & '/'
			a=a*b;
			b=a/b;
			a=a/b;
		//Logic 4:- Only 1 statement
			b=a+b-(a=b);
		System.out.println("After swapping the numbers "+a+" "+b);	
	}
}
