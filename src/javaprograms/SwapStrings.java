package javaprograms;

public class SwapStrings 
{
	public static void main(String[] args) 
	{
		//Program to Swap Strings Using Temporary/Third Variable.
		String a = "Hello";
		String b = "World";
		
		System.out.println("*****Before Swapping*****");
		System.out.println("The Value of A: " + a);
		System.out.println("The Value of B: " + b);
		
		//1. Append A & B
		a = a + b; //HelloWorld
		
		//2. Store Initial String A in String B
		b = a.substring(0, a.length() - b.length());
		
		//3. Store Initial String B in String A
		a = a.substring(b.length());
		
		System.out.println("*****After Swapping*****");
		System.out.println("The Value of A: " + a);
		System.out.println("The Value of B: " + b);
	}
}
