package javaprograms;

import java.util.Scanner;

public class FourWaysToSwapIntegers 
{
	public static void swapWithTempVariable(int a, int b) 
	{
		//1. Using Temp Variable
		int temp = a;  //5
		a = b;		   //10
		b = temp;	   //5
		
		System.out.println("*****After Swapping*****");
		System.out.println("The Value of A: " + a);
		System.out.println("The Value of B: " + b);
	}
	
	public static void swapUsingAdditionOperator(int a, int b) 
	{
		//2. Without Using Temp Variable By Using + Operator
		a = a + b;  //15
		b = a - b;  //5
		a = a - b;  //10
		
		System.out.println("*****After Swapping*****");
		System.out.println("The Value of A: " + a);
		System.out.println("The Value of B: " + b);
	}
	
	public static void swapUsingMultiplicationtionOperator(int a, int b) 
	{
		//3. Without Using Temp Variable By Using * Operator
		a = a * b;  //50
		b = a / b;  //5
		a = a / b;  //10
		
		System.out.println("*****After Swapping*****");
		System.out.println("The Value of A: " + a);
		System.out.println("The Value of B: " + b);
	}
	
	public static void swapUsingXOROperator(int a, int b) 
	{
		//4. Without Using Temp Variable By Using ^ Operator
		a = a ^ b;  
		b = a ^ b;  
		a = a ^ b;  
		
		System.out.println("*****After Swapping*****");
		System.out.println("The Value of A: " + a);
		System.out.println("The Value of B: " + b);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of A: ");
		int a = sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b = sc.nextInt();
		
		System.out.println("*****Before Swapping*****");
		System.out.println("The Value of A: " + a);
		System.out.println("The Value of B: " + b);
		
		//swapWithTempVariable(a, b);
		
		//swapUsingAdditionOperator(a, b);
		
		//swapUsingMultiplicationtionOperator(a, b);
	
		swapUsingXOROperator(a, b);
		
		sc.close();
	}
}
