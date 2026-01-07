package java_programming;

public class Reverse_String {
	public static void main(String[] args) {
		String str="ABCD";
		String rev="";
		
//		Logic 1: Using String concatenation operator
		int len=str.length();
		
		for(int i=len-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		
//		Logic 2: Using char Array
		char a[]=str.toCharArray();
		int length=a.length;
		for(int i=length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		
//		Logic 3: Using String Buffer Class
		StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());
		
		//This stmt is used for logic 1&2
		System.out.println("Reverse String : "+rev);
	}
} 